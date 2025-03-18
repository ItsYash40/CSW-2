/*Create a Java program to demonstrate anonymous objects and garbage collection using 
the AnonymousObject class. The class should have a constructor to initialize an object 
with a name. In the main() method, create an anonymous object and explicitly invoke 
the garbage collector. Override the finalize() method to print the object's name upon 
successful garbage collection. */

class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        new AnonymousObject("TempObject");

        System.gc();
        
        try {
     	   Thread.sleep(1000);
        }
        catch(InterruptedException e){
     	   e.printStackTrace();
        }


        Runtime.getRuntime().runFinalization();

        System.out.println("End of main method.");
    }
}
