package limiao.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeFormatUtil {
	public static void main(String[] args) {
		getHour("20150804071100");
	}
	
	static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
	static Calendar cal = Calendar.getInstance();
	public  long[]changeToTimestamp(String marktime,String tradeTime){
		long []ans = new long[2];
		try {
			ans[0] = changeStringToTimestamp(marktime);
			ans[1] = changeStringToTimestamp(tradeTime);
		} catch (Exception e) {
			return null;
		}
		return ans;
	}
	public  long changeStringToTimestamp (String time)throws Exception{
		Date date = format.parse(time);
		cal.setTime(date);
		//cal.set(Calendar.SECOND, 0);
		return cal.getTimeInMillis()/1000;
	}
	public  long changeStringToTimestampExceptionCache (String time){
		
		try {
			Date date = format.parse(time);
			cal.setTime(date);
			//cal.set(Calendar.SECOND, 0);
			return cal.getTimeInMillis()/1000;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	public  String  changeTimeStampToString(long stamp){
		cal.setTimeInMillis(stamp*1000);
		return format.format(cal.getTime());
	}
	/**
	 *  输入格式： 20150804071100
	 *  返回
	 * @param time
	 * @return
	 */
	public static int getHour(String time){
//		try {
//			Date date = format.parse(time);
//			cal.setTime(date);
//			cal.get
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		String hour= time.substring(8,10);
		return Integer.parseInt(hour);
	}
	
}
