package assignment2.contentCoupling;

public class ContentCoupling {
    public class Square {
        public int length;

    }
    public void main(String[] args)
    {
        Square square = new Square();
        square.length = 3;
    }
}

// The ContentCoupling Class modifies the content (length attribute) of Square class.
// Therefore, Content Coupling exists between them.

