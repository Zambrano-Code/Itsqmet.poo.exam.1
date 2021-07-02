
package bividas;

/**
 *
 * @author Geovanny Zambrano
 */
public class Agua extends Bebidas{

    public Agua (int id, String tipoBotella, double litro, double precio, String marca){
        super(id, tipoBotella, litro, precio);
        
        this.marca = marca;
        aumetarSumaPrecio(precio);        
        verificarMarca(marca);
        
    }
    
    private static void aumetarSumaPrecio(double asd){
        precioTotal = precioTotal + asd;
    }
     
    private static void verificarMarca(String marca){
        switch (marca){
            case ("Tesalia") -> tesalia++;
            case ("Cielo") -> cielo++;
            case ("Natural") -> natural++;
        }
    }
    
    
    //toString
    @Override
    public String toString(){
        String txt = super.toString() + "\n\tMarca: " + marca;
        return txt;
    }
    
    //metodos get y set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public static double getPrecioTotal() {
        return precioTotal;
    }

    public static double getTesalia() {
        return tesalia;
    }

    public static double getCielo() {
        return cielo;
    }

    public static double getNatural() {
        return natural;
    }
    
    //atributos
    private String marca;
    
    private static double precioTotal = 0;
    private static double tesalia = 0;
    private static double cielo = 0;
    private static double natural = 0;

}
