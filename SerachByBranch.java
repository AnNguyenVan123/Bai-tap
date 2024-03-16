import java.util.ArrayList;

public class SerachByBranch implements Search {
    @Override
    public ArrayList<Product> search(ArrayList<Product> list_product, String key) {
        ArrayList<Product> search_list = new ArrayList<>();
        for (int i = 0; i < list_product.size(); i++) {
            if( list_product.get(i).getBrand().contains(key)){
                search_list.add(list_product.get(i));
            }
        }
        return  search_list;
    }
    @Override
    public ArrayList<Product> search(ArrayList<Product> list_product, int min, int max) {
     return  null;
    }
}
