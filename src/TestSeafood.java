import java.util.Scanner;

public class TestSeafood {
    public static void main(String[] args) {
        Seafood seafood1 = new Seafood();
        Scanner scan = new Scanner(System.in);

        String type;
        double weight;
        double cost;

        //Set 1
        seafood1.setWeight(0.0);
        seafood1.setCostPerPound(0.0);

        System.out.print("Type: " + seafood1.getSeafoodtype());

        System.out.print(" - Weight (oz): "); System.out.printf("%.3f", seafood1.getWeight());

        System.out.print(" - Cost per pound $"); System.out.printf("%.2f", seafood1.getCostPerPound());

        System.out.print("\nSelling price: $"+seafood1.sellingPrice());


        System.out.println("");
        System.out.println("");
        //Set2
        seafood1.setSeafoodtype("Chilean Sea Bass");
        seafood1.setWeight(160.582);
        seafood1.setCostPerPound(33.57);

        System.out.print("Type: " + seafood1.getSeafoodtype());

        System.out.print(" - Weight (oz): "); System.out.printf("%.3f", seafood1.getWeight());

        System.out.print(" - Cost per pound $"); System.out.printf("%.2f", seafood1.getCostPerPound());

        System.out.print("\nSelling price: $"); System.out.printf("%.2f", seafood1.sellingPrice());


        System.out.println("");
        System.out.println("");
        //User Input
        System.out.print("Seafood type: ");type=scan.nextLine();
        System.out.print("Weight (oz): ");weight=scan.nextDouble();
        System.out.print("Cost per pound: ");cost=scan.nextDouble();

        Seafood seadfood2 = new Seafood(type,weight,cost);

        System.out.print("Type: " + seadfood2.getSeafoodtype());

        System.out.print(" - Weight (oz): "); System.out.printf("%.3f", seadfood2.getWeight());

        System.out.print(" - Cost per pound $"); System.out.printf("%.2f", seadfood2.getCostPerPound());

        System.out.print("\nSelling price: $"); System.out.printf("%.2f", seadfood2.sellingPrice());
    }
}
