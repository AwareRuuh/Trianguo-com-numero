import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i,j,n;
    System.out.println("Digite um número: ");
    n = sc.nextInt();
 for( i = 1; i <= n; i++) {
    for ( j = 1; j <= i; j++)
      System.out.print(j);
      System.out.println("");
    }
   }
  }