import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    // Agregar un cliente al banco
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Obtener un cliente por nombre
    public Cliente obtenerCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null; // Cliente no encontrado
    }
}
