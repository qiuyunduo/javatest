package testabouttime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;


public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date d=new Date();

		System.out.println(d);
		//得到当前的时间
		Long now=d.getTime();
		System.out.println(now);
		System.out.println((now/1000)/3600);
		SimpleDateFormat sf=new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		String string=sf.format(d);
		System.out.println(string);
		//计算从你出生到现在有多少天了
		String birthday="1998年1月1日";
		//把字符串转换为日期
		sf=new SimpleDateFormat("yyyy年MM月dd日");
		Date date=sf.parse(birthday);

		Long start=date.getTime();
		System.out.println("获取天数："+date.getDay());
		Long days=now-start;
		System.out.println((int)(days/1000/3600/24/365));


	}
}