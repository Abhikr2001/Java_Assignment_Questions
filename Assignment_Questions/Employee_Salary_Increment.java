import java.util.Scanner;

public class Employee_Salary_Increment {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

         int salary = sc.nextInt();
         int service = sc.nextInt();
         double increment,Total_salary;

         if(service >= 10){
            increment = .1*salary;
            Total_salary = salary + increment;
            System.out.println(Total_salary);

         }else if(service >= 5 && service < 10){
            increment = .05*salary;
            Total_salary = salary + increment;
            System.out.println(Total_salary);
         }
         else{
            System.out.println(salary);
         }
    }
    
}
