package limiao.algorithm.sort;

/**
 * 冒泡排序
 * @author limiao
 * @time 2016年4月5日 下午6:16:23
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int source[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		 for (int i = 0; i < source.length; i++)
		 {
		     for (int j = i+1; j < source.length; j++)
		     {
		         if (source[i] > source[j])
		         {
		             int temp = source[i];
		             source[i] = source[j];
		             source[j] = temp;
		             System.out.println();
		    		 for(int ii=0;ii<source.length;ii++){
		    				System.out.print(source[ii]+" ");
		    		 }
		     }
		 }
		 System.out.println();
		 for(int ii=0;ii<source.length;ii++){
				System.out.print(source[ii]+" ");
			 }
		 }
		 System.out.println();
		 for(int i=0;i<source.length;i++){
				System.out.print(source[i]+" ");
		 }
		 bubbleSort();
	}

	public static  void bubbleSort(){  
	     int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
	    int temp=0;  
	    for(int i=0;i<a.length-1;i++){  
	        for(int j=0;j<a.length-1-i;j++){  
		        if(a[j]>a[j+1]){  
		            temp=a[j];  
		            a[j]=a[j+1];  
		            a[j+1]=temp;  
		    		 for(int ii=0;ii<a.length;ii++){
		    				System.out.print(a[ii]+" ");
		    		 }
		        }  
	        }  
	    }  
	    for(int i=0;i<a.length;i++)  
	        System.out.println(a[i]);     
	}  
}
