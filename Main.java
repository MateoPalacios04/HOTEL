package udla.mmje.poo.hotel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("\n--- Sistema de Gestión Hotelera ---");
            System.out.println("1. Crear reserva");
            System.out.println("2. Consultar disponibilidad");
            System.out.println("3. Mostrar reservas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Número de habitación a reservar: ");
                    int numHabitacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.println(hotel.crearReserva(numHabitacion, cliente));
                    break;
                case 2:
                    System.out.print("Número de habitación a consultar: ");
                    int numConsulta = scanner.nextInt();
                    boolean disponible = hotel.consultarDisponibilidad(numConsulta);
                    System.out.println("La habitación " + numConsulta + " está " + (disponible ? "disponible." : "ocupada."));
                    break;
                case 3:
                    System.out.println("\nReservas actuales:");
                    hotel.mostrarReservas();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}