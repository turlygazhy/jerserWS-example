package kz.stock;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stock")
public class Stock {

    public String name;
    public double price;

    public Stock() {
    }

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
