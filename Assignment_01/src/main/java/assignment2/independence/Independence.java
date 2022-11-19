package assignment2.independence;

public class Independence {
    public class Person {
        String name;
        int id;

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public int getId() {

            return id;
        }


        public void setId(int id) {

            this.id = id;
        }

    }

    public class Laptop {
        public String model;
        public int price;

        public String getModel() {

            return model;
        }

        public void setModel(String model) {

            this.model = model;
        }

        public int getPrice() {

            return price;
        }

        public void setPrice(int price) {

            this.price = price;
        }

    }
}

// There is no communication or relation between the Person and Laptop Classes.
// So, they are not dependent on each other.
// Therefore, Independence Coupling exists between them.

