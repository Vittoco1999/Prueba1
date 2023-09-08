/**
 *
 * @author Victor Loyola
 */
public class Cliente {
    
    private String Nombre;
    private String Apellido;
    private String Correo;
    private int Telefono;
    private String Nuevo;
    
    
    Cliente cliente = new Cliente (Nombre, Apellido, Correo, Telefono, Nuevo, this);
    
    

    public Cliente(String Nombre, String Apellido, String Correo, int Telefono, String Nuevo, Cliente cliente) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Nuevo = Nuevo;
        this.cliente = cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNuevo() {
        return Nuevo;
    }

    public void setNuevo(String Nuevo) {
        this.Nuevo = Nuevo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Nuevo=" + Nuevo + ", cliente=" + cliente + '}';
    }

    
}

