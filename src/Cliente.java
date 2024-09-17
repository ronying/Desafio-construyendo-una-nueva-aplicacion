public class Cliente {
    private String nombre;
    private double saldo;

    public Cliente(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }

    // Obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado $" + cantidad);
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }
}