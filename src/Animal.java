public class Animal {
    String nombre;
    boolean tienePelo;
    int numeroPatas;

    public Animal(String nombre, boolean tienePelo, int numeroPatas) {
        this.tienePelo = tienePelo;
        this.numeroPatas = numeroPatas;
    }

    public Animal(String nombre, int numeroPatas) {
        this.nombre = nombre;
        this.numeroPatas = numeroPatas;
    }

    public void describir(){
        System.out.println(nombre+" tiene "+numeroPatas+" patas!");
    }
}
