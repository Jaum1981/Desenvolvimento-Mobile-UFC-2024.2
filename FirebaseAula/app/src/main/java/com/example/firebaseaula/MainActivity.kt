package com.example.firebaseaula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.firebaseaula.ui.theme.FirebaseAulaTheme
import com.example.firebaseaula.ui.view.ItemScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FirebaseAulaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxWidth(),
                    content = { paddingValues ->
                        ItemScreen(modifier = Modifier
                            .padding(paddingValues)
                            .padding(16.dp)
                        )
                    }
                )
            }
        }
    }
}
