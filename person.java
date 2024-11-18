package CA224;

public class person {

    //variable

    String name;

    //constructors

    person(){
        name = "Abdullahi Hussein Abdikariim";
    }

    person(String Name){
        name = Name;
    }

    // methods

    void print(){
        System.out.println("Name is : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
