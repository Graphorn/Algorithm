package limiao.algorithm.datastructure.list;

/**
 * 测试内部类直接访问外部类的方法和属性
 * @author limiao
 * @time 2016年5月17日 下午7:52:13
 */
public class TestInnerClass {

	private String s = "OuterClass";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInnerClass out = new TestInnerClass();
		TestInnerClass.InnerClass in = out.new InnerClass();
		in.execute();
	}
	
	public void write(String s){
		System.out.println("外部的方法"+s);
	}
	
	public class InnerClass{
		public void write(String s){
			System.out.println("内部的方法"+s);
		}
		public void execute(){
			write("123");// 先从当前的内里面找是否有该方法，没有则从外部类里面找
			this.write(s);// 可以访问外部类的属性
			TestInnerClass.this.write(s);
		}
	}

}
