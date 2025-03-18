/*Write a Java program to demonstrate nullification of references and garbage collection 
using the NullifiedReference class. The class should have a constructor to initialize an 
object with a given name. In the main() method, create an instance of 
NullifiedReference, assign it, then nullify the reference, and explicitly invoke the 
garbage collector. Override the finalize() method to print the object's name upon 
successful garbage collection. */

class NullifiedReference {
    private String name;

    public NullifiedReference(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        NullifiedReference obj = new NullifiedReference("TestObject");

        obj = null;

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
