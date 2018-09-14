package testaboutrandom;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		//每次构造种子都不一样，所以生成的随机数列不一样
		//如果换成固定的种子，则生成的数列一样的
		Random random=new Random();
		//生成20个1-20之间的随机数，并且不同，存入数组
		int[]arr=new int[20];
		for(int i=0;i<20;i++) {
			System.out.print("第一******");
			arr[i]=random.nextInt(20);
			//当前值和数组i位置之前的数值比较
			for(int j=0;j<i;j++) {
				System.out.println("第二．．．");
				if(arr[i]==arr[j]) {
					i--;//此次生成的数作废
					break;
				}

			}
			System.out.println(arr[i]);
		}

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}