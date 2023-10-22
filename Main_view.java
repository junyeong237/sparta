package Project_10_17;

import Project_10_17.Menu.Burger;
import Project_10_17.Menu.Drinks;
import Project_10_17.Menu.Forzen_Custard;
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

        Menu[] Forzen_Custard_menu = new Menu[3];
        Forzen_Custard_menu[0] = new Forzen_Custard("Soft serve","크림을 쭈욱 짜내어 콘 위에 얹는 아이스크림 콘",1500);
        Forzen_Custard_menu[1] = new Forzen_Custard("Popsicle","우리가 하드라고 부르는 이 막대 아이스크림",2000);
        Forzen_Custard_menu[2] = new Forzen_Custard("sorbet","일 퓨레나 커피, 초콜릿과 설탕시럽을 섞어 얼려 저어서 만드는 아이스크림",2500);

        Menu[] Drinks_menu = new Menu[3];
        Drinks_menu[0] = new Drinks("ade","탄산을 섞은 시원한 과즙 음료",1800);
        Drinks_menu[1] = new Drinks("Coffee","카페라떼&아메리카노 두종류의 커피",2000);
        Drinks_menu[2] = new Drinks("carbodanted drink","일반적인 탄산 음료",1500);



        Menu[] Beers_menu = new Menu[3];
        Beers_menu[0] = new Drinks("Cass","가벼우면서 상쾌한 맛으로 유명합니다",2300);
        Beers_menu[1] = new Drinks("Hite","깨끗하고 상쾌한 맛으로 유명합니다.",2400);
        Beers_menu[2] = new Drinks("Kloud drink"," 세련된 맥주 경험을 원하는 이들에게 인기가 있습니다",3000);


        Order orders = new Order();



        while(true){
            choice_menu = consoleview.start_view();

            switch (choice_menu){

                case "1" :
                    Menu burger_choice = consoleview.choice_view(Burgers_menu);
                    consoleview.Buy_view(burger_choice,orders);
                    break;
                case "2" :
                    Menu Forzen_Custard_choice = consoleview.choice_view(Forzen_Custard_menu);
                    consoleview.Buy_view(Forzen_Custard_choice,orders);
                    break;
                case "3" :
                    Menu Drinks_choice = consoleview.choice_view(Drinks_menu);
                    consoleview.Buy_view(Drinks_choice,orders);
                    break;
                case "4" :
                    Menu Beers_choice = consoleview.choice_view(Beers_menu);
                    consoleview.Buy_view(Beers_choice,orders);
                    break;
                case "5" :
                    consoleview.Order_view(orders);
                    break;
                case "6" :
                    consoleview.cancel(orders);
                    break;

                case "0" :
                    consoleview.total_view(orders);
                    break;

                case "q" :
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }


        }

    }

}
