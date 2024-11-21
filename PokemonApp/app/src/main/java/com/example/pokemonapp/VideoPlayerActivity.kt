package com.example.pokemonapp

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

class VideoPlayerActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val videoRes = intent.getIntExtra("videoRes", R.raw.gengar_video)

            AndroidView(
                factory = { context ->
                    VideoView(context).apply {
                        // Configura URI do vídeo
                        setVideoURI(Uri.parse("android.resource://$packageName/${R.raw.gengar_video}"))

                        // Adiciona controles de reprodução
                        val mediaController = MediaController(context)
                        mediaController.setAnchorView(this)
                        setMediaController(mediaController)

                        // Inicia o vídeo
                        start()

                        // Listener para erro
                        setOnErrorListener { _, what, extra ->
                            println("Erro ao reproduzir o vídeo: what=$what, extra=$extra")
                            true // Indica que o erro foi tratado
                        }
                    }
                },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
