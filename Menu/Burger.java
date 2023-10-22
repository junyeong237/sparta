package Project_10_17.Menu;

public class Burger extends Menu {

    int price;
    String type = "Burgers";
    String option1 = "Single";
    String option2 = "Double";

    int opt2_price = 9000;


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

    public void setOption(String option) {

        if (option.equals("1")) {
            this.setOption("Single");
        }
        else if (option.equals("2")) {
            this.setOption(option2);
            this.setPrice(opt2_price);
        }

        else System.out.println("잘못된 옵션입니다. 기본옵션으로 추가하겠습니다.");
    }

    @Override
    public String getOption() {
        return super.getOption();
    }

    public int getOpt2_price() {
        return opt2_price;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption1() {
        return option1;
    }

    public String getType(){return type;}

}
