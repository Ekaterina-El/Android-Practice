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
import ru.elkael.feature_loger.TimberLogger

class MainActivity : ComponentActivity() {
    companion object { private const val TAG = "MainActivity" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        TimberLogger.init()
        setupUI()

        TimberLogger.i(TAG, "Main activity was created")
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    private fun setupUI() {
        enableEdgeToEdge()
        setContent {
            CICDPracticTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    Text(
                        text = "CI-CD-Practic",
                    )
                }
            }
        }
    }
}