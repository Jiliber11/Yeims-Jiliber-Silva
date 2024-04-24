

    
  package carro;

public class Principalcoche {

    public static void main(String[] args) {
        MiClaseCoche coche1 = new MiClaseCoche();
        coche1.marca = "BMW";
        coche1.color = "Negro";
        coche1.matricula = "RFG564";
        coche1.cilindrada = 2000;

        System.out.println("La marca del coche es: " + coche1.marca);
        System.out.println("El color antes es: " + coche1.color);
        // Llamamos la variable y que nos diga si es metalizado o no
        coche1.dimeSiEsMetalizado();
        coche1.color = "Blanco";
        System.out.println("El color despues es: " + coche1.color);
        coche1.dimeSiEsMetalizado();
        
        System.out.println("Matricula antes: " + coche1.matricula);
        coche1.cambiarMatricula("ABC000");
        System.out.println("Matricula nueva: " + coche1.matricula);
     
       if (coche1.altaCilindrada())
           System.out.println("El coche tiene alta cilindrada");
       else
            System.out.println("El coche tiene baja cilindrada");
       
       MiClaseCoche coche2 = new MiClaseCoche("BMW", "Plata", "DSC213", 2300);
        System.out.println("");
        System.out.println("Coche 2");
        System.out.println("Marca: " +coche2.marca);
        System.out.println("Color: " +coche2.color);
        System.out.println("Placa: " +coche2.matricula);
        System.out.println("Cilindrada: " +coche2.cilindrada);
    }   
}
    
    
    
    
    
    

