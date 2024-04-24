package Moto;
class Moto {
    private int velocidad;

    public Moto() {
        velocidad = 0;
    }

    public void acelerar(int cantidad) {
        velocidad += cantidad;
        if (velocidad > 150) {
            velocidad = 150;
        }
    }

    public void frenar(int cantidad) {
        velocidad -= cantidad;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    public int obtenerVelocidad() {
        return velocidad;
    }
}