
package Moto;


public class PrincipalMoto {
    
    public static void main(String[] args) {
        Moto moto = new Moto();

        System.out.println("Velocidad inicial: " + moto.obtenerVelocidad());

        // Acelerar la moto en 100 unidades
        moto.acelerar(100);
        System.out.println("Velocidad después de acelerar: " + moto.obtenerVelocidad());

        // Frenar la moto en 50 unidades
        moto.frenar(50);
        System.out.println("Velocidad después de frenar: " + moto.obtenerVelocidad());

        // Intentar acelerar más allá del límite máximo
        moto.acelerar(100);
        System.out.println("Velocidad después de acelerar más allá del límite máximo: " + moto.obtenerVelocidad());

        // Intentar frenar más allá de la velocidad actual
        moto.frenar(200);
        System.out.println("Velocidad después de frenar más allá de la velocidad actual: " + moto.obtenerVelocidad());
    }
}
    
    
    

