package secao.nove.aulas.entities;

public class Construtor {

    public String name;
    public double price;
    public int quantity;

    public Construtor(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Construtor(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }


}
