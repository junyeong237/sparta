package Project_10_17.Menu;

public class Forzen_Custard extends Menu {

    int price;
    String type = "Frozen_Custard";
    String option2 = "Large_size";
    String option1 = "Middle_size";
    int opt2_price = 3000;
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


    public void setOption(String option) {

        if (option.equals("1")) {
            this.setOption(option1);
        }
        else if (option.equals("2")) {
            this.setOption(option2);
            this.setPrice(opt2_price);
        }


        else System.out.println("잘못된 옵션입니다. 기본옵션으로 추가하겠습니다.");
    }

    public String getOption() {
        return super.getOption();
    }
    public String getOption2() {
        return option2;
    }

    public int getOpt2_price(){
        return opt2_price;
    }

    public String getOption1() {
        return option1;
    }

    public String getType(){return type;}

}
