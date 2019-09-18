import java.util.ArrayList;
import java.util.List;

public class BakeryGoodsDatabase {

    private BakeryGoods bakeryGoods;
    private List<BakeryGoods> bakeryGoodsList;
    List<BakeryGoods> bgList;

    public BakeryGoodsDatabase(){

        BakeryGoods BananaBread = new BakeryGoods("BananaBread",1.0, "09/20/2019", 6,
                "notPeanutFree","GlutenFree","notSoyFree", "DairyFree");
        BakeryGoods CinnamonBread = new BakeryGoods("CinnamonBread",2.0, "09/21/2019", 7,
                "peanutFree","notGlutenFree","soyFree", "notDairyFree");

        BakeryGoods SavoryRolls = new BakeryGoods("SavoryRolls",3.0, "09/22/2019", 8,
                "peanutFree","notGlutenFree","notSoyFree", "DairyFree");
        BakeryGoods DinnerRolls = new BakeryGoods("DinnerRolls",2.0, "09/22/2019", 6,
                "peanutFree","notGlutenFree","soyFree", "DairyFree");
        BakeryGoods GingerBread = new BakeryGoods("GingerBread",4.0, "09/23/2019", 12,
                "notPeanutFree","notGlutenFree","soyFree", "notDairyFree");
        BakeryGoods BreadPudding = new BakeryGoods("BreadPudding",3.0, "09/22/2019", 8,
                "peanutFree","notGlutenFree","notSoyFree", "notDairyFree");
        BakeryGoods Muffin = new BakeryGoods("Muffin",3.0, "09/22/2019", 8,
                "notPeanutFree","notGlutenFree","soyFree", "notDairyFree");
        BakeryGoods Empanadas = new BakeryGoods("Empanadas",2.0, "09/23/2019", 12,
                "peanutFree","notGlutenFree","notSoyFree", "notDairyFree");

        BakeryGoods RaisinBread = new BakeryGoods("RaisinBread",4.0, "09/25/2019", 10,
                "peanutFree","notGlutenFree","soyFree", "notDairyFree");
        BakeryGoods HamBurgurBuns = new BakeryGoods("HamBurgurBuns",3.0, "09/27/2019", 12,
                "notPeanutFree","notGlutenFree","notSoyFree", "notDairyFree");
        BakeryGoods SugarCookie = new BakeryGoods("SugarCookie",1.0, "09/22/2019", 12,
                "notPeanutFree","notGlutenFree","soyFree", "notDairyFree");
        BakeryGoods ChocolateChipCookie = new BakeryGoods("ChocolateChipCookie",1.5, "09/22/2019",
                8,"peanutFree","notGlutenFree","soyFree", "notDairyFree");
        BakeryGoods FallPumpkin = new BakeryGoods("FallPumpkin",3.0, "09/20/2019", 15,
                "peanutFree","notGlutenFree","notSoyFree", "notDairyFree");
        BakeryGoods SpringEasyCake = new BakeryGoods("SpringEasyCake",4.0, "09/24/2019", 6,
                "peanutFree","notGlutenFree","notSoyFree", "notDairyFree");
        BakeryGoods LemonEasyCake = new BakeryGoods("LemonEasyCake",3.0, "09/23/2019", 8,
                "notPeanutFree","GlutenFree","soyFree", "DairyFree");

        bakeryGoodsList = new ArrayList<>();
            bakeryGoodsList.add(BananaBread);
            bakeryGoodsList.add(CinnamonBread);
            bakeryGoodsList.add(SavoryRolls);
            bakeryGoodsList.add(DinnerRolls);
            bakeryGoodsList.add(GingerBread);
            bakeryGoodsList.add(BreadPudding);
            bakeryGoodsList.add(Muffin);
            bakeryGoodsList.add(Empanadas);
            bakeryGoodsList.add(RaisinBread);
            bakeryGoodsList.add(HamBurgurBuns);
            bakeryGoodsList.add(SugarCookie);
            bakeryGoodsList.add(ChocolateChipCookie);
            bakeryGoodsList.add(FallPumpkin);
            bakeryGoodsList.add(SpringEasyCake);
            bakeryGoodsList.add(LemonEasyCake);

    }

    public List<BakeryGoods> getAllBakeryGoods() {
        return bakeryGoodsList;
    }


    public  void getName(String dietRestriction) {

        for (BakeryGoods x : bakeryGoodsList) {
            if (dietRestriction.trim().equalsIgnoreCase((x.getPeanutFree()))) {
                System.out.println("\nName: " + x.getName() + ", "+ "\tPrice: " + x.getPrice()+", "+"\tExpiry date: " +
                        x.getExpDate()+", "+ "\tQuantity: " + x.getQuantity());
            }
            else if (dietRestriction.trim().equalsIgnoreCase((x.getGlutenFree()))) {
                System.out.println("\nName: " + x.getName() + ", "+ "\tPrice: " + x.getPrice()+", "+"\tExpiry date: " +
                        x.getExpDate()+", "+ "\tQuantity: " + x.getQuantity());
            }
            else if (dietRestriction.trim().equalsIgnoreCase((x.getSoyFree()))) {
                System.out.println("\nName: " + x.getName() + ", "+ "\tPrice: " + x.getPrice()+", "+"\tExpiry date: " +
                        x.getExpDate()+", "+ "\tQuantity: " + x.getQuantity());
            }
            else if (dietRestriction.trim().equalsIgnoreCase((x.getDairyFree()))) {
                System.out.println("\nName: " + x.getName() + ", "+ "\tPrice: " + x.getPrice()+", "+"\tExpiry date: " +
                        x.getExpDate()+", "+ "\tQuantity: " + x.getQuantity());
            }
        }
    }
}
