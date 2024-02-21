package example;

public class Example {
    private static int x = 1;

    
    public Example() {
    }

    public int getX() {
        return x;
    }
    
    /**
     * Sets the value of x
     * @param x this is the age of unsw
     */
    public void setX(int x) {
        Example.x = x;
    }

    public static void main(String[] args) {
        Example a = new Example();
        Example b = new Example();

        // System.out.println(b.getX());

        a.setX(5);

        System.out.println(b.getX());
    }

    
}
