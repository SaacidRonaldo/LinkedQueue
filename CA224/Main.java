package CA224;

public class Main {
    public static void main(String[] args) {

        Books mys = new Books();
        mys.year = "2019";
        mys.title = "Abdullahi Software Developer";
        mys.auther = "Abdullahi Hussein Company";

        person myper = new person();

        System.out.println("---------------------------------------");
        myper.name = "the name is : " + "Farxaan Abdullahi Echo";
        System.out.println(myper.getName());

        myper.setName("the Name is : " + "Echo Farah");
        System.out.println(myper.getName());
        myper.print();
    }
}