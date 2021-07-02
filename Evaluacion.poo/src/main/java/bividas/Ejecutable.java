package bividas;

import java.io.IOException;
import java.util.ArrayList;
import metodosAyuda.mhelp;

/**
 *
 * @author Geovanny Zambrano
 */
public class Ejecutable {
    
    private static ArrayList <Azucarada> azucar = new ArrayList();
    private static ArrayList <Agua> agua = new ArrayList();
    
    
    public static void main(String[] args) throws IOException {
        
        char opcion;
        
        do {
            opcion = menu();
            switch (opcion){
                case 'a' -> menuBebida();
                case 'b' -> menuAgua();
                case 'c' -> menuPago();
            }
        } while (opcion != 'e');
        
    }
    
    private static char menu() throws IOException{
        System.out.println("----------- Menu ----------");
        System.out.println(" a. Bebida Azucarada");
        System.out.println(" b. Agua");
        System.out.println(" c. Total a pagar");
        System.out.println(" e. Salir");
        return mhelp.solicitarOpcion("abcde");
    }
    
    //Menu BebidaAzucar
    
    private static void menuBebida() throws IOException{
        char opcion;
        do {           
            System.out.println("----------- Menu Bebida ----------");
            System.out.println(" a. Agregar");
            System.out.println(" b. Ver Bibidas");
            System.out.println(" c. Cantidad bebidas decuento");
            System.out.println(" d. Salir.");
            System.out.println("------------------------------------");
            opcion = mhelp.solicitarOpcion("abcd");
            
            switch (opcion){
                case 'a' -> agregarBebidaAzucar();
                case 'b' -> verBebidaAzucar();
                case 'c' -> canBebidaAzucarDes();
            }
        
        } while (opcion != 'd');
    }
    
    private static void agregarBebidaAzucar() throws IOException{
        System.out.println("-----------------Agregar Bebida ---------------------");
        azucar.add(new Azucarada(pedirId(), pedirTipoBotella(), pedirLitro(), pedirPrecio(), pedirTipo(), pedirPorAzucar(), pedirPromocion()));
        System.out.println("-------------------------------------------------------\n");
    }
    
    private static void verBebidaAzucar(){
        System.out.println("-------------Lista Bebida Azucar -------------");
        azucar.forEach(a -> System.out.println(a.toString() + "\n"));
        System.out.println("-----------------------------------------------");
    }
    
    private static void canBebidaAzucarDes(){
        System.out.println("----------- Lista de bebida con descuento ----------");
        System.out.println( "\tTotal:" + Azucarada.getCantidaBebidaDesc() + "\n");
        azucar.forEach(a -> {
            if (a.isPromocion()) {
                System.out.println("\t" + a.toString());
            }
        });
        System.out.println("-----------------------------------------------------");
    }
    
    //Menu Agua
    
    private static void menuAgua() throws IOException{
        char opcion;
        do {           
            System.out.println("----------- Menu Agua ----------");
            System.out.println(" a. Agregar");
            System.out.println(" b. Ver Aguas");
            System.out.println(" c. Ver Aguas por marca");
            System.out.println(" d. Salir.");
            System.out.println("------------------------------------");
            opcion = mhelp.solicitarOpcion("abcd");
            
            switch (opcion){
                case 'a' -> agregarAgua();
                case 'b' -> verAguas();
                case 'c' -> verAguasMarca();
            }
        
        } while (opcion != 'd');
    }
    
    private static void agregarAgua() throws IOException{
        System.out.println("---------------Agregar Agua-------------------");
        agua.add(new Agua(pedirId(), pedirTipoBotella(), pedirLitro(), pedirPrecio(), pedirMarca()));
        System.out.println("-----------------------------------------------\n");
    }
    
    private static void verAguas(){
        System.out.println("---------- Lista de aguas ----------");
        agua.forEach(a -> System.out.println(a.toString()));
        System.out.println("-------------------------------------\n");
        
    }
    
    private static void verAguasMarca(){
        System.out.println("----------- Lista agua tesalia -----------");
        System.out.println("\tTotal: " + Agua.getTesalia());
        System.out.println("\t------------");
        agua.forEach(a -> {
            if (a.getMarca().equalsIgnoreCase("tesalia")) {
                System.out.println(a.toString() + "\n");
            }
        });
        System.out.println("------------------------------------------");
        System.out.println("----------- Lista agua cielo -----------");
        System.out.println("\tTotal: " + Agua.getCielo());
        System.out.println("\t------------");
        agua.forEach(a -> {
            if (a.getMarca().equalsIgnoreCase("cielo")) {
                System.out.println(a.toString() + "\n");
            }
        });
        System.out.println("------------------------------------------");
        System.out.println("----------- Lista agua natural -----------");
        System.out.println("\tTotal: " + Agua.getNatural());
        System.out.println("\t------------");
        agua.forEach(a -> {
            if (a.getMarca().equalsIgnoreCase("natural")) {
                System.out.println(a.toString() + "\n");
            }
        });
        System.out.println("------------------------------------------");
    }
    
    //Menu pago
    
    private static void menuPago(){
        System.out.println("----------- Menu Pago -----------");
        System.out.println("Pago bebidas azucar: " + Azucarada.getPrecioTotal() );
        System.out.println("Pago agua: " + Agua.getPrecioTotal());
        System.out.println("Pago Total: " + (Azucarada.getPrecioTotal() + Agua.getPrecioTotal()));
        System.out.println("-----------------------------------");
    }
    
    
    //Peticiones
    
    private static int pedirId() throws IOException{
        System.out.println("Ingresa el id: ");
        return mhelp.numeroInt();
    }
    
    private static String pedirTipoBotella() throws IOException{
        System.out.println("Ingresa el tipo de botella: ");
        return mhelp.txt();        
    }
    
    private static int pedirLitro() throws IOException{
        System.out.println("De cuanto litros es?: ");
        return mhelp.numeroInt();        
    }
    
    private static double pedirPrecio() throws IOException{
        System.out.println("Ingresa el precio: ");
        return mhelp.numeroDouble();        
    }
    
    private static String pedirTipo() throws IOException{
        System.out.println("Ingresa el tipo: ");
        return mhelp.txt();        
    }
    
    private static int pedirPorAzucar() throws IOException{
        System.out.println("Ingresa el porcentaje de azucar: ");
        return mhelp.numeroInt();        
    }
    
    private static boolean pedirPromocion() throws IOException{
        System.out.println("Este producto tiene promocion? (si/no)");
        String txt = null;
        boolean mm = false;
        boolean repetir;
        do {
            txt = mhelp.txt();
            if (txt.equalsIgnoreCase("si")) {
                mm = true;
                repetir = false;
            }else if (txt.equalsIgnoreCase("no")){
                mm = false;
                repetir = false;
            }else {
                System.out.println("Valor no admitido, Intente de nuevo.");
                repetir = true;
            }
        } while (!repetir);
        
        return mm;
    }
    
    private static String pedirMarca() throws IOException{
        String txt = mhelp.txt();
        return txt;
    }
}
