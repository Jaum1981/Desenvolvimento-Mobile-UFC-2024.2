package com.example.firebaseaula.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.snapshotFlow
import androidx.lifecycle.ViewModel
import com.example.firebaseaula.model.Item
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration

class ItemViewModel: ViewModel() {

    private val db = FirebaseFirestore.getInstance()

    private var listenerRegistration: ListenerRegistration? = null

    var items = mutableStateOf<List<Item>>(listOf())
        private set

    init {

    }

    private fun listenToItems() {
        listenerRegistration = db.collection("items")
            .addSnapshotListener { snapshot, exception ->
                if (exception != null) {
                    return@addSnapshotListener
                }

                if (snapshot != null) {
                    val fetchItems = snapshot.documents.map { doc ->
                     doc.toObject(Item::class.java)?.copy(id = doc.id)
                    }.filterNotNull()

                    items.value = fetchItems
                }
            }
    }

    fun addItem(item: Item) {
        db.collection("items").add(item)
    }

    fun deleteItem(itemId: String) {
        db.collection("items").document(itemId).delete()
    }

    //evitar chamadas desnecessárias
    override fun onCleared() {
        super.onCleared()
        listenerRegistration?.remove()
    }

    fun updateItem(item: Item) {
        db.collection("items")
            .document(item.id)
            .set(item)
            .addOnSuccessListener {
            Log.d("viewmodel", "Item atualizado com sucesso")
        }
            .addOnFailureListener { exception ->
                Log.d("viewmodel", "Erro ao atualizar item", exception)
        }
    }

}