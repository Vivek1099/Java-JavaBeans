package practice;
/* 
- each properties has two function 
  1> get func 
  2> set func
- In java beans constructor is mandatory */
public class JavaBeans {
	int id;
	int age;
	String name;
	public JavaBeans() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
