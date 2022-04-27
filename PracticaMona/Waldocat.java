package PracticaMona;

class Mona6 {
    String name ="Waldocat";
    void Hobby(){
        System.out.println("Mi Hobby: Encuentrame");
    }
    void Habilidad(){

    }
}

class Waldocat6 extends Mona6 {
    String color ="tricolor encuentrame";
    void printColor (){
        System.out.println("Mis colores son: "+color);
        System.out.println("Mi nombre es: "+ super.name);
    }
    void Hobby(){
        System.out.println("Mi Hobby : Buscame.");
    }
    void Habilidad(){
        System.out.println(" El mejor escondite es mio ");
    }

    void Frase(){
        System.out.println("¿Es a mi a quien buscabas?");
    }
    void call(){
        super.Hobby();
        Habilidad();
        Frase();
    }

}
public class Waldocat {
    public static void main(String[] args) {
        new Waldocat6().printColor();
        //new Goreocat().Hobby();
        new Waldocat6().call();

    }
}
