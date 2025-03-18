
/*Develop a Java class with private integer and double data members, along with 
methods for initialization, setting, and updating these members. Create two objects of 
this class and invoke the necessary methods to modify the data. Use the Runtime class 
to calculate the total allocated memory and memory occupied by the objects. Apply any 
L2, L3 
 
technique to make the objects unreachable, making them eligible for garbage 
collection. Finally, recheck the utilized and total memory using the Runtime class.  */



class MemoryDemo {
    private int intValue;
    private double doubleValue;

    public MemoryDemo(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        System.out.println("Object created with int: " + intValue + ", double: " + doubleValue);
    }

    public void updateValues(int newInt, double newDouble) {
        this.intValue = newInt;
        this.doubleValue = newDouble;
        System.out.println("Values updated to int: " + newInt + ", double: " + newDouble);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object with int: " + intValue + ", double: " + doubleValue + " is being garbage collected.");
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long totalMemoryBefore = runtime.totalMemory();
        long freeMemoryBefore = runtime.freeMemory();
        long usedMemoryBefore = totalMemoryBefore - freeMemoryBefore;

        System.out.println("\nMemory before object creation:");
        System.out.println("Total Memory: " + totalMemoryBefore);
        System.out.println("Used Memory: " + usedMemoryBefore);

        MemoryDemo obj1 = new MemoryDemo(10, 20.5);
        MemoryDemo obj2 = new MemoryDemo(30, 40.7);

        obj1.updateValues(50, 60.9);
        obj2.updateValues(70, 80.3);

        long totalMemoryAfterCreation = runtime.totalMemory();
        long freeMemoryAfterCreation = runtime.freeMemory();
        long usedMemoryAfterCreation = totalMemoryAfterCreation - freeMemoryAfterCreation;

        System.out.println("\nMemory after object creation:");
        System.out.println("Total Memory: " + totalMemoryAfterCreation);
        System.out.println("Used Memory: " + usedMemoryAfterCreation);

        obj1 = null;
        obj2 = null;

        System.gc();
        
        try {
     	   Thread.sleep(1000);
        }
        catch(InterruptedException e){
     	   e.printStackTrace();
        }

        runtime.runFinalization();

        long totalMemoryAfterGC = runtime.totalMemory();
        long freeMemoryAfterGC = runtime.freeMemory();
        long usedMemoryAfterGC = totalMemoryAfterGC - freeMemoryAfterGC;

        System.out.println("\nMemory after garbage collection:");
        System.out.println("Total Memory: " + totalMemoryAfterGC);
        System.out.println("Used Memory: " + usedMemoryAfterGC);

        System.out.println("\nEnd of main method.");
    }
}
