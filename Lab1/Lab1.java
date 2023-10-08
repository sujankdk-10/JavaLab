

public class Lab1 {
    public static void main(String[] args) {
    Box Box1 = new Box(10,3,7); 
    System.out.println(" Box 1: ");
    Box1.print_value();
    Box1.volm_Box(); 

    System.out.println("\n Box 2: ");
    Box Box2 = new Box(7,8,4); 
    Box2.print_value();
    Box2.volm_Box();
  }
}

class Box {
  int length;
  int breadth;
  int height;

  Box(int l, int b, int h) {
    this.length = l;
    this.breadth = b;
    this.height = h;
  }
  void print_value() {
    System.out.println("\tLength : "+ this.length );
    System.out.println("\tBreadth : "+ this.breadth);
    System.out.println("\tHeight : " + this.height );
  }

  void volm_Box() {
    double volume = length * breadth * height;
    System.out.printf("\tThe volume of the box is %.2f\n\n",volume);
  }
}