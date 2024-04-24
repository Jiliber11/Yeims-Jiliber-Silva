
package papel;

public class Principal {
     public static void main(String[] args) {
         
        // Crear objetos de la clase Papel usando el constructor por defecto
        Papel papel1 = new Papel();
        Papel papel2 = new Papel();

        // Establecer valores para los atributos de los objetos de Papel
        papel1.color = "Azul";
        papel1.grosor = 100;

        papel2.color = "Verde";
        papel2.grosor = 120;

        // Consultar los valores de los atributos por consola
        System.out.println("Papel 1 - Color: " + papel1.color + ", Grosor: " + papel1.grosor);
        System.out.println("Papel 2 - Color: " + papel2.color + ", Grosor: " + papel2.grosor);
    }
}

