public abstract class Product{
    private int id;
    private String name;
    private double price;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public abstract double getDiscountedPrice();
    public void displayProductInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(getDiscountedPrice());
    }
     public static void main(String[] args) {
        Product obj1 = new OrganicProducts();
        obj1.setId(101);
        obj1.setName("Organic Apple");
        obj1.setPrice(100.0);
        obj1.displayProductInfo();
        
        Product obj2= new RecycledProducts();
        obj2.setId(201);
        obj2.setName("Recycled Fruit");
        obj2.setPrice(200.0);
        obj2.displayProductInfo();
     }
}
class OrganicProducts extends Product{
        public double getDiscountedPrice(){
            return getPrice()*0.9;
        }
    }
class RecycledProducts extends Product{
    public double getDiscountedPrice(){
        return getPrice()*0.95;
    }
}
abstract class Cart extends Product{

}