package limiao.common.java;

/**
 * replaceAll 用法
 * @author limiao
 * @time 2016年1月23日 下午5:07:40
 */
public class ReplaceAll {

	int i = 0;
	String s = "before";
	Object o = new Object();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sdfdsfdsfdsf    dfdfs dfds ".replaceAll(" +", ","));
		System.out.println("sdfdsfdsfdsf  dfdfsdf  ds".replaceFirst(" +", ","));
		ReplaceAll t = new ReplaceAll();
		System.out.println(t.o);
		t.change(t.i,t.s,t.o);
		System.out.println(t.i+t.s+t.o);
	}
	public void change(int a,String b,Object c){
		a = 2;
		b = "after";
		c = new Object();
		System.out.println(c);
	}
}
