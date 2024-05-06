import java.io.File

class FilesManagement: IFiles {
    override fun existeDir(ruta: String): String {
        TODO("Not yet implemented")
    }

    override fun existeFic(ruta: String): String {
        TODO("Not yet implemented")
    }

    override fun escribir(fichero: File, info: String): String {
        TODO("Not yet implemented")
    }

    override fun leer(fichero: File): List<String>? {
        TODO("Not yet implemented")
    }

    override fun crearDir(ruta: String): String {
        TODO("Not yet implemented")
    }

    override fun crearFic(ruta: String, info: String, sobreescribir: Boolean): File? {
        TODO("Not yet implemented")
    }

    override fun buscarUltimoFicheroEmpiezaPor(directorio: File, nombreFicheroInicio: String): File? {
        TODO("Not yet implemented")
    }

    override fun buscarUltimoFicheroEmpiezaFinalizaPor(
        directorio: File,
        empiezaPor: String,
        terminaPor: String
    ): File? {
        TODO("Not yet implemented")
    }

    override fun buscarInfoFichero(fichero: File, info: String): String? {
        TODO("Not yet implemented")
    }
}