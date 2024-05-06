import java.io.File

class FilesManagement : IFiles {
    /**
     * Verifica si el directorio existe o no
     *
     */
    override fun existeDir(ruta: String): String {
        TODO("Not yet implemented")
    }

    /**
     * Verifica si el fichero existe o no.
     * @param ruta
     * @return Cadena vacía en caso de que exista el fichero.
     */
    override fun existeFic(ruta: String): String {
        try {
            if (File(ruta).isDirectory) {
                return ""
            }
        } catch (e: SecurityException) {
            return "Error. El directorio no existe. $ruta: ${e.message}"
        }
        return "No existe el directorio."
    }

    override fun escribir(fichero: File, info: String): String {
        TODO("Not yet implemented")
    }

    override fun leer(fichero: File): List<String>? {
        TODO("Not yet implemented")
    }

    /**
     * CrearDir
     *
     * @param ruta Ruta donde se quiere crear el directorio.
     * @return Cadena vacía en caso de que se haya creado el directorio de manera satisfactorio.
     */
    override fun crearDir(ruta: String): String {
        // Variable con la dirección de la ruta
        val rutaDirectorio = File(ruta)

        try {
            // Comprobamos si existe el directorio, sino lo creamos.
            if (!rutaDirectorio.isDirectory) {
                if (!rutaDirectorio.mkdirs()) {
                    return "No ha sido posible crear el directorio."
                }
            }
        } catch (e: Exception) {
            return "No se ha podido crear la ruta del directorio."
        }
        return ""
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