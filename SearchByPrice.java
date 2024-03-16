import java.util.ArrayList;

public class SearchByPrice implements Search{

    @Override
    public ArrayList<Product> search(ArrayList<Product> list_product, String key) {
        return null;
    }

    @Override
    public ArrayList<Product> search(ArrayList<Product> list_product, int min, int max) {
        ArrayList<Product> search_list = new ArrayList<>();
        for (int i = 0; i < list_product.size(); i++) {
            if (list_product.get(i).getPrice()>= min&&list_product.get(i).getPrice()<=max) {
                search_list.add(list_product.get(i));
            }
        }
        return  search_list;
    }
}
