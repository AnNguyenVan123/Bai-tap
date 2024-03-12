import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    final static int ENGINEER = 1;
    final static  int WORKER = 2 ;
    final static  int STAFF = 3 ;
    public static void main(String[] args) {
        ArrayList<Officer> list = new ArrayList<>();

        ManageOfficer menu = new ManageOfficer(list);

       while(true)
      { System.out.println("----Menu----" +
                "\n 1. Them can bo" +
                "\n 2. Tim kiem can bo" +
                "\n 3. Xem danh sach" +
                "\n 4. Thoat"
        );
        Scanner scanner = new Scanner(System.in);
       int choice = scanner.nextInt();
        if(choice ==1)  {
           ;
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Nhap ten :");
            String full_name = scanner1.nextLine();
            System.out.println("Nhap tuoi :");
            int age = scanner1.nextInt();
            scanner1.nextLine();
            System.out.println("Nhap gioi tinh :");
            String gender = scanner1.nextLine();
            System.out.println("Nhap dia chi :");
            String address = scanner1.nextLine();

            System.out.println("Nhap vi tri :");
            int role = scanner1.nextInt();
            scanner1.nextLine();
            switch (role) {
                case ENGINEER :
                    System.out.println("Nhap nganh  :");
                    String major = scanner1.nextLine();
                    menu.AddOfficers(new Engineer(full_name,age,gender,address,major));
                    break;
                case  WORKER:
                    System.out.println("Nhap cap do  :");
                    int level = scanner1.nextInt();
                    menu.AddOfficers(new Worker(full_name,age,gender,address,level));
                    break;
                case  STAFF:
                    System.out.println("Nhap viec  :");
                   String work = scanner1.nextLine();
                    menu.AddOfficers(new Staff(full_name,age,gender,address,work));
                    break;
            }
        }
        if (choice ==2 ){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Nhap ten can tim kiem :");
            String full_name = scanner2.nextLine();
            System.out.println(menu.FindByFullName(full_name));
            ;

        }
        if(choice==3){
            menu.ShowMenu();
        }
        if (choice==4){
            break;
        }
    }}
}
