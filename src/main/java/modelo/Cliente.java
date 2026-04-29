package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;

    public Cliente(String nombre, String apellido, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public void realizarPedido(Tienda tienda, String producto, int cantidad) {
        tienda.procesarPedido(this, producto, cantidad);
    }

    public String getNombre() {
        return nombre;
    }
}