package ru.elkael.ci_cd_practic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import ru.elkael.ci_cd_practic.ui.theme.CICDPracticTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CICDPracticTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    Text(
                        text = "CI-CD-Practic [TEST]",
                    )
                }
            }
        }
    }
}