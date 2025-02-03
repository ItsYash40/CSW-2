class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println("The value is: " + value);
    }
}

public class Q1 {
    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(5);
        intObj.show();  

        GenericClass<String> strObj = new GenericClass<>("Hello Yash");
        strObj.show();  
    }
}
