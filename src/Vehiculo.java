/**
 *
 * @author Victor Loyola
 */
public class Vehiculo {
    
    private String modelo;
    private String tipoRuedas;
    private String Color;
    private String combustible;
    private int patente;
    private int kilometraje;
    
    Vehiculo auto = new Vehiculo(modelo, tipoRuedas, Color, combustible, patente, kilometraje);
    
    
    //constructor

    public Vehiculo(String modelo, String tipoRuedas, String Color, String combustible, int patente, int kilometraje) {
        this.modelo = modelo;
        this.tipoRuedas = tipoRuedas;
        this.Color = Color;
        this.combustible = combustible;
        this.patente = patente;
        this.kilometraje = kilometraje;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoRuedas() {
        return tipoRuedas;
    }

    public void setTipoRuedas(String tipoRuedas) {
        this.tipoRuedas = tipoRuedas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", tipoRuedas=" + tipoRuedas + ", Color=" + Color + ", combustible=" + combustible + ", patente=" + patente + ", kilometraje=" + kilometraje + ", auto=" + auto + '}';
    }


    
    
    
    
}
