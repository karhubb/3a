/**
 * Asignación de Programa: PSP 3A
 * Nombre: [Karla Sofía Castro Pérez]
 * Fecha: [2025-11-23]
 * Descripción: Clase para escribir resultados en archivos de salida
 */
/**
 * Clase para realizar cálculos de estimación y correlación lineal
 */
public class EstimacionCorLineal {

    //
    // Campos
    //

    private double dblSumX;
    private double dblSumY;
    private double dblSumXY;
    private double dblSumXX;
    private double dblSumYY;
    private double dblAvgX;
    private double dblAvgY;
    private int intN;
    private double dblB1;
    private double dblRXY;
    private double dblB0;
    private double dblXk;
    private double dblYk;


    //
    // Métodos de acceso
    //

    /**
     * Establece el valor de dblSumX
     * @param newVar el nuevo valor de dblSumX
     */
    public void setDblSumX(double newVar) {
        dblSumX = newVar;
    }

    /**
     * Obtiene el valor de dblSumX
     * @return el valor de dblSumX
     */
    public double getDblSumX() {
        return dblSumX;
    }

    /**
     * Establece el valor de dblSumY
     * @param newVar el nuevo valor de dblSumY
     */
    public void setDblSumY(double newVar) {
        dblSumY = newVar;
    }

    /**
     * Obtiene el valor de dblSumY
     * @return el valor de dblSumY
     */
    public double getDblSumY() {
        return dblSumY;
    }

    /**
     * Establece el valor de dblSumXY
     * @param newVar el nuevo valor de dblSumXY
     */
    public void setDblSumXY(double newVar) {
        dblSumXY = newVar;
    }

    /**
     * Obtiene el valor de dblSumXY
     * @return el valor de dblSumXY
     */
    public double getDblSumXY() {
        return dblSumXY;
    }

    /**
     * Establece el valor de dblSumXX
     * @param newVar el nuevo valor de dblSumXX
     */
    public void setDblSumXX(double newVar) {
        dblSumXX = newVar;
    }

    /**
     * Obtiene el valor de dblSumXX
     * @return el valor de dblSumXX
     */
    public double getDblSumXX() {
        return dblSumXX;
    }

    /**
     * Establece el valor de dblSumYY
     * @param newVar el nuevo valor de dblSumYY
     */
    public void setDblSumYY(double newVar) {
        dblSumYY = newVar;
    }

    /**
     * Obtiene el valor de dblSumYY
     * @return el valor de dblSumYY
     */
    public double getDblSumYY() {
        return dblSumYY;
    }

    /**
     * Establece el valor de dblAvgX
     * @param newVar el nuevo valor de dblAvgX
     */
    public void setDblAvgX(double newVar) {
        dblAvgX = newVar;
    }

    /**
     * Obtiene el valor de dblAvgX
     * @return el valor de dblAvgX
     */
    public double getDblAvgX() {
        return dblAvgX;
    }

    /**
     * Establece el valor de dblAvgY
     * @param newVar el nuevo valor de dblAvgY
     */
    public void setDblAvgY(double newVar) {
        dblAvgY = newVar;
    }

    /**
     * Obtiene el valor de dblAvgY
     * @return el valor de dblAvgY
     */
    public double getDblAvgY() {
        return dblAvgY;
    }

    /**
     * Establece el valor de intN
     * @param newVar el nuevo valor de intN
     */
    public void setIntN(int newVar) {
        intN = newVar;
    }

    /**
     * Obtiene el valor de intN
     * @return el valor de intN
     */
    public int getIntN() {
        return intN;
    }

    /**
     * Establece el valor de dblB1
     * @param newVar el nuevo valor de dblB1
     */
    public void setDblB1(double newVar) {
        dblB1 = newVar;
    }

    /**
     * Obtiene el valor de dblB1
     * @return el valor de dblB1
     */
    public double getDblB1() {
        return dblB1;
    }

    /**
     * Establece el valor de dblRXY
     * @param newVar el nuevo valor de dblRXY
     */
    public void setDblRXY(double newVar) {
        dblRXY = newVar;
    }

    /**
     * Obtiene el valor de dblRXY
     * @return el valor de dblRXY
     */
    public double getDblRXY() {
        return dblRXY;
    }

    /**
     * Establece el valor de dblB0
     * @param newVar el nuevo valor de dblB0
     */
    public void setDblB0(double newVar) {
        dblB0 = newVar;
    }

    /**
     * Obtiene el valor de dblB0
     * @return el valor de dblB0
     */
    public double getDblB0() {
        return dblB0;
    }

    /**
     * Establece el valor de dblXk
     * @param newVar el nuevo valor de dblXk
     */
    public void setDblXk(double newVar) {
        dblXk = newVar;
    }

    /**
     * Obtiene el valor de dblXk
     * @return el valor de dblXk
     */
    public double getDblXk() {
        return dblXk;
    }

    /**
     * Establece el valor de dblYk
     * @param newVar el nuevo valor de dblYk
     */
    public void setDblYk(double newVar) {
        dblYk = newVar;
    }

    /**
     * Obtiene el valor de dblYk
     * @return el valor de dblYk
     */
    public double getDblYk() {
        return dblYk;
    }

    //
    // Otros métodos
    //

    /**
     * Calcula la suma de los valores de X
     * @param datosX array con los valores de X
     */
    public void sumX(double[] datosX) {
        double suma = 0; // Variable para acumular la suma
        // Recorrer todos los valores de X
        for (double valor : datosX) {
            suma += valor; // Sumar cada valor
        }
        this.dblSumX = suma; // Asignar la suma total
    }

    /**
     * Calcula la suma de los valores de Y
     * @param datosY array con los valores de Y
     */
    public void sumY(double[] datosY) {
        double suma = 0; // Variable para acumular la suma
        // Recorrer todos los valores de Y
        for (double valor : datosY) {
            suma += valor; // Sumar cada valor
        }
        this.dblSumY = suma; // Asignar la suma total
    }

    /**
     * Calcula la suma de los productos X*Y
     * @param datosX array con los valores de X
     * @param datosY array con los valores de Y
     */
    public void sumXY(double[] datosX, double[] datosY) {
        double suma = 0; // Variable para acumular la suma
        // Recorrer todos los pares de valores
        for (int i = 0; i < datosX.length; i++) {
            suma += datosX[i] * datosY[i]; // Multiplicar X*Y y sumar
        }
        this.dblSumXY = suma; // Asignar la suma total
    }

    /**
     * Calcula la suma de los cuadrados de X
     * @param datosX array con los valores de X
     */
    public void sumXX(double[] datosX) {
        double suma = 0; // Variable para acumular la suma
        // Recorrer todos los valores de X
        for (double valor : datosX) {
            suma += valor * valor; // Elevar al cuadrado y sumar
        }
        this.dblSumXX = suma; // Asignar la suma total
    }

    /**
     * Calcula la suma de los cuadrados de Y
     * @param datosY array con los valores de Y
     */
    public void sumYY(double[] datosY) {
        double suma = 0; // Variable para acumular la suma
        // Recorrer todos los valores de Y
        for (double valor : datosY) {
            suma += valor * valor; // Elevar al cuadrado y sumar
        }
        this.dblSumYY = suma; // Asignar la suma total
    }

    /**
     * Calcula el promedio de los valores de X
     * @param datosX array con los valores de X
     */
    public void getAvgX(double[] datosX) {
        double suma = 0; // Variable para acumular la suma
        // Recorrer todos los valores de X
        for (double valor : datosX) {
            suma += valor; // Sumar cada valor
        }
        this.dblAvgX = suma / datosX.length; // Calcular promedio
        this.intN = datosX.length; // Establecer el número de datos
    }

    /**
     * Calcula el promedio de los valores de Y
     * @param datosY array con los valores de Y
     */
    public void getAvgY(double[] datosY) {
        double suma = 0; // Variable para acumular la suma
        // Recorrer todos los valores de Y
        for (double valor : datosY) {
            suma += valor; // Sumar cada valor
        }
        this.dblAvgY = suma / datosY.length; // Calcular promedio
    }

    /**
     * Calcula el coeficiente B1 de la regresión lineal
     */
    public void getB1() {
        // Calcular numerador: (sumXY) - (n * promedioX * promedioY)
        double numerador = this.dblSumXY - (this.intN * this.dblAvgX * this.dblAvgY);
        // Calcular denominador: (sumXX) - (n * promedioX^2)
        double denominador = this.dblSumXX - (this.intN * this.dblAvgX * this.dblAvgX);
        // Calcular B1 dividiendo numerador entre denominador
        this.dblB1 = numerador / denominador;
    }

    /**
     * Calcula el coeficiente de correlación Rxy
     */
    public void getRXY() {
        // Calcular numerador: n*sumXY - (sumX)(sumY)
        double numerador = (this.intN * this.dblSumXY) - (this.dblSumX * this.dblSumY);
        // Calcular denominador parte 1: n*sumXX - (sumX)^2
        double parte1 = (this.intN * this.dblSumXX) - (this.dblSumX * this.dblSumX);
        // Calcular denominador parte 2: n*sumYY - (sumY)^2
        double parte2 = (this.intN * this.dblSumYY) - (this.dblSumY * this.dblSumY);
        // Calcular denominador completo: raíz cuadrada de (parte1 * parte2)
        double denominador = Math.sqrt(parte1 * parte2);
        // Calcular Rxy dividiendo numerador entre denominador
        this.dblRXY = numerador / denominador;
    }

    /**
     * Calcula el coeficiente B0 de la regresión lineal
     */
    public void getB0() {
        // Calcular B0: promedioY - (B1 * promedioX)
        this.dblB0 = this.dblAvgY - (this.dblB1 * this.dblAvgX);
    }

    /**
     * Calcula el valor estimado Yk para un Xk dado
     */
    public void getYk() {
        // Calcular Yk: B0 + (B1 * Xk)
        this.dblYk = this.dblB0 + (this.dblB1 * this.dblXk);
    }
}


