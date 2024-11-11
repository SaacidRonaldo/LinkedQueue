package CA224;

public class Circle {

//    radius Using

    double radius;

//    Constructor Using

    Circle(){ }

    Circle(double newRadius){   //    constructor without Arguments
        radius = newRadius;
    }

//    Methods Using

    double getArea(){
        return radius * radius * Math.PI;
    }

}
