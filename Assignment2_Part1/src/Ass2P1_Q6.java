
public class Ass2P1_Q6 {


public static void main(String[] args) { 
    Animal animal1 = new Animal("Tiger", "Golden", "wild"); 
    Animal animal2 = new Animal("Dog", "Brown", "pet"); 
    Animal animal3 = new Animal("Horse", "Black", "pet"); 
    System.out.println("Hash Code for Tiger: " + animal1.hashCode()); 
    System.out.println("Hash Code for Dog: " + animal2.hashCode()); 
    System.out.println("Hash Code for Horse: " + animal3.hashCode()); 
} 

}

class Animal { 
    private String name; 
    private String color; 
    private String type; 
    public Animal(String name, String color, String type) { 
        this.name = name; 
        this.color = color; 
        this.type = type; 
    } 
    public String getName() { 
        return name; 
    } 
    public String getColor() { 
        return color; 
    } 
    public String getType() { 
        return type; 
    } 
    public String toString() { 
        return "Name: " + name + ", Color: " + color + ", Type: " + type; 
    } 
    public int hashCode() { 
        int result = name.hashCode(); 
        result = 31 * result + color.hashCode(); 
        result = 31 * result + type.hashCode(); 
        return result; 
    } 
    public boolean equals(Object obj) { 
        if (this == obj) { 
            return true; 
        } 
        if (obj == null || getClass() != obj.getClass()) { 
            return false; 
        } 
        Animal animal = (Animal) obj; 
        return name.equals(animal.name) && 
               color.equals(animal.color) && 
               type.equals(animal.type); 
   
} 
}
/* 
6. Write a program to create an Animal class with member variables name, color, and 
type (indicating whether the animal is a pet or wild). Override the hashCode() method to 
generate a unique identifier for each object. Then, create multiple Animal objects and print 
their hash codes.*/