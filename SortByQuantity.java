import java.util.ArrayList;

public class SortByQuantity implements  Sort {
    public  void swap(ArrayList<Product> list,Product a,Product b){
        list.set( list.indexOf(a),b);
        list.set( list.indexOf(b),a);
    }
    @Override
    public void sort_ascending(ArrayList<Product> list) {
        for (int i = 0; i < list.size()-1 ; i++) {
            Product min = list.get(i);
            for (int j = i+1; j < list.size() ; j++) {
                if(list.get(j).getQuantity() < min.getQuantity()){
                    min = list.get(j);
                }


            }
            if (list.indexOf(min)!= i){
                swap(list,min,list.get(i));
            }
        }
    }

    @Override
    public void sort_decreasing(ArrayList<Product> list) {
        for (int i = 0; i < list.size()-1 ; i++) {
            Product max = list.get(i);
            for (int j = i+1; j < list.size() ; j++) {
                if(list.get(j).getQuantity() > max.getQuantity()){
                    max = list.get(j);
                }


            }
            if (list.indexOf(max)!= i){
                swap(list,max,list.get(i));
            }
        }
    }
}
