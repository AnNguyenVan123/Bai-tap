import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list_product = new ArrayList<>();
        ArrayList<Category> list_category = new ArrayList<>();
       

        Category category1 = new Category(1,"quan ao");
        Category category2  =new Category(2 , "may tinh");
        Product product1 = new Product(1,"ao so mi",category1);
        Product product2 = new Product(2,"Dell",category2);
        list_product.add(product1);
        list_product.add(product2);
        list_category.add(category1);
        list_category.add(category2);
        while (true) {
        System.out.println("Lua chon :\n 1.Hien thi menu\n 2.Them moi");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
           for (int i = 0; i < list_product.size(); i++) {
               System.out.println(list_product.get(i));
           }
        }
        if (choice==2) {
            scanner.nextLine();
            System.out.println("Nhap ten san pham :");
            String name = scanner.nextLine();
            System.out.println("Nhap danh muc san pham :");
           
            int category_id = scanner.nextInt();
            Category category = null;
            try {
                boolean has_category = false;
                for (int i = 0; i < list_category.size(); i++) {
                    if(list_category.get(i).getId()==category_id){
                        has_category = true;
                        category = list_category.get(i);
                    }
                }
                if(!has_category){
                    throw new Exception("Ko ton tai danh muc");
                }
            } catch (Exception e) {
                 System.out.println(e.getMessage());
            }
        Product new_product = new Product(list_product.size()+1,name,category);
           list_product.add(new_product);
           if(category!= null){
            System.out.println("Them thanh cong");
           }
        }
        if(choice ==0) {
            break;
        }

        }
      

    }
}
