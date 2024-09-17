import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cliente
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente, 1000); // Saldo inicial de 1000

        // Interacción con el cliente a través de un menú
        int opcion;

        // Ciclo para mostrar el menú hasta que el usuario elija salir
        do {
            mostrarMenu(cliente);
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + cliente.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cliente.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    cliente.retirar(retiro);
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestra aplicación bancaria.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 4.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Metodo para mostrar el menú
    public static void mostrarMenu(Cliente cliente) {
        System.out.println("\nBienvenido(a), " + cliente.getNombre());
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
    }
}