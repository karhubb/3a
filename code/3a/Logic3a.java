/**
 * Asignación de Programa: PSP 3A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-11-23]
 * Descripción: Clase para escribir resultados en archivos de salida
 */
import java.util.Scanner;

/**
 * Clase principal de lógica para el análisis de regresión lineal
 */
public class Logic3a {

    /**
     * Método principal que ejecuta el análisis de regresión lineal
     * Solicita al usuario el nombre del archivo y realiza todos los cálculos
     */
    public void logic3a() {
        // Crear scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el nombre del archivo a analizar
        System.out.print("Ingrese el nombre del archivo a analizar: ");
        String fileName = scanner.nextLine();
        
        // Crear instancias de las clases necesarias para el análisis
        Input myInput = new Input();          // Para leer archivos
        Data myData = new Data();             // Para procesar datos
        EstimacionCorLineal calculadora = new EstimacionCorLineal(); // Para cálculos
        Output output = new Output();         // Para escribir resultados
        
        // Leer el contenido del archivo especificado por el usuario
        String fileContent = myInput.readData(fileName);
        
        // Verificar si el archivo se leyó correctamente
        if (fileContent.isEmpty()) {
            System.out.println("Error: No se pudo leer el archivo " + fileName);
            scanner.close(); // Cerrar scanner antes de salir
            return; // Salir del método si hay error
        }
        
        // Convertir el contenido del archivo en un array de líneas
        String[] linesArray = myData.saveData(fileContent);
        
        // Procesar los datos para extraer valores de X e Y
        double[] datosX = new double[linesArray.length]; // Array para valores X
        double[] datosY = new double[linesArray.length]; // Array para valores Y
        
        // Recorrer cada línea del archivo
        for (int i = 0; i < linesArray.length; i++) {
            String line = linesArray[i].trim(); // Eliminar espacios en blanco
            
            // Saltar líneas vacías
            if (line.isEmpty()) {
                continue;
            }
            
            // Dividir la línea por espacios o tabs para separar X e Y
            String[] partes = line.split("\\s+");
            
            // Verificar que la línea tenga exactamente dos valores
            if (partes.length == 2) {
                try {
                    // Convertir primera parte a double (valor X)
                    datosX[i] = Double.parseDouble(partes[0]);
                    // Convertir segunda parte a double (valor Y)
                    datosY[i] = Double.parseDouble(partes[1]);
                } catch (NumberFormatException e) {
                    // Manejar error si los valores no son números válidos
                    System.out.println("Error en línea " + (i+1) + ": " + line);
                }
            }
        }
        
        // Realizar todos los cálculos de regresión lineal
        calculadora.sumX(datosX);        // Calcular suma de X
        calculadora.sumY(datosY);        // Calcular suma de Y
        calculadora.sumXY(datosX, datosY); // Calcular suma de X*Y
        calculadora.sumXX(datosX);       // Calcular suma de X^2
        calculadora.sumYY(datosY);       // Calcular suma de Y^2
        calculadora.getAvgX(datosX);     // Calcular promedio de X
        calculadora.getAvgY(datosY);     // Calcular promedio de Y
        calculadora.getB1();             // Calcular coeficiente B1
        calculadora.getB0();             // Calcular coeficiente B0
        calculadora.setDblXk(386);       // Establecer Xk = 386
        calculadora.getYk();             // Calcular Yk estimado
        calculadora.getRXY();            // Calcular coeficiente de correlación
        
        // Calcular R^2 (coeficiente de determinación)
        double rCuadrado = calculadora.getDblRXY() * calculadora.getDblRXY();
        
        // Crear el mensaje de resultados
        final String result = "Resultados del análisis de regresión lineal:\n" +
                       "B1: " + String.format("%.6f", calculadora.getDblB1()) + "\n" +
                       "B0: " + String.format("%.6f", calculadora.getDblB0()) + "\n" +
                        "Yk estimado: " + String.format("%.2f", calculadora.getDblYk()) + "\n" +
                       "r: " + String.format("%.6f", calculadora.getDblRXY()) + "\n" +
                       "r^2: " + String.format("%.6f", rCuadrado) + "\n";

        
        // Escribir los resultados en un archivo de salida
        output.writeData("Out3.txt", result);
        
        // Mostrar los resultados en la consola
        System.out.println("\n" + result);
        
        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}