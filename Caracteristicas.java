package PracticaHarry;

public class Caracteristicas {
    public static void main(String[] args) {
        Mago1();
        Mago2();
        Mago3();
        Mago4();
        Mago5();

    }

    public static void Mago1(){
        Personajes Mago1 = new Personajes ("Hermione Granger", "Gryffindor", "Female","Teacher MaGonagall telling her that she failed everything.", "Otter");
        Mago1.setName("Hermione Granger");
        Mago1.setHouse("Gryffindor");
        Mago1.setGender("Female");
        Mago1.setBoggart("Teacher MaGonagall telling her that she failed everything");
        Mago1.setPatronus("Otter");
        System.out.println(Mago1.showMessage());
        System.out.println("--------------");
    }
    public static void Mago2(){
        Personajes Mago2 = new Personajes("Severus", "Slytherin", "Male", "Lord Voldemort", "Deer");
        Mago2.setName("Severus Snape");
        Mago2.setHouse("Slytherin");
        Mago2.setGender("Male");
        Mago2.setBoggart("Lord Voldemort");
        Mago2.setPatronus("Deer");
        System.out.println(Mago2.showMessage());
        System.out.println("--------------");
    }
    public static void Mago3(){
        Personajes Mago3 = new Personajes("Tom Sorvolo Ryddle", "Slytherin", "Male", "His own death", "Nagini");
        Mago3.setName("Tom Sorvolo Ryddle");
        Mago3.setHouse("Slytherin");
        Mago3.setGender("Male");
        Mago3.setBoggart("his own death");
        Mago3.setPatronus("Nagini");
        System.out.println(Mago3.showMessage());
        System.out.println("--------------");
    }
    public static void Mago4(){
        Personajes Mago4 = new Personajes("Sirius Black", "Gryffindor", "Male", "unknown", "Dog");
        Mago4.setName("Sirius Black");
        Mago4.setHouse("Gryffindor");
        Mago4.setGender("Male");
        Mago4.setBoggart("unknown");
        Mago4.setPatronus("Dog");
        System.out.println(Mago4.showMessage());
        System.out.println("--------------");
    }
    public static void Mago5(){
        Personajes Mago5 = new Personajes("Neville Longbottom", "Gryffindor", "Male", "Profesor Severus Snape", "Non corporeal");
        Mago5.setName("Neville Longbottom");
        Mago5.setHouse("Gryffindor");
        Mago5.setGender("Male");
        Mago5.setBoggart("Profesor Severus Snape");
        Mago5.setPatronus("Non corporeal");
        System.out.println(Mago5.showMessage());
        System.out.println("--------------");
    }
}
