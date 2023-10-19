package Project_10_17.Menu;

public class Burger extends Menu {

    int price;
    public Burger(){
        super();
    }
    public Burger(int price) {
        this.price = price;
    }

    public Burger(String name, String content, int price) {
        super(name, content);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
