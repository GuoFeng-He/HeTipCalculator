import java.util.Scanner;

public class TipCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome user");
        // initializes variables
        System.out.print("Number of people eating: ");
        int peopleEating = scan.nextInt();
        System.out.print("Tip Percentage? (as an int): ");
        int tipPercentage = scan.nextInt();
        double itemCost = 0;
        double totalCost = 0;
        StringBuilder itemList = new StringBuilder();

        // loop for inputting items into the receipt
        while (itemCost != -1) {
            System.out.print("\nEnter a cost in dollars and cents, (e.g. 12.50) -1 to end: ");
            itemCost = scan.nextDouble();
            scan.nextLine();
            if (itemCost != -1) {
                System.out.print("Enter item name: ");
                String itemName = scan.nextLine();
                System.out.print("Enter amount: ");
                int amount = scan.nextInt();
                itemList.append(itemName).append(" (").append(amount).append(")").append("\n"); // adding spaces courtesy of: https://stackoverflow.com/questions/7833689/how-can-i-print-a-string-adding-newlines-in-java
                totalCost += (itemCost * amount);
            }
        }
        scan.close();

        // calculates values for the receipt
        double costPerPerson = totalCost / peopleEating;
        double tip = (double) tipPercentage / 100 * totalCost;
        double tipPerPerson = tip / peopleEating;

        // prints the receipt
        System.out.println("----------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total Percentage: " + tipPercentage + "%");
        System.out.println("Total Tip: $" + String.format("%.2f", tip));
        System.out.println("Total bill with tip: $" + String.format("%.2f", totalCost + tip));
        System.out.println("Per person cost before tip: $" + String.format("%.2f",(costPerPerson)));
        System.out.println("Tip per person: $" + String.format("%.2f", (tipPerPerson)));
        System.out.println("Number of people eating: " + peopleEating);
        System.out.println("Total cost per person: $" + String.format("%.2f",(costPerPerson) + (tipPerPerson)));
        System.out.println("------------------------");
        System.out.println("Items Ordered:");
        System.out.println(itemList);
    }
}