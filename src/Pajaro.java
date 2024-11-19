public class Pajaro extends Animal{

    int tamAlas;
    boolean tienePlumas;

    public Pajaro(String nombre, boolean tienePlumas, int numeroPatas, int tamAlas) {
        super(nombre, numeroPatas);
        this.tamAlas = tamAlas;
        this.tienePlumas = tienePlumas;
    }

    public void volar(int altura){
        System.out.println(nombre+" vuela "+altura+" metros!");
    }

    @Override
    public void describir(){
        super.describir(); //para que también haga lo del métod original
        System.out.println(nombre+" tiene unas alas de"+tamAlas+"cm!");
    }
}
