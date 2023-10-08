 public class Lab2{
  

  public static void main(String[] args) {

    /* Three objects of Money class */
    Money m1 = new Money();
    Money m2 = new Money();
    Money m3 =new Money();

    /* setting the values in m1 and m2*/
    m1.setMoney(74, 5);
    m2.setMoney(10, 5);

    /* adding values of object m1 and m2 */
    m3.addMoney(m1, m2);
    m1.displayMoney();
    System.out.printf(" + ");
    m2.displayMoney();
    System.out.printf(" = ");
    m3.displayMoney();
    System.out.println();
    
  }
}


class Money {
  int rupee;
  int paisa;


  void setMoney(int rupee, int paisa) {
    this.rupee = rupee;
    this.paisa = paisa;
  }

  void displayMoney() {
    System.out.printf("%d Rupee, %d Paisa",this.rupee, this.paisa);
  }


  void addMoney(Money m1, Money m2) {
    this.paisa = m1.paisa + m2.paisa;
    this.rupee = m1.rupee + m2.rupee;
    
    while(this.paisa > 100) {
      this.rupee = this.rupee + 1;
      this.paisa = this.paisa % 100;
    }
  }
}