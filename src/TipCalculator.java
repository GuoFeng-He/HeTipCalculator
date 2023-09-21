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
        StringBuilder itemList = new StringBuilder();

        while (itemCost != -1) {
            System.out.print("Enter a cost in dollars and cents, (e.g. 12.50) -1 to end: ");
            itemCost = scan.nextDouble();
            scan.nextLine();
            totalCost += itemCost;
            if (itemCost != -1) {
                System.out.print("Enter item name: ");
                String itemName = scan.nextLine();
                itemList.append(itemName).append("\n"); // adding spaces courtesy of: https://stackoverflow.com/questions/7833689/how-can-i-print-a-string-adding-newlines-in-java
            }
        }

        scan.close();
        totalCost += 1;
        double tip = (double) tipPercentage / 100 * totalCost;
        System.out.println("----------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total Percentage: " + tipPercentage + "%");
        System.out.println("Total Tip: $" + String.format("%.2f", tip));
        System.out.println("Total bill with tip: $" + String.format("%.2f", totalCost + tip));
        System.out.println("Per person cost before tip: $" + String.format("%.2f",(totalCost / peopleEating)));
        System.out.println("Tip per person: $" + String.format("%.2f", (tip / peopleEating)));
        System.out.println("Total cost per person: $" + String.format("%.2f",(totalCost / peopleEating) + (tip / peopleEating)));
        System.out.println("------------------------");
        System.out.println("Items Ordered:");
        System.out.println(itemList);
    }
}