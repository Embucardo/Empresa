package modelo;

public class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarSalario() {
        System.out.println("Salario base: " + salarioBase);
    }

    public double calcularBono() {
        return salarioBase * 0.10;
    }

    public double calcularSalarioTotal() {
        return salarioBase + calcularBono();
    }

    public boolean aplicaDescuento() {
        return salarioBase > 400;
    }
}