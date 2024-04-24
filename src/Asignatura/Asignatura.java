
package Asignatura;


public class Asignatura {
    
   
    private int creditos;
    private String nombre;

    // Constructor con parámetros
    public Asignatura(int creditos, String nombre) {
        // Verificar que los créditos no sean negativos
        if (creditos >= 0) {
            this.creditos = creditos;
        } else {
            throw new IllegalArgumentException("Los créditos no pueden ser negativos");
        }
        this.nombre = nombre;
    }

    
    // Constructor sin parámetros
    public Asignatura() {
        this.creditos = 0;
        this.nombre = "";
    }

    
    // Getter para obtener los créditos
    public int getCreditos() {
        return creditos;
    }
    
    
     // Setter para establecer los créditos
    public void setCreditos(int creditos) {
        
        // Verificar que los créditos no sean negativos
        if (creditos >= 0) {
            
            this.creditos = creditos;
        } else {
            throw new IllegalArgumentException("Los créditos no pueden ser negativos");
        }
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
    


