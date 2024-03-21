import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double edge_1 = scanner.nextDouble();
        double edge_2 = scanner.nextDouble();
        double edge_3 = scanner.nextDouble();
        try {
            if(edge_1<=0||edge_2<=0||edge_3<=0||edge_1+edge_2<=edge_3||edge_2+edge_3<=edge_1||edge_1+edge_3<=edge_2 ){
                throw new IllegalTriangleException();
            }
        }
        catch( Exception e){
            System.out.println(e.getMessage());
        }
    }
}
