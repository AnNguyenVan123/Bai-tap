import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        final  int ADMIN = 1;
        final int USER = 2 ;
        ArrayList<Post> list_post  = new ArrayList<Post>();
        Post post_1 = new Post(1,"Post 1","a", new Date(2020,1,1),null);
        Post post_2 = new Post(2,"Post 2 ","b",new Date(2020,1,1),null);
        list_post.add(post_1);
        list_post.add(post_2);
        while (true) {
           int role = 0;
           if(role==0) {
               System.out.println(" Đăng nhập : " +
                       "\n 1. Admin"
                       + "\n 2. User"
               );
               role = inputInt(new SigninInputException());
           }

            if (role == ADMIN) {
                while (true) {
                    System.out.println("1. Thêm: Nhập vào id, title, content. createAt lấy thời gian hiện tại, updateAt để null\n" +
                            "2. Cập nhập. Nhập và id muốn sửa, nhập vào title, content mới, updateAt lấy thời gian hiện tại\n" +
                            "3. Xóa\n" +
                            "4. Hiện danh sách\n" +
                            "5. Đăng xuất");
                    int choice = inputInt(new AdminInputException());
                    if (choice == 5) {
                        role = 0;
                        break;
                    }
                    if (choice == 1) {
                        try {

                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Nhập vào id :");
                            int id = 0;
                            while (id <= 0) {
                                id = inputInt(null);

                                for (int i = 0; i < list_post.size(); i++) {
                                    if (list_post.get(i).getId() == id) {
                                        throw new Exception("Bai viet da ton tai");
                                    }
                                }
                            }

                            System.out.println("Nhập vào title :");

                            String title = scanner.nextLine();
                            System.out.println("Nhập vào content :");
                            String content = scanner.nextLine();


                            Date date = new java.util.Date();
                            Post new_post = new Post(id, title, content, date, null);
                            list_post.add(new_post);

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }


                    }
                    if (choice == 2) {
                        try {
                            System.out.println("Nhập vào id muon sua:");
                            Scanner scanner = new Scanner(System.in);
                            int id = 0;
                            while (id <= 0) {
                                id = inputInt(null);
                            }

                            Post post_fixed = null;
                            for (int i = 0; i < list_post.size(); i++) {
                                if (list_post.get(i).getId() == id) {
                                    post_fixed = list_post.get(i);
                                }

                            }
                            if (post_fixed != null) {
                                System.out.println("Nhập vào title moi:");
                                String title = scanner.nextLine();
                                post_fixed.setTitle(title);
                                System.out.println("Nhập vào content moi:");
                                String content = scanner.nextLine();
                                post_fixed.setContent(content);
                                post_fixed.setUpdate_at(new java.util.Date());
                            } else {
                                throw new Exception("Bai viet ko ton tai");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }


                    }
                    if (choice == 3) {

                        System.out.println("Nhap id muon xoa :");

                        int id = inputInt(null);

                        for (int i = 0; i < list_post.size(); i++) {
                            if (list_post.get(i).getId() == id) {
                                list_post.remove(i);
                            }
                        }


                    }
                    if (choice == 4) {
                        for (int i = 0; i < list_post.size(); i++) {
                            System.out.println(list_post.get(i));
                        }
                        ;
                    }


                }


            }
            if (role == USER) {
                while (true) {
                    System.out.println(
                            "1. Hiện danh sách với title, createAt\n" +
                                    "2. Xem chi tiết: nhập vào id, hiện bài viết với: id, title, content, createAt, updateAt\n" +
                                    "3. Tìm kiếm theo từ khóa có trong title hoặc content\n"
                                    + "4.Dang xuat."
                    );
                    int choice = inputInt(new AdminInputException());
                    if (choice == 4) {
                        role=0 ;
                        break;
                    }
                    if (choice == 1) {
                        System.out.println("---------------------------");
                        System.out.println("| TITLE      | CREATE AT   |");
                        System.out.println("---------------------------");
                        for (int i = 0; i < list_post.size(); i++) {
                            System.out.println("| " + list_post.get(i).getTitle() + "  |  " + list_post.get(i).getCreate_at() + " |");
                        }
                    }
                    if (choice == 2) {
                        System.out.println("Nhap vao id :");

                        int id = 0;
                        while (id <= 0) {
                            id = inputInt(null);
                        }
                        if (list_post.get(id) != null) {
                            System.out.println(list_post.get(id));
                        } else {
                            System.out.println("Bai viet ko ton tai");
                        }
                    }
                    if (choice == 3) {
                        System.out.println("Nhap tu khoa :");
                        ArrayList<Post> list_search = new ArrayList<>();
                        Scanner scanner = new Scanner(System.in);
                        String key = scanner.nextLine();
                        for (int i = 0; i < list_post.size(); i++) {
                            if (list_post.get(i).getTitle().contains(key) || list_post.get(i).getContent().contains(key)) {
                                list_search.add(list_post.get(i));
                            }
                        }
                        for (int i = 0; i < list_search.size(); i++) {
                            System.out.println(list_search.get(i));
                        }
                    }


                }

            }
        }

        };


    static int inputInt( InputException e) {
        int num = -1;
        Scanner scanner = new Scanner(System.in);
        try {

            num = scanner.nextInt();
            if(e == null){
                if (num <=0){
                    throw new Exception("Gia tri phai > 0");
                }
               return  num;

            }

            if(e.getException(num)!= null){
                throw e.getException(num);
            }
        } catch (Exception ex) {
            if (ex.getMessage()==null){
                System.out.println("Chi nhap gia tri so");
            }
            else {
                System.out.println(ex.getMessage());
            }
            scanner.nextLine();
        }
        return num
                ;}
    }



