import java.util.Scanner;

public class AtmWithdrawal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int pin=1234;
        int balance=100;
        int attempt=0;

        while(attempt<3){
            int userpin=sc.nextInt();
            if(userpin==pin){
                System.out.println("withdraw amount = ");
                int amt=sc.nextInt();
                if(amt>balance){
                    System.out.println("insufficient balance");
                }
                else{
                    balance-=amt;
                    System.out.println("withdrawal succesfull" + "\n" + "balance = " + balance);
                }
                
                
            }
            else{
                attempt++;
                System.out.println("incorret pin");
            }
            
        }

        System.out.println("too many attempts");
    }
    
}
