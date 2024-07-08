package coding;
public class Demo {
 private String name;
 private int age;
 private String gender;
public Demo(String name, int age, String gender) {
	this.name = name;
	this.age = age;
	this.gender = gender;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public static void main(String[] args) {
	Demo emp1 =new Demo("vikas",20,"male");
	System.out.println("name :"+" "+emp1.name);
	System.out.println("Age :"+" "+emp1.age);
	System.out.println("gender :"+" "+emp1.gender);
	
}
}