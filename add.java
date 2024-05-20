import java.util.Scanner;

class Addition {
  int a = 10;
  int b = 20;

  public int add(int a, int b) {
    return a + b;
  }
}

class adding {
  public static void main(String[] args) {
    System.out.println("enter 2 number");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Addition ad = new Addition();
    System.out.println(ad.add(a, b));
  }
}