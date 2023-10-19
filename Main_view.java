package Project_10_17;

import Project_10_17.Menu.Burger;
import Project_10_17.Menu.Menu;

public class Main_view {
    public static void main(String[] args) {

//        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
//        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");

        Console_View consoleview = new Console_View();
        String choice_menu;
        Menu[] Burgers_menu = new Menu[5];
        Burgers_menu[0] = new Burger("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거",6900);
        Burgers_menu[1] = new Burger("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",8900);
        Burgers_menu[2] = new Burger("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",9400);
        Burgers_menu[3] = new Burger("CheeseBurger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",6900);
        Burgers_menu[4] = new Burger("HamBurger","비프패티를 기반으로 야채가 들어간 기본버거",5400);

        Order orders = new Order();



        while(true){
            choice_menu = consoleview.start_view();

            switch (choice_menu){

                case "1" :
                    Menu burger_choice = consoleview.choice_view(Burgers_menu);
                    consoleview.Buy_view(burger_choice,orders);
                    break;

                case "5" :
                    consoleview.Order_view(orders);
                    break;
                case "6" :
                    consoleview.cancel(orders);
                    break;

                case "0" :
                    consoleview.total_view(orders);
            }


        }

    }

}
