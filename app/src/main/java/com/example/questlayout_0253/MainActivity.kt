package com.example.questlayout_0253

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questlayout_0253.ui.theme.ActivitasPertama
import com.example.questlayout_0253.ui.theme.QuestLayout_0253Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestLayout_0253Theme {
                ActivitasPertama()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ActivitasPertamaPreview() {
    QuestLayout_0253Theme {
        ActivitasPertama()
    }
}