package testabouttime;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) {
		//创建日历对象
		//Calendar rightNow = Calendar.getInstance();
		Calendar rightNow = Calendar.getInstance();

		//public int get(int field)   获取指定字段值的方法
		int year = rightNow.get(Calendar.YEAR);
		System.out.println(year);
		int month = rightNow.get(Calendar.MONTH);
		//java当中Calendar的月份比现实生活少1
		System.out.println(month+1);
		int day = rightNow.get(Calendar.DATE);
		System.out.println(day);

		//public abstract void add(int field, int amount) 为某个字段增加某个量
		rightNow.add(Calendar.YEAR, 2);
		System.out.println(rightNow.get(Calendar.YEAR));
		//public final void set(int year, int month,int date)  给年月日快速赋值
		rightNow.set(2000, 0, 1);

		System.out.println(rightNow.get(Calendar.YEAR)+","+rightNow.get(Calendar.MONTH)+","+rightNow.get(Calendar.DATE));
		//public final Date getTime()  将日历对象转成日期对象
		Date time = rightNow.getTime();
		System.out.println(time);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sf.format(time);
		System.out.println(str);
	}

}