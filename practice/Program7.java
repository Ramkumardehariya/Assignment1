package Assignment1.practice;

class Rectangle{
    int length;
    int breadth;
    Rectangle(int p, int q){
        length = p;
        breadth = q;
    }
    void displayArea(){
        System.out.println("Area of the rectangle: "+ length*breadth);
    }
    void displayPerimeter(){
        System.out.println("Perimeter of the rectangle: "+(length+breadth)*2);
    }
}

public class Program7 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,6);
        r1.displayArea();
        r1.displayPerimeter();
    }
}
