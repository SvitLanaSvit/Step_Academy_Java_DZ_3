package org.example.money;

public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void reducePrice(int reducedDollars, int reducedCents){
        price.subtractMoney(reducedDollars, reducedCents);
    }

    @Override
    public String toString() {
        String formatString = "| %-30s | %-10s |";
        return String.format(formatString, name, price);
    }
}
