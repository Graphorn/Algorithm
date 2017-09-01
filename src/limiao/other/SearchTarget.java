package limiao.other;

/**
 * 从二维数组中寻找某个数，二维数组行内从左到右一次增大，列内从上到下依次增大
 * 
 * @author limiao
 * @time 2017年8月27日 上午8:36:30
 */
public class SearchTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
	    System.out.println(Find(5,array));
	}
	public static boolean Find(int target, int[][] array) {
        int rowSize = array.length;
        int columSize = array[0].length;
        int x = rowSize-1;
        for(int y=0; y<columSize; y++){
        	if(array[x][y] == target){
                return true;
            }
            if(array[x][y]>target && x>0){
                x = x-1;
                y = y-1;
            }
                
        }
        return false;
    }
}
