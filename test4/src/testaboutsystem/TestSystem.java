package testaboutsystem;

public class TestSystem {
	public static void main(String[] args) {
		Long start=System.currentTimeMillis();
		//虚拟机会尽最大的努力去回收垃圾
		//System.gc();
		//System.exit(0);//虚拟机会退出
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.println("程序结束");
		Long end=System.currentTimeMillis();
		System.out.println(end-start);
		int a=Integer.MAX_VALUE;
		int b=Integer.MIN_VALUE;
	}

}
