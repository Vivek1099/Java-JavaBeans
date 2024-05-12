package practice;

public class JavaBeans1 {
	public static void main(String args[])
	{
		JavaBeans jb=new JavaBeans();
		jb.setId(1);
		jb.setAge(23);
		jb.setName("Vivek");
		
		System.out.println("Name:"+jb.getName());
		System.out.println("Id:"+jb.getId());
		System.out.println("Age:"+jb.getAge());
	}
}
