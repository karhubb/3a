/**
 * Asignación de Programa: PSP 3A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-11-23]
 * Descripción: Clase para escribir resultados en archivos de salida
 */

/**
 * Clase para escribir resultados en archivos
 */
public class Output {

    /**
     * Escribe texto en un archivo especificado
     * @param outFile nombre del archivo de salida
     * @param outText texto a escribir en el archivo
     */
    public void writeData(String outFile, String outText) {
        // Usar try-with-resources para asegurar que el BufferedWriter se cierre automáticamente
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(outFile))) {
            bw.write(outText); // Escribir el texto en el archivo
        } catch (java.io.IOException e) {
            // Manejar excepciones de entrada/salida mostrando el error
            e.printStackTrace();
        }
    }
}