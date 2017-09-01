package limiao.other;

/**
 * 打印所有的连续的子串
 * 
 * @author lenovo
 * @time 2017年8月27日 上午8:32:50
 */
public class DisplayConsecutiveSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displaySubstring("abcd");
	}
	
	public static void displaySubstring(String str){  
        for(int k=1;k<=str.length();k++){//控制步长  
            for(int i=0;i<=str.length()-k;i++){//对字符串逐步扫描  
                for(int j=i;j<i+k;j++){//输出扫描的起始点及以后的k个元素  
                    System.out.print(str.charAt(j));  
                }  
                System.out.print('\t');  
            }  
        }  
    }  
}
