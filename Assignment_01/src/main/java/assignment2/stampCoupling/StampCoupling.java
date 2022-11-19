package assignment2.stampCoupling;

public class StampCoupling {
    public class Laptop{
        String model;
        int price;

        public String getModel() {

            return model;
        }

        public void setModel(String model) {

            this.model = model;
        }

    }

    public class Product{
        Laptop l;
        public void printPrice(Laptop laptop){
            System.out.println("Laptop price is: " + laptop.price);
        }
    }
}

// The signature of Product Class' function printPrice() has Laptop as its argument or return type passed as reference.
// Therefore, Stamp Coupling exists between them.

