
// some changes


import java.util.*; //The utility package
public class products {
//the decalaration of variables
String product_id, product_description;
int x,qty, unitprice;
double amount,discnt,famnt;
 
Scanner kek = new Scanner(System.in); 
 
public void accept()//Beginning of the accepting scope
{
 System.out.println("Please enter the Product ID:");
 product_id = kek.next();
 
 System.out.println("Please enter the Product description:");
 product_description = kek.next();
 
 System.out.println("Please enter the unit price:");
 unitprice= kek.nextInt();
 
 System.out.println("Please enter the product quantity:");
 qty= kek.nextInt();
 
 amount = qty*unitprice;
 
 System.out.println("The total amount = " + amount);
}//End of the accepting scope
public void discount()//Beginning of the Discount scope
{
 //Beginning of the if declaration
 if(amount <=100)
 {
 System.out.println("Please you do not qualify For a dicount");
 System.out.println("The Final amount = " + amount);
 }
 else if (amount <=150)
 {
 discnt= 0.05*amount;
 System.out.println("Your discount is " + discnt );
 famnt= amount - discnt;
 System.out.println("The Final amount = " + famnt);
 }
 else if (amount <= 200)
 {
 discnt= 0.1*amount;
 System.out.println("Your discount is " + discnt );
 famnt= amount - discnt;
 System.out.println("The Final amount is " + famnt);
 }
 else if (amount <=250)
 {
 discnt= 0.15*amount;
 System.out.println("Your discount is " + discnt );
 famnt= amount - discnt;
 System.out.println("The Final amount = " + famnt);
 }
 else
 {
 discnt= 0.2*amount;
 System.out.println("Your discount is " + discnt );
 famnt= amount - discnt;
 System.out.println("The Final amount = " + famnt);
 }
 
 System.out.println("To Go Over Choose 1 Otherwise 2 ");
 x= kek.nextInt();
}//End of the discount scope
public void loop()
{
do
{
 accept();
 discount(); 
}
while (x==1);
}
public static void main(String args[])
{
Products kek = new Products();
kek.loop();
}
}