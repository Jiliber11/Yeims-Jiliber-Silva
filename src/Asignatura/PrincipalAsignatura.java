
package Asignatura;

public class PrincipalAsignatura {
    public static void main(String[] args) {
        // Crear objeto de tipo Asignatura con constructor con parámetros
        Asignatura asignatura1 = new Asignatura(5, "Matemáticas");

        // Mostrar los datos de la asignatura creada
        System.out.println("Asignatura: " + asignatura1.getNombre());
        System.out.println("Créditos: " + asignatura1.getCreditos());

        // Intentar establecer créditos negativos
        try {
            asignatura1.setCreditos(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostrar los datos de la asignatura después del intento de establecer créditos negativos
        System.out.println("Créditos después de intento de establecer créditos negativos: " + asignatura1.getCreditos());
    }
}
    
    
    

