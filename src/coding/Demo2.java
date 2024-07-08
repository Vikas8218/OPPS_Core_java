package coding;
 class Demo2{
	int id;
	String name;
	int salary;
	String cname;
	void store(int id1,String name1,int salary1,String cname1){
		id = id1;
		name = name1;
		salary = salary1;
		cname = cname1;
	}
	void display()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Company Name : "+cname);
		
	}
	public static void main(String[] args)
	{
		Demo2 emp1 = new Demo2();
		emp1.store(101,"Mohan",12600,"TCS");
		emp1.display();
		Demo2 emp2 = new Demo2();
		emp2.store(102,"Rohan",65242,"TCS");
		emp2.display();
		Demo2 emp3 = new Demo2();
		emp3.store(103,"Shyam",72643,"TCS");
		emp3.display();
	}
}