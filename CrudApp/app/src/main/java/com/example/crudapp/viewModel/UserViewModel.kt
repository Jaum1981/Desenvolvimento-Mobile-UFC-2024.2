package com.example.crudapp.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.crudapp.database.AppDatabase
import com.example.crudapp.models.User
import com.example.crudapp.repository.UserRepository
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


class UserViewModel(application: Application): AndroidViewModel(application) {

    private val repository: UserRepository

    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _users

    init {
        val userDao = AppDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        observeUsers()
    }

    private fun observeUsers() {
        viewModelScope.launch {
            repository.getAllUsers().collectLatest { userList ->
                _users.value = userList
            }
        }
    }

    fun deleteUser(user: User) {
        viewModelScope.launch {
            repository.deleteUser(user)
        }
    }

    fun updateUser(user: User) {
        viewModelScope.launch {
            repository.updateUser(user)
        }
    }

    fun addUser(user: User) {
        viewModelScope.launch {
            repository.insertUser(user)
        }
    }

}