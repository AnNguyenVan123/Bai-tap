import java.util.ArrayList;

public class ManageOfficer {
    private ArrayList<Officer> list_officers ;
    public ManageOfficer( ArrayList<Officer> list_officers) {
        this.list_officers = list_officers;
    }

    public void AddOfficers(Officer new_officer){
       list_officers.add(new_officer);
       System.out.println("Them thanh cong");
   }
   public Officer FindByFullName(String full_name){
       for (int i = 0; i < list_officers.size() ; i++) {
           if(list_officers.get(i).getFull_name().equals(full_name)){
               return list_officers.get(i);
           }
       }
       return null ;
   }
   public void ShowMenu(){
       for (int i = 0; i < list_officers.size(); i++) {
           System.out.println(list_officers.get(i));
       }
   }
}
