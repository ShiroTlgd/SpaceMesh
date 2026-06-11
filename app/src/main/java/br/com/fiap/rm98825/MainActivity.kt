package br.com.fiap.rm98825

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.fiap.rm98825.navigation.AppNavigation
import br.com.fiap.rm98825.ui.theme.SpacemeshTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            SpacemeshTheme {

                AppNavigation()

            }
        }
    }
}