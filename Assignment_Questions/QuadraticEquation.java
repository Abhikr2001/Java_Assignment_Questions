import java.util.Scanner;;
public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int D = (b*b)-(4*a*c);

        if(D>0){
          System.out.println( "Two real and distinct roots.");
        }
        else if (D==0){
          System.out.println( "Two real and equal roots.");
        }
        else{
          System.out.println(  "Complex roots.");
        }
    }
    
}
