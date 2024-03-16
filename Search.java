import java.util.ArrayList;

public interface Search {
    public ArrayList<Product>search( ArrayList<Product> list_product, String key);
    public ArrayList<Product>search( ArrayList<Product> list_product, int min , int max);
}
