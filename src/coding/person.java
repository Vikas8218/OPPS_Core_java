package coding;
public class person {
 private String name;
 private  int age;
 private String gender;
public person(String name, int age, String gender) {
	this.name = name;
	this.age = age;
	this.gender = gender;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
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
}

