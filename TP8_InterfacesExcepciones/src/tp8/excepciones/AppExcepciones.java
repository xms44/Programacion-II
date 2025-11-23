package tp8.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AppExcepciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1) División segura
        System.out.println("1) Division segura");
        try {
            System.out.print("Ingrese el dividendo: ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el divisor: ");
            int b = scanner.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }

        scanner.nextLine(); // limpiar buffer

        // 2) Conversión de cadena a número
        System.out.println("\n2) Conversion de cadena a numero");
        System.out.print("Ingrese un número entero: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número válido.");
        }

        // 3) Lectura de archivo (FileNotFoundException)
        System.out.println("\n3) Lectura de archivo");
        System.out.print("Ingrese el nombre del archivo a leer (por ej. datos.txt): ");
        String nombreArchivo = scanner.nextLine();

        try {
            leerArchivo(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo: " + e.getMessage());
        }

        // 4) Excepción personalizada EdadInvalidaException
        System.out.println("\n4) Validacion de edad con excepcion personalizada");
        System.out.print("Ingrese una edad: ");
        int edad = scanner.nextInt();

        try {
            validarEdad(edad);
            System.out.println("Edad válida.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.nextLine(); // limpiar

        // 5) try-with-resources
        System.out.println("\n5) Lectura con try-with-resources");
        System.out.print("Ingrese el nombre del archivo a leer nuevamente: ");
        String nombreArchivo2 = scanner.nextLine();

        leerArchivoConTryWithResources(nombreArchivo2);

        scanner.close();
    }

    // Ejercicio 3: lectura de archivo
    private static void leerArchivo(String nombreArchivo)
            throws FileNotFoundException, IOException {

        FileReader fr = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;
        System.out.println("--- Contenido del archivo ---");
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
        fr.close();
    }

    // Ejercicio 4: validar edad
    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " es inválida.");
        }
    }

    // Ejercicio 5: try-with-resources
    private static void leerArchivoConTryWithResources(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("--- Contenido del archivo (try-with-resources) ---");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado (" + e.getMessage() + ")");
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo: " + e.getMessage());
        }
    }
}
