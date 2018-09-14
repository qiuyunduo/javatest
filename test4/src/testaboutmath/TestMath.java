package testaboutmath;

public class TestMath {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//求绝对值
		System.out.println(Math.abs(-3));
		//向上取整 附近比参数更大的整数
		System.out.println(Math.ceil(-10.1));
		//向下取整 附近比参数更小的整数
		System.out.println(Math.floor(11.0));
		//100*100==10000*100
		System.out.println(Math.pow(100, 5));
		//floor（参数+0.5）
		System.out.println(Math.round(-10.5));
		System.out.println(Math.sqrt(3.5));
		//random的取值范围为[0,1)之间的数值
		System.out.println(Math.random());
	}
}