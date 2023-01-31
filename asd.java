import java.util.Date;//util is package and Date is class

public class asd {
    /**
     * @param args
     */
    public static void main(String[] args) {
      System.out.println("Hello World");
      /*
      int age = 20, tepreture = 42;//2Billion
      double ran4 = 3.243;// takes 8 bytes
      */
      byte age = 30;//range from -128 to 127
      float ran2 = 55.555f;//2 bytes 32k
      long viewsCount = 4_313_243_256l;// int is initial for desoemal
      float price = 10.99f;// f to convert duble in this case and float takes 4 bytes like int
      char letter = 'A';//takes one charector use ''
      boolean isEligivle = false;
      Date now = new Date();
      System.out.println(now);
      System.out.printf("asd%f",ran2);
      System.out.print("asd dsadsa");
      System.out.printf(" same line\t for \n print only");
    }

  }