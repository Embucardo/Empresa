package modelo;

public class Tienda {
    public void procesarPedido(Cliente cliente, String producto) {
        Pedido pedido = new Pedido(cliente, producto, 2);
        pedido.mostrarDetalle();
        System.out.println("Pedido procesado correctamente");
    }
}