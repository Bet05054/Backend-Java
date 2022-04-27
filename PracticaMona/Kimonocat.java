package PracticaMona;

class Mona2 {
    String name ="Kimonacat";
    void Hobby(){
        System.out.println("Mi hobby: Geisha Samura");
    }
    void Estilo(){

    }
}

class Kimonacat2 extends Mona2 {
    String color ="Morado y Lila";
    void printColor (){
        System.out.println("Mis colores son: "+color);
        System.out.println("Mi nombre es: "+ super.name);
    }
    void Hobby(){
        System.out.println("Mi hobby: Geisha Samuray");
    }
    void arte(){
        System.out.println("Mi arte marcial: kenjutsu");
    }
    void Frase(){
        System.out.println("El verdadero guerrero no es inmune al miedo lucha a pesar de el");
    }
    void call(){
        super.Hobby();
        arte();
        Frase();
    }

}
public class Kimonocat {
    public static void main(String[] args) {
        new Kimonacat2().printColor();
        //new Goreocat().Hobby();
        new Kimonacat2().call();

    }
}

