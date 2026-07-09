import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GimnasioConectado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== BIENVENIDO AL GIMNASIO CONECTADO ===");

        // 1. PASO API: Llamamos al método para mostrar el consejo motivacional

        mostrarConsejo();

        // 2. PASO LÓGICA: Pedir el nombre del miembro por consola
        System.out.print("Ingrese el nombre del nuevo miembro: ");
        String nombre = teclado.nextLine();

        // 3. PASO ARCHIVOS: Llamamos al método para guardar el nombre en el TXT
        guardarEnArchivo(nombre);

        System.out.println("\n=== PROGRAMA FINALIZADO ===");
        teclado.close();
    }

    /**
     * DESAFÍO 1 (API): Debe conectarse a internet y traer un consejo al azar.
     * URL de la API: https://api.adviceslip.com/advice
     */
    public static void mostrarConsejo() {
        // A. Crea el HttpClient (el mesero)

        // B. Construye la HttpRequest usando el patrón Builder (con .newBuilder(), .uri(), .GET() y .build())

        // C. Usa un bloque try-catch para enviar la petición con cliente.send(...)
        //    e imprime en pantalla la respuesta con .body()
        try {
            // Escribe tu código de envío aquí...

        } catch (Exception e) {
            System.out.println("No se pudo conectar a la API, pero ¡da tu mejor esfuerzo hoy!");
        }
    }

    /**
     * DESAFÍO 2 (ARCHIVOS): Debe tomar el nombre recibido y anotarlo en "gimnasio.txt".
     * Recuerda usar el modo 'append' (true) para no borrar los miembros anteriores.
     */
    public static void guardarEnArchivo(String nombreMiembro) {
        // A. Abre el bloque try-with-resources creando el BufferedWriter y el FileWriter
        //    Ejemplo: try (BufferedWriter escritor = new BufferedWriter(new FileWriter("gimnasio.txt", true)))
        try {
            // B. Escribe el nombre del miembro en el archivo

            // C. Haz un salto de línea (.newLine()) para que el siguiente miembro quede abajo

            // D. Muestra un mensaje en consola confirmando que se guardó en el disco duro

        } catch (IOException e) {
            System.out.println("Error crítico al escribir en el archivo: " + e.getMessage());
        }
    }
}