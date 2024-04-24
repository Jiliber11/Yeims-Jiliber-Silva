
package Mascara;


public class MascaraPrincipal {
    
    public static void main(String[] args) {
        // Crear objetos de la clase Mascara usando el constructor por defecto
        Mascara mascara1 = new Mascara();
        Mascara mascara2 = new Mascara();

        // Establecer valores para los atributos de los objetos de Mascara
        mascara1.personaje = "Spider-Man";
        mascara1.tienePelo = true;

        mascara2.personaje = "Batman";
        mascara2.tienePelo = false;

        // Consultar los valores de los atributos por consola
        System.out.println("Máscara 1 - Personaje: " + mascara1.personaje + ", Tiene Pelo: " + mascara1.tienePelo);
        System.out.println("Máscara 2 - Personaje: " + mascara2.personaje + ", Tiene Pelo: " + mascara2.tienePelo);
    }
}

    
