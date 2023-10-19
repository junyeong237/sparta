package Project_10_17.Menu;

public class Beer extends Menu {

    int price;
    public Beer(){
        super();
    }
    public Beer(int price) {
        this.price = price;
    }

    public Beer(String name, String content, int price) {
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


