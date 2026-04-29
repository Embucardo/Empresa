

import modelo.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        String email = JOptionPane.showInputDialog("Email:");

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes:"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día:"));

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        Cliente cliente = new Cliente(nombre, apellido, email, fechaNacimiento);

        String producto = JOptionPane.showInputDialog("Producto:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));

        Tienda tienda = new Tienda();
        tienda.procesarPedido(cliente, producto, cantidad);

        String mensaje = "Cliente: " + cliente.getNombre() +
                "\nEdad: " + cliente.calcularEdad() +
                "\nProducto: " + producto +
                "\nCantidad: " + cantidad;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}