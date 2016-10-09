package limiao.leetcode;

import java.awt.List;
import java.util.ArrayList;

/**
 * 7. Reverse Integer 
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * 
 * @author seektech
 * @time Sep 28, 2016 7:41:42 PM
 */
public class No_7_ReverseInteger {
	public static void main(String args[]){
		System.out.println(reverse(1534236469));
		System.out.println(reverse(-123));
	}
	public static int reverse(int n) {
//		int source = Math.abs(x);
//		if(source< 10) return x;
//		System.out.println(x);
//		//防止溢出操作
//	    if (x>Integer.MAX_VALUE||x<Integer.MIN_VALUE)
//	    {
//	        return 0;
//	    }d
//		ArrayList<Integer> list = new ArrayList<Integer>();
//        int temp = 1;
//        int multi = 10;
//        while(temp >= 1){
//        	list.add(source % multi / (multi/10));
//        	temp = source/multi;
//        	multi *= 10;
//        }
//        
//        int res = 0;
//        for(int i=0; i<list.size();i++){
//        	int s = list.get(i);
//        	res += (s*(Math.pow(10, list.size()-1-i)));
//        }
//        if(x>0) return res;
//        else return 0-res;
		//输出结果定义为long
		long sum=0;
		while (n!=0)
		{
			int s=n%10;
			sum=sum*10+s;
			n=n/10;
		}
		
		//防止溢出操作
		if (sum>Integer.MAX_VALUE||sum<Integer.MIN_VALUE)
		{
			return 0;
		}
		return (int)sum;
    }
}
