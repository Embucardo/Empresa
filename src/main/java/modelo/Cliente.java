package modelo;

public class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void realizarPedido(Tienda tienda, String producto) {
        tienda.procesarPedido(this, producto);
    }
}