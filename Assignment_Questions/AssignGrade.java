import java.util.Scanner;

public class AssignGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();

        double avg = (mark1 + mark2 + mark3) /3;
        
        if(mark1 < 35 || mark2 < 35 || mark3 < 35){
            System.out.println("Fail");
        }else{
        
        if (avg >= 90) {
            System.out.println("grade = A+" +"\n"+ "Average mark = "+ avg);
        } 
        else if (avg >= 75 && avg < 90) {
            System.out.println("grade = A+" + "\n"+"Average mark = "+ avg);
        }
         else if (avg >= 60 && avg < 75) {
            System.out.println("grade = A+" + "\n"+"Average mark = "+ avg);
        } 
        else if (avg >= 40 && avg < 60) {
            System.out.println("grade = A+" + "\n"+"Average mark = "+ avg);
        } 
        else if (avg < 40) {
            System.out.println("Fail" + "\n"+"Average mark = "+ avg);
        }
         
    }
        
        
    }
}

