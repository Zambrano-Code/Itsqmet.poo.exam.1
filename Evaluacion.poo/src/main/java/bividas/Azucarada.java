
package bividas;

/**
 *
 * @author Geovanny Zambrano
 */
public class Azucarada extends Bebidas{

    public Azucarada (int id, String tipoBotella, double litro, double precio, String tipo, int azucarPor, boolean promocion){
        super(id, tipoBotella, litro, precio);
        
        this.tipo = tipo;
        this.azucarPor = azucarPor;
        this.promocion = promocion;
        
        aumetarSumaPrecio(precio);
        aumetarBebidaDes(promocion);
    }
    
    //metodos crear
    private static void aumetarSumaPrecio(double asd){
        precioTotal = precioTotal + asd;
    } 
    
    private static void aumetarBebidaDes(boolean promocion){
        if (promocion) {            
            cantidaBebidaDesc++;
        }
    }
    
    //toString
    @Override
    public String toString(){
        String txt = super.toString() + "\n\tTipo: " + tipo + "\n\tPorcentaje Azucar: " + azucarPor + "\n\tPromocion: " + isPromocion();
        return txt;
    }
    
    
    //metodos get y set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAzucarPor() {
        return azucarPor;
    }

    public void setAzucarPor(int azucarPor) {
        this.azucarPor = azucarPor;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }
    
    public static double getPrecioTotal() {
        return precioTotal;
    }

    public static double getCantidaBebidaDesc() {
        return cantidaBebidaDesc;
    }
    
    //atributos
    private String tipo;
    private int azucarPor;
    private boolean promocion;
    
    private static double precioTotal = 0;
    private static double cantidaBebidaDesc = 0;
    
}
