package dailyjavarevisits;

import java.util.Scanner;

public class MegaMart {

	public static void main(String[] args) {

		double billAmt=0, dPercent = 0, discount=0;
		int custID;
		String custType;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Customer ID: ");
		custID = scan.nextInt();
		if(custID <= 0)
		{
			System.out.println(custID+" is not a valid Customer ID ");
			return;
		}
		System.out.println("Enter the bill amount: ");
		billAmt = scan.nextDouble();
		if(billAmt < 0)
		{
			System.out.println(billAmt+" is not a valid Bill Amount");
			return;
		}

		if(billAmt >= 1000)
		{
			if(custID>0 && custID<=100)
			{
				custType = "Bronze";
				dPercent = 15;
			}
			else if(custID>100 && custID<=25)
			{
				custType = "Silver";
				dPercent = 18;
			}
			else if(custID>250 && custID<=500)
			{
				custType = "Gold";
				dPercent = 23;
			}
			else if(custID>500 && custID<=1000)
			{
				custType = "Platinum";
				dPercent = 28;
			}
			else
			{
				custType = "Diamond";
				dPercent = 32;
			}
			discount = billAmt*(dPercent/100);
			System.out.println("Discount % is: "+dPercent);
			System.out.printf('\n'+"Final Bill Amount is "+"%.2f",(billAmt-discount));
			return;

		}
		else
			System.out.println("Discount % is: "+dPercent);
		System.out.println("Bill Amount is "+billAmt);
	}
}
