package Project_10_17;

import Project_10_17.Menu.Burger;
import Project_10_17.Menu.Menu;

import java.util.Scanner;

public class Console_View {

    private Scanner sc = new Scanner(System.in);
    String origin = "SHAKESHACK";

    String[] menu = {"Burger","Forzen_Custard","Drinks","Beer","Order","Cancel"};
    public String start_view(){
        System.out.println("\"SHAKESHACK BURGER 에  오신걸환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
       // System.out.println(); //한칸 띄기

        Menu choiced_menu = new Menu();

        System.out.println("[SHAKESHACK MENU]");
        System.out.println("1." + menu[0] + "| 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2." + menu[1] + "| 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3." + menu[2] + "| 매장에서 직접 만드는 음료");
        System.out.println("4." + menu[3] + "| 뉴욕 브루클린 브루어리에서 양조한 맥주\n");

        System.out.println("[ORDER MENU]");
        System.out.println("5." + menu[4] + "| 장바구니를 확인 후 주문합니다.");
        System.out.println("6." + menu[5] + "| 진행중인 주문을 취소합니다.\n");
        return sc.nextLine();

    }

    public Menu choice_view(Menu[] bm){
        System.out.println("\"SHAKESHACK BURGER 에  오신걸환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        //System.out.println(); //한칸 띄기

        System.out.println("[" + bm[0].getType() + "]" +"MENU]");
        for(int i = 0; i<bm.length; i++) {
            System.out.println((i+1) + ". " + bm[i].getName() + "|" + bm[i].getPrice() + "|" + bm[i].getContent());
        }
        int bc = sc.nextInt();
        sc.nextLine();
        return bm[bc-1];
    }


    public void Buy_view(Menu buy_burger, Order orders){
        System.out.println(buy_burger.getName() + "\t|\t W" + buy_burger.getPrice() + "\t|\t" + buy_burger.getContent());
        System.out.println("위 메뉴에 어떤 옵션을 추가하겠습니까?\n");
//        int single_price = 5400;
//        int double_price = 9000;
//        String opt_single = "Single";
//        String opt_double =  "Dobule";
        System.out.println("1. " + buy_burger.getOption1() + "(" + buy_burger.getPrice() + ")\t" + "2. " + buy_burger.getOption2()  + "(" + buy_burger.getOpt2_price() + ")\n");
        String buy_check_opt = sc.nextLine();
        buy_burger.setOption(buy_check_opt);
        System.out.println("\n");

        System.out.println(buy_burger.getName()+ "(" + buy_burger.getOption1() + ")" + "\t|\t W" + buy_burger.getPrice() + "\t|\t" + buy_burger.getContent());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?\n");
        System.out.println("1. 확인        2. 취소\n");

        int buy_check_num = sc.nextInt();
        sc.nextLine();
        switch (buy_check_num) {
            case 1:
                orders.add_menu(buy_burger);
                System.out.println(buy_burger.getName() + "가 장바구니에 추가되었습니다.\n");
                break;
            case 2:
                System.out.println("장바구니에 추가하지 않으셨습니다.\n");
                break;
        }



    }

    public void Order_view(Order orders){
        while(true) {
            System.out.println("아래와 같이 주문 하시겠습니까?\n");
            int total = 0;
            System.out.println("[   Orders   ]");

            for (int i = 0; i < orders.size(); i++) {
                Menu menu_temp = orders.getOrder_menu().get(i);
                System.out.println((menu_temp.getName() + "\t|\t" + menu_temp.getPrice() + "\t|" + menu_temp.getCount() + "개\t|t" + menu_temp.getContent()));
                total += menu_temp.getPrice() * (menu_temp.getCount());
            }

            System.out.println("\n");
            System.out.println("[   Total   ]\n");
            System.out.println(total + "원\n");
            System.out.println("1. 주문      2. 메뉴판\n");

            int order_check = sc.nextInt();
            sc.nextLine();

            switch (order_check) {
                case 1:
                    System.out.println("대기번호는 [ 1 ]번입니다.");
                    System.out.println("주문이 완료되었습니다.");
                    System.out.println("3초 후 메뉴판으로 돌아갑니다.\n");
                    orders.getSold_list().addAll(orders.getOrder_menu());
                    orders.getOrder_menu().clear();
                    try {
                        // 3초(3000 밀리초) 동안 대기
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        // InterruptedException이 발생할 경우 처리할 코드를 여기에 추가할 수 있습니다.
                        e.printStackTrace();
                    }
                    return;
                case 2:
                    return;
                default:
                    System.out.println("잘못된 숫자입니다.\n");
                    break;

            }

        }


    }



    public void cancel(Order orders){
        while(true){
            System.out.println("진행하던 주문을 취소하시겠습니까?\n");
            System.out.println("1. 확인        2. 취소\n");
            int cancel_num = sc.nextInt();
            sc.nextLine();
            switch (cancel_num){
                case 1:
                    orders.cancel_menu();
                    System.out.println("진행하던 주문이 취소되었습니다\n");
                    System.out.println();
                    return;
                case 2:
                    System.out.println("주문취소를 취소하였습니다.\n");

                    return;

                default:
                    break;
            }
        }


    }

    public void total_view(Order orders){
        while(true) {
            int total = 0;
            for (Menu menu : orders.getSold_list()) {
                total += menu.getPrice() * (menu.getCount());
            }
            System.out.println("\n[ 총 판매금액 현황 ]");
            System.out.println("현재까지 총 판매된 금액은 [ W" + total + "] 입니다.\n");

            System.out.println("[ 총 판매목록 현황 ]");

            for (Menu menu : orders.getSold_list()) {
                System.out.println("- " + menu.getName() + "\t |" + menu.getPrice());
            }
            System.out.println();
            System.out.println("1.돌아가기\n");
            String return_view = sc.nextLine();
            if (return_view.equals("1")) {

                return;
            }

            else {
                System.out.println("잘못된 입력입니다.");
                break;
            }
        }

    }
}


