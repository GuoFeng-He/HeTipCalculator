import java.util.Scanner;

public class TipCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome user");
        System.out.print("Number of people eating: ");
        int peopleEating = scan.nextInt();
        System.out.print("Tip Percentage? (as an int): ");
        int tipPercentage = scan.nextInt();
        System.out.println();
        double itemCost = 0;
        double totalCost = 0;

        while (itemCost != -1){
            System.out.print("Enter a cost in dollars and cents, (e.g. 12.50) -1 to end: ");
            itemCost = scan.nextDouble();
            totalCost += itemCost;
        }

        totalCost += 1;
        double tip = (double) tipPercentage / 100 * totalCost;
        System.out.println("----------------------");
        System.out.println("Total bill before tip: " + totalCost);
        System.out.println("Total Percentage: " + tipPercentage + "%");
        System.out.println("Total Tip: " + tip);
        System.out.println("Total bill with tip: " + (totalCost + tip) %.2f);
        System.out.println("Per person cost before tip: " + (totalCost / peopleEating) %.2f);
        System.out.println("Tip per person: " + (tip / peopleEating) %.2f);
        System.out.println("Total cost per person: " + ((totalCost / peopleEating) + (tip / peopleEating)) %.2f);

    }
}