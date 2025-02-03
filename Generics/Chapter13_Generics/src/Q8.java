
 class Q8{  
 int rollno;  
 String name;  
 String city;  
 Q8(int rollno, String name, 
String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
 public String toString(){//overriding thetoString() method  
 
  return rollno+"  "+name+"  "+city;  
 }  
 public static void main(String args[]){  
	 Q8 s1=new Q8(101,"Raj", "Lucknow ");
	 Q8 s2=new Q8(102,"YAsh", "Kolkata ");  
   System.out.println(s1);// compiler writes here
 s1.toString()  ;
   System.out.println(s2);// compiler writes here
 s2.toString()  ;
 }  
}  
