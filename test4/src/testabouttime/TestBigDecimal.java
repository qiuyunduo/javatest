package testabouttime;

import java.math.BigDecimal;

public class TestBigDecimal {
	public static void main(String[] args) {
		System.out.println(calc("52", "11", "/"));
	}

	
	public static String calc(String firstNum,String secNum,String oper) {
		BigDecimal first=new BigDecimal(firstNum);
		BigDecimal sec=new BigDecimal(secNum);
		String result="";
		switch (oper) {
		case "+":
			result=first.add(sec).toString();
			break;
		case "-":
			result=first.subtract(sec).toString();
			break;
		case "*":
			result=first.multiply(sec).toString();
			break;
		case "/":
			if(sec.doubleValue()==0) {
				throw new ArithmeticException("除数为0");
			}
			result=first.divide(sec,6,BigDecimal.ROUND_HALF_UP).toString();
			break;
		default:
			break;
		}
		return result;
	}
}
