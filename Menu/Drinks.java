package Project_10_17.Menu;

public class Drinks extends Menu {

    int price;
    public Drinks(){
        super();
    }
    public Drinks(int price) {
        this.price = price;
    }

    public Drinks(String name, String content, int price) {
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
