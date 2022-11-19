package assignment2.dataCoupling;

public class DataCoupling {
    int i, j;

    public DataCoupling(int i, int j) {

        this.i = i;
        this.j = j;
    }

    public void getProduct(int i, int j) {

        int product = i * j;
        System.out.println("Product of two numbers are :" + product);
    }


}

// The parameters i and j are passed to the getProduct() function by value.
// The input values from the main function get passed to the getSum function by calling the method getProduct().
// Therefore, Data Coupling exists between them.


