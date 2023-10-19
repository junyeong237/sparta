package Project_10_17.Menu;

public class Forzen_Custard extends Menu {

    int price;
    public Forzen_Custard(){
        super();
    }
    public Forzen_Custard(int price) {
        this.price = price;
    }

    public Forzen_Custard(String name, String content, int price) {
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
