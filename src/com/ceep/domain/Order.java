
package com.ceep.domain;


public class Order {
    private final int idOrder; 
    Producto productos[];
    private static int contadorOrdenes;
    private static int contadorProductos;
    private static final int max_productos = 10;

    public Order() {
        productos=new Producto[Order.max_productos];
        this.idOrder = ++Order.contadorOrdenes;
    } 
    
    public void agregarProducto (Producto producto){
        if (Order.contadorProductos < Order.max_productos){
            productos[Order.contadorProductos++] = producto;
            
        }else{
            System.out.println("Has alcanzado el maximo de productos por orden de "+
                    +Order.max_productos);
        }
    }
    
    public double calcularTotal(){
        var res = 0.0;
        for(int i= 0; i < Order.contadorProductos;i++){
        res+=productos[i].getPrecio();
    }
        return res;
    }
    
    public void mostrarOrder(){
        System.out.println("Id de orden: "+this.idOrder);
        for(int i= 0; i < Order.contadorProductos;i++){
            System.out.println("Nombre producto: "+ i+ "]->"+productos[i].getNombre());
            System.out.println("Precio producto: "+ i+ "]->"+productos[i].getPrecio());
        }
        System.out.println("Total: "+this.calcularTotal());
        
    }
    
    
}
