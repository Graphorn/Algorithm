package limiao.other;
import java.util.HashMap;

/**
 * 找到第一个重复一次的字符
 * @author limiao
 * @time 2016�?�?�?下午4:29:34
 */
public class FindFirst {

	public static void main(String[] args){
		HashMap<String,Integer> hashMap = new HashMap<>();
		String source = "dddfgg";
		for(int i = 0; i<source.length();i++){
			String a = source.charAt(i)+"";
			if(hashMap.containsKey(a)){
				hashMap.put(a, hashMap.get(a)+1);
			}else{
				hashMap.put(a, 1);
			}
		}
		for(int i = 0; i<source.length();i++){
			if(hashMap.get(source.charAt(i)+"")==1){
				System.out.println(source.charAt(i)+"");
				break;
			}
		}
	}
}
