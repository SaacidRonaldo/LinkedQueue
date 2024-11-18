package CA224;

public class Main {

    public static void main(String[] args) {

        Books mys = new Books();
        mys.year = "2019";
        mys.title = "Abdullahi Software Developer";
        mys.auther = "Abdullahi Hussein Company";


        System.out.println("---------------------------------------");
        person myper = new person();
        System.out.println(myper.getName());

        System.out.println("---------------exchange_Name----------------------");

        myper.name = "2.the name is : " + "Farxaan Abdullahi Echo";
        System.out.println(myper.getName());

        System.out.println("----------------exchange_Name----------------------");

        myper.setName("3.the Name is : " + "Echo Farah");
        System.out.println(myper.getName());


        System.out.println("-----------------exchange_Name----------------------");

        myper.print();
    }
}