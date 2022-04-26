package PracticaHarry;

public class Personajes {

        public String name;
        public String house;
        public String gender;
        public String boggart;
        public String patronus;

        public Personajes(String name, String house, String gender, String boggart, String patronus) {
            this.name = name;
            this.house = house;
            this.gender = gender;
            this.boggart = boggart;
            this.patronus = patronus;


    }

    public String getName() {  return name;  }
    public String getHouse() {  return house;  }
    public String getGender() {  return gender;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            return true;
        }else
            return false;
    }
    public boolean setPatronus(String boggart){
        if(!patronus.isEmpty()){
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                        "name: " +name+"\n"+
                        "house: "+house+"\n"+
                        "gender: "+gender+"\n"+
                        "boggart: "+boggart+"\n"+
                        "patronus: "+patronus;
    }
}



