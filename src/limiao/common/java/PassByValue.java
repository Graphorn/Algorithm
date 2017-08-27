package limiao.common.java;

/**
 * Java中值传递
 * @author limiao
 * @time 2016年1月23日 下午5:07:40
 */
public class PassByValue {

	int i = 0;
	String s = "before";
	Object o = new Object();
	Student student = new Student("name");
	
	public void change(int a,String b,Object c,Student d){
		a = 2;
		b = "after";
		c = new Object();
		d.change("namechanged");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValue t = new PassByValue();
		System.out.println(t.i+","+t.s+","+t.o+","+t.student.name);
		t.change(t.i,t.s,t.o,t.student);
		System.out.println(t.i+","+t.s+","+t.o+","+t.student.name);
	}
	/*
	 * 内部类
	 */
	class Student{
		public String name;
		public Student(String name){
			this.name = name;
		}
		public void change(String n){
			name = n;
		}
	}
}
