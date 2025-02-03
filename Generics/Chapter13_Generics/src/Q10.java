
public class Q10 {//Q10
    public int myVar;

    Q10(int myVar) {
        this.myVar = myVar;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Q10) {
        	Q10 hTest = (Q10) o;
            return hTest.myVar == this.myVar;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (myVar * 5); 
    }

    public static void main(String[] args) {
    	Q10 obj1 = new Q10(100);
    	Q10 obj2 = new Q10(100);
    	Q10 obj3 = new Q10(200);

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        } else {
            System.out.println("obj1 is not equal to obj2");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1 is equal to obj3");
        } else {
            System.out.println("obj1 is not equal to obj3");
        }

        System.out.println("Hash code of obj1: " + obj1.hashCode());
        System.out.println("Hash code of obj2: " + obj2.hashCode());
        System.out.println("Hash code of obj3: " + obj3.hashCode());
    }
}
