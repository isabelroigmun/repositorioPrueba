public class App {
    public static void main(String[] args) {
        Animal perro = new Animal("Rex",true,4);
        Pajaro flamenco = new Pajaro("Pinky",false,2,50);
        perro.describir();
        flamenco.describir();
        flamenco.volar(20);
    }
}
