import modelo.*;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("Ana");
        Tienda tienda = new Tienda();
        cliente.realizarPedido(tienda, "Laptop");

        System.out.println("-------");


        Empleado emp = new Empleado("Luis", 500);

        emp.mostrarSalario();

        double bono = emp.calcularBono();
        System.out.println("Bono: " + bono);

        System.out.println("Salario total: " + emp.calcularSalarioTotal());

        if (emp.aplicaDescuento()) {
            System.out.println("Aplica descuento");
        } else {
            System.out.println("No aplica descuento");
        }

        System.out.println("----");

       
        Empleado emp1 = new Empleado("Luis", 500);
        Empleado emp2 = new Empleado("Ana", 300);

        Empleado[] lista = {emp1, emp2};

        Empresa empresa = new Empresa("TechCorp", lista);

        System.out.println("Total de salarios: " + empresa.calcularTotalSalarios());
    }
}