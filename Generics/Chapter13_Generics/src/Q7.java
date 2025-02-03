 class Q7{  
 int rollno;  
 String name;  
 String city;  
 Q7(int rollno, String name, 
String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
 public static void main(String args[]){  
	 Q7 s1=new Q7(101,"Raj", "lucknow ");
	 		
	 Q7 s2=new Q7(102,"YAsh", "Kolkata ");
 System.out.println(s1);//compiler writes here
 s1.toString() ; 
 System.out.println(s2);//compiler writes here
 s2.toString()  ;
 }  
}