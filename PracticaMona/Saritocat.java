package PracticaMona;

class Mona5 {
        String name ="Saritocat";
        void Hobby(){
        System.out.println("Mi Hobby: consciencia Vedas con el poder de la palabra, sabiduría y enseñanzas.");
        }
        void Jerarquia(){

        }
        }

class Saritocat5 extends Mona5 {
    String color ="Turquesa & Magenta & Oro";
    void printColor (){
        System.out.println("Mis colores son: "+color);
        System.out.println("Mi nombre es: "+ super.name);
    }
    void Hobby(){
        System.out.println("Mi Hobby : consciencia Vedas con el poder de la palabra, sabiduría y enseñanzas.");
    }
    void Jerarquia(){
        System.out.println("Mi posicion: una de las tres diosas mas importantes");
    }

    void Frase(){
        System.out.println("El conocimiento es el camino hacia la liberación");
    }
    void call(){
        super.Hobby();
        Jerarquia();
        Frase();
    }

}
public class Saritocat {
    public static void main(String[] args) {
        new Saritocat5().printColor();
        //new Goreocat().Hobby();
        new Saritocat5().call();

    }
}

