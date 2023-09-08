/**
 *
 * @author Victor Loyola
 */
public class Descuento {
        
       private Descuento Nuevo;

    public Descuento(Descuento Nuevo) {
        this.Nuevo = Nuevo;
    }

    public Descuento getNuevo() {
        return Nuevo;
    }

    public void setNuevo(Descuento Nuevo) {
        this.Nuevo = Nuevo;
    }

    @Override
    public String toString() {
        return "Descuento{" + "Nuevo=" + Nuevo + '}';
    }


    
}
