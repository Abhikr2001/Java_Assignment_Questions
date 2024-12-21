import java.util.Scanner;

public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double product_price = sc.nextDouble();
        double Discount = 0;
        double Total_price ;

        if(product_price>=10000){
            Discount = 0.25*product_price;
            Total_price = product_price - Discount;//free shipping
            System.out.println(Total_price);
        }
        else if(product_price < 10000 && product_price >=5000){
            Discount = 0.15*product_price;
            Total_price = (product_price - Discount)+100; //100 shipping charge
            System.out.println(Total_price);
        }
        else{
            Total_price = product_price +200;//shipping charge 200
            System.out.println(Total_price);
        }
    }
}
