public class BakeryGoods {
    private String name;
    private double price;
    private String expDate;
    private int quantity;
    private String peanutFree;
    private String glutenFree;
    private String soyFree;
    private String dairyFree;

    public BakeryGoods() {
    }

    public BakeryGoods(String name, double price, String expDate, int quantity, String peanutFree, String glutenFree,
                       String soyFree, String dairyFree) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.quantity = quantity;
        this.peanutFree = peanutFree;
        this.glutenFree = glutenFree;
        this.soyFree = soyFree;
        this.dairyFree = dairyFree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPeanutFree() {
        return peanutFree;
    }

    public void setPeanutFree(String peanutFree) {
        this.peanutFree = peanutFree;
    }

    public String getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(String glutenFree) {
        this.glutenFree = glutenFree;
    }

    public String getSoyFree() {
        return soyFree;
    }

    public void setSoyFree(String soyFree) {
        this.soyFree = soyFree;
    }

    public String getDairyFree() {
        return dairyFree;
    }

    public void setDairyFree(String dairyFree) {
        this.dairyFree = dairyFree;
    }

    @Override
    public String toString() {
        return "BakeryGoods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expDate='" + expDate + '\'' +
                ", quantity=" + quantity +
                ", peanutFree='" + peanutFree + '\'' +
                ", glutenFree='" + glutenFree + '\'' +
                ", soyFree='" + soyFree + '\'' +
                ", dairyFree='" + dairyFree + '\'' +
                '}';
    }
}
