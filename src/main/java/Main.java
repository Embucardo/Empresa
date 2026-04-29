import modelo.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente(
                "Juan",
                "Alonso",
                "Juan@email.com",
                LocalDate.of(2005, 5, 10)
        );

        // Crear tienda
        Tienda tienda = new Tienda();


        System.out.println("Edad del cliente: " + cliente.calcularEdad());


        cliente.realizarPedido(tienda, "Laptop");
    }
}