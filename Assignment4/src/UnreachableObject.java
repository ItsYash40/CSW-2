class UnreachableObject {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    public void show() {
        UnreachableObject obj1 = new UnreachableObject("Object1");
        obj1.display();
    }

    @SuppressWarnings("unused")
    public void display() {
        UnreachableObject obj2 = new UnreachableObject("Object2");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("MainObject");
        obj.show();

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
