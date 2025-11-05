import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.window.*

@Composable
fun App() {
    var message by remember { mutableStateOf("안녕하세요 ☀️") }

    MaterialTheme {
        Button(onClick = { message = "날씨를 불러오는 중..." }) {
            Text(message)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "WeatherView") {
        App()
    }
}
