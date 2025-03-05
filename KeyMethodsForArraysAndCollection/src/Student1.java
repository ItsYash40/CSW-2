
public class Student1 implements Comparable<Student1>
{
String name,phone;
int roll;
double marks;
Student1(String name,int roll,String phone,double marks)
{
	this.name=name;
	this.roll=roll;
	this.phone=phone;
	this.marks=marks;
}
public int compareTo(Student1 other)
{
	return this.name.compareTo(other.name);
}
public int getRoll()
{
	return roll;
}
public double getMarks()
{
	return marks;
}
public String getName()
{
	return name;
}
public String getPhone()
{
	return phone;
}
public String toString()
{
	return "Student [Name=" + name + " , Phone= " + phone + " , Marks= " + marks + "]" ; 
}
}
