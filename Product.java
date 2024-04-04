public class Product {
    private int id ;
    private String name ;
    Category category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Product() {
    }
    public Product(int id, String name,Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category.getName() + "]";
    }
}
