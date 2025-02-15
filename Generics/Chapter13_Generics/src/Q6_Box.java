public class Q6_Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Q6_Box<Integer> integerBox = new Q6_Box<Integer>();
        integerBox.set(new Integer(15));
        
        integerBox.inspect(25); 
    }
}




