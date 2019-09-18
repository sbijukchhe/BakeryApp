import java.util.List;
import java.util.Scanner;

public class BakeryApp {

    BakeryGoods bakeryGoods;
    BakeryGoodsDatabase bakeryGoodsDatabase = new BakeryGoodsDatabase();


    public static void main(String[] args) {

        BakeryGoods bakeryGoods;
        BakeryGoodsDatabase bakeryGoodsDatabase = new BakeryGoodsDatabase();
        String dietRestriction = "";

        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the Brookley's Better Bakery App!");
        System.out.println("We contain peanut, gluten, soy, and dairy in our products");
        System.out.print("\nTo search for foods that you can eat,");
        System.out.println("Please enter the name of the diet restriction");
        System.out.println("Do you want to continue? : Y/N");
        String response = input.nextLine();



        while (!(response.equalsIgnoreCase("N"))) {

            System.out.println("\nPlease enter the diet restrictions : PeanutFree, GlutenFree, SoyFree or DairyFree");
            System.out.print("Or, please type \"all\" to see al list of or foods..");

            dietRestriction = input.nextLine();

            if (!(dietRestriction.trim().equalsIgnoreCase("all"))) {
                bakeryGoodsDatabase.getName(dietRestriction);

            } else {
                List<BakeryGoods> bg = bakeryGoodsDatabase.getAllBakeryGoods();
                for (BakeryGoods x : bg)
                    System.out.println("\nName: " + x.getName() + ", "+ "\tPrice: " + x.getPrice()+", "+"\tExpiry date: " +
                            x.getExpDate()+", "+ "\tQuantity: " + x.getQuantity());

            }

        }

    }
}
