package Project_10_17.Menu;

public class Menu {


    private String name;
    private String content;

    private int count;
    private String option;
    public Menu(){

    }

    public Menu(String name,String content){
        this.name = name;
        this.content = content;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add_menu_count(){
        this.count += 1;
    }

    public int getPrice() {
        return 0;
    }
    public void setPrice(int pri) {
        return;
    }
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
