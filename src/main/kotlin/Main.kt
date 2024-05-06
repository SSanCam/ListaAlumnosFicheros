import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

/**
 * Programa principal para la ventana 'My Students'
 *
 */

fun main() = application {

    val windowState = rememberWindowState(size = DpSize(800.dp, 1200.dp))
    val icon = BitmapPainter(useResource("rubberduck.png", ::loadImageBitmap))

    var showMyStudents by remember { mutableStateOf(true) } // Ventana My Students

    if (showMyStudents) {
        MyStudentsWindow(icon = icon, state = windowState, onClose = { showMyStudents = false }, onClick = {
            TODO("Resto de logica de la ventana.")
        })
    }

     // Si [showMyStudents] [false], cerramos la ventana.

    if (!showMyStudents) {
        exitApplication()
    }
}
