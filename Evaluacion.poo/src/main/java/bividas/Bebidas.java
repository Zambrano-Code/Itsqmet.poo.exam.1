
package bividas;

/**
 *
 * @author Geovanny Zambrano
 */
public class Bebidas {

    public Bebidas(int id, String tipoBotella, double litro, double precio) {
        this.id = id;
        this.tipoBotella = tipoBotella;
        this.litro = litro;
        this.precio = precio;
    }

    
    
    //toString
    @Override
    public String toString(){
        return "\tId: " + id + "\n\tTipo de botella: " + tipoBotella + "\t\nLitro: " + litro + "\t\nPrecio: " + litro;
    }
    
    //metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoBotella() {
        return tipoBotella;
    }

    public void setTipoBotella(String tipoBotella) {
        this.tipoBotella = tipoBotella;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    //atributos
    private int id;
    private String tipoBotella;
    private double litro;
    private double precio;
}
