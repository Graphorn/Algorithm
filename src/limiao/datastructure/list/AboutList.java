package limiao.datastructure.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 和list相关的一些注意的用法
 * @author limiao
 * @time 2016年5月14日 下午3:53:44
 */
public class AboutList {

	String stringArray[];
	
	ArrayList<String> arrayList;
	
	public AboutList(){
		stringArray = new String[10];
		arrayList = new ArrayList<>();
		for(int i = 0;i<5;i++){
			stringArray[i] = "string"+i;
			arrayList.add("arrayList"+i);
		}
	}
	
	public void execute(){
		System.out.println("stringArray.Length:"+stringArray.length);
		System.out.println("foreach");
		for(String s:stringArray){
			System.out.println(s);
		}
		System.out.println("forlength");
		for(int i=0;i<stringArray.length;i++){
			System.out.println(stringArray[i]);
		}
		System.out.println("arrayList.size():"+arrayList.size());
		List<String> list = Arrays.asList(stringArray);
		System.out.println("list.size():"+list.size());
		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(list);
		list2.trimToSize();
		System.out.println("list2.size():"+list2.size());
		System.out.println("list2.get(8):"+list2.get(8));
	}
	public static void main(String[] args) {
		AboutList aboutList = new AboutList();
		aboutList.execute();
	}

}
