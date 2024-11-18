package CA224;

public class person {

    //variable

    String name;

    //constructors

    person(){
        name = "1.The Name is :" + "Abdullahi Hussein Abdikariim";
        System.out.println("---------------exchange_Name----------------------");
    }

    person(String Name){
        name = Name;
    }

    // methods

    void print(){
        System.out.println("The Name is : "+ name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
