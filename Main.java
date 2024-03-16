import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Product A = new Product("A",200,15,"a");
        Product B = new Product("B",300,20,"b");
        list.add(A);
        list.add(B);
        while (true){
            System.out.println("---Menu---"
                            +"\n1. Xem danh sach"
                            +"\n2. Tim kiem  "
                            +"\n3. Sap xep theo gia tang dan"
                            +"\n4. Sap xep theo gia giam dan"
                            +"\n5. Sap xep theo so luong giam dan"
                            +"\n6. Tim theo hang "
                            +"\n7. Tim theo khoang gia "
                            +"\n8. Thoat "
            );
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1 ){
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            if(choice == 2 ){
                System.out.println("Nhap tu khoa tim kiem :");
                Scanner scanner1 = new Scanner(System.in);
                String key = scanner1.nextLine();
                Search search_by_name = new SearchByName();
                ArrayList<Product> result = search_by_name.search(list,key);
                if(result==null){
                    System.out.println("Ko ton tai.");
                }
                else {
                for (int i = 0; i < result.size(); i++) {
                    System.out.println(result.get(i));
                }
                }
            }
            if (choice == 3){
                Sort sort_by_price = new SortByPrice();
                sort_by_price.sort_ascending(list);
            }
            if (choice == 4){
                Sort sort_by_price = new SortByPrice();
                sort_by_price.sort_decreasing(list);
            }
            if (choice == 6){
                System.out.println("Nhap tu khoa tim kiem :");
                Scanner scanner2 = new Scanner(System.in);
                String key = scanner2.nextLine();
                Search search_by_brand = new SerachByBranch();
                ArrayList<Product> result = search_by_brand.search(list,key);
                if (result==null){
                    System.out.println("Ko ton tai.");
                }
                else {
                    for (int i = 0; i < result.size(); i++) {
                        System.out.println(result.get(i));
                    }
                }

            }
            if(choice==5){
                Sort sort_by_quantity = new SortByQuantity();
                sort_by_quantity.sort_decreasing(list);
            }
            if (choice==7){
                System.out.println("Nhap gia tri min :");
                Scanner scanner3 = new Scanner(System.in);

                int min = scanner3.nextInt();
                System.out.println("Nhap gia tri max :");
                int max = scanner3.nextInt();
                Search search_by_price = new SearchByPrice();
                ArrayList<Product> result = search_by_price.search(list,min,max);
                if (result==null){
                    System.out.println("Ko ton tai.");
                }
                else{
                for (int i = 0; i < result.size(); i++) {
                    System.out.println(result.get(i));
                }}
            }
            if(choice==8){
                break;
            }


        }
    }
}
