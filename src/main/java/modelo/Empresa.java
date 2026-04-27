package modelo;

public class Empresa {
    String nombre;
    Empleado[] empleados;

    public Empresa(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public double calcularTotalSalarios() {
        double total = 0;

        for (Empleado emp : empleados) {
            total += emp.calcularSalarioTotal();
        }

        return total;
    }
}