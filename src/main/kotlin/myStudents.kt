import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import java.awt.Window

/**
 * My Students
 * Ventana para agregar o eliminar estudiantes de un fichero.
 *
 * @param icon [BitmapPainter] Es el icono que usaremos para la ventana.
 * @param state [WindowState] Indica las dimensiones de la ventana.
 * @param onClose
 * @param onClick
 */

@Composable
@Preview

fun MyStudentsWindow(icon: BitmapPainter, state: WindowState, onClose: () -> Unit, onClick: () -> Unit) {
    Window(
        onCloseRequest = onClose,
        title = "Second window",
        state = state,
        icon = icon
    ) {
        MaterialTheme {
            // Columna principal, tiene q componerse de la primera fila de dos columna y una segunda fila con el último botón
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                // Primera fila:
                Row(

                ){
                    // Primera columna, izquierda.
                    Column(

                    ){

                    }
                    // Segunda columna, derecha.
                    Column(

                    ){

                    }
                }

                // Segunda fila que contiene un único botón.
                Row(

                ){

                    Button(
                        onClick = onClick {

                        }
                    )
                    TODO("Botón final.")

                }
            }

        }

    }
}