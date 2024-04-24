
package papel;

public class Papel {
     public String color;
    public int grosor;

    // Constructor 
    public Papel() {
      //atributos con valores predeterminados
        this.color = "Blanco";
        this.grosor = 80;
    }

    // Constructor con parámetros para establecer valores personalizados
    public Papel(String color, int grosor) {
        this.color = color;
        this.grosor = grosor;
    }

    }
    

