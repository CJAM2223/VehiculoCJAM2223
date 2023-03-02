
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        int stockActual = operativaVehiculosAvilaMartinCarlosJorge2223(50);
        System.out.println("El stock actual es"+ stockActual );
    }

    private static int operativaVehiculosAvilaMartinCarlosJorge2223(java.lang.Integer cantidad) {
        VehiculoAvilaMartinCarlosJorge2223 miVehiculoAvilaMartinCarlosJorge2223;
        int stockActual;
        miVehiculoAvilaMartinCarlosJorge2223 = new VehiculoAvilaMartinCarlosJorge2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoAvilaMartinCarlosJorge2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoAvilaMartinCarlosJorge2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoAvilaMartinCarlosJorge2223.obtenerStock();
        return stockActual;
        
    }

}
    
