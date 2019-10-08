import java.util.*;
class Student
{
	int roll;
	String name;
	int age;
	public Student(int roll,String name,int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Object o1)
		{	
			if(age==o1.age)
			return 0;
			else if(age>o1.age)
			{
				return 1;
			}
			else
				return -1;
		}
}
class Demo
{
	public static void main(String abc[])
	{
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(103,"Ravi",26));
		al.add(new Student(107,"Ajay",43));
		al.add(new Student(101,"Deepak",21));
		System.out.println("Sorting by Name");
		Collections.sort(al,new NameComparator());
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Student obj=(Student)it.next();
			System.out.println(obj.roll+"  "+obj.name+"  "+obj.age);
		}
		System.out.println("Sorting by Age");
		Collections.sort(al,new AgeComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student ob=(Student)itr.next();
			System.out.println(ob.roll+"  "+ob.name+"  "+ob.age);
		}
	}
}