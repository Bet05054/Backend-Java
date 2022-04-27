package PracticaMona;

class Mona4 {
    String name ="Pusheecat";
    void Hobby(){
        System.out.println("Mi hobby: Jugar con bolitas de estambre");
    }

}

class Pusheecat4 extends Mona4 {
    String color ="Chocolatoso";
    void printColor (){
        System.out.println("Mis colores son: "+color);
        System.out.println("Mi nombre es: "+ super.name);
    }
    void Hobby(){
        System.out.println("Mi hobby: Jugar con bolitas de estambre ");
    }
    void Karen(){
        System.out.println("Mi gusta : juagar con las manos de mi Karen");
    }
    void Frase(){
        System.out.println("a mimir");
    }
    void call(){
        super.Hobby();
        Karen();
        Frase();
    }

}
public class Pusheecat {
    public static void main(String[] args) {
        new Pusheecat4().printColor();
        //new Goreocat().Hobby();
        new Pusheecat4().call();

    }
}


