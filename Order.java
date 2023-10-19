package Project_10_17;

import Project_10_17.Menu.Menu;

import java.util.ArrayList;

public class Order {

    private ArrayList<Menu> order_menu;
    //private ArrayList<Menu> sold_list;

    public Order(){
        order_menu = new ArrayList<>();
        //sold_list = new ArrayList<>();
    }

    public void add_menu(Menu menu){
        if (this.order_menu.contains(menu)){
            menu.add_menu_count();
            return;
        }
        this.order_menu.add(menu);
        menu.add_menu_count();


    }

    public void cancel_menu(){
        this.order_menu.clear();
    }

    public int size(){
        return this.order_menu.size();
    }

    public ArrayList<Menu> getOrder_menu() {
        return order_menu;
    }
}
