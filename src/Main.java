public class Main {
    public static void main(String[] args) {

        int suma = 0; // declaro la variable

        // declaro la variable e inicializar la variable del ciclo; la condicion; valor de i en cuanto va a incrementar
        for (int i = 1; i <= 10; i++)
            suma += i; // Sumar i a suma

        System.out.println("La suma de los numeros del 1 al 10 es: " + suma);
    }
}