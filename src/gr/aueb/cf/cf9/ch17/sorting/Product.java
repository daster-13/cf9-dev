package gr.aueb.cf.cf9.ch17.sorting;

public class Product {
    private String description;
    private double price;
    private int quantity;

    public Product(){}

    public Product(int quantity, double price, String description) {
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description=" + description +'\'' +
    }
    @Override
    public int compareTo(Product other){
        return this.description.compareTo(other.description);
//    }
//    @Override
//    public int compareTo(Product other){
//        if( this.quantity < other.quantity){
//            return -1;
//        } else if ((this.quantity > other.quantity)) {
//
//            return -1;
//        }else {return 0;}
//        return  this.quantity -other.quantity;
    }
    @Override
    public int compareTo(Product other){
        return Double.compare(this.price, other.price)
    }

}
