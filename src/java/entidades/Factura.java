package entidades;

public class Factura {

   String nombre;
   int precio;
   
   public Factura(String nombre, int precio) {
       
       this.setNombre(nombre);
       this.setPrecio(precio);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
   
 