package modelo;

public class Tienda {

    public void procesarPedido(Cliente cliente, String producto, int cantidad) {
        Pedido pedido = new Pedido(cliente, producto, cantidad);
        pedido.mostrarDetalle();
    }
}