package com.studioixa.kitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.studioixa.kitapp.ui.theme.KitappTheme
import com.studioixa.kitapp.ui.library.LibraryScreen  // Kütüphane ekranımızı burada kullanacağız

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KitappTheme {
                // Tema içerisindeki Surface, arka plan rengini tema üzerinden belirler
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // İlk ekran olarak kütüphane (Library) ekranımızı gösteriyoruz.
                    LibraryScreen()
                }
            }
        }
    }
}
