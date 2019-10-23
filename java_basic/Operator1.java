//赋值运算符
public class Operator1{
	public static void main(String[] args){
		//赋值运算符包含两：
		// 1、基本赋值运算符：=
		// 2、复合赋值运算符：+= -= *= /=
		//加法的复合赋值运算
		int a = 10;
		a += 5;
		System.out.println(a);
		
		//取模的复合赋值运算
		int b = 10;
		b%=3;
		System.out.println(b);
		
		//注意：常量不能进行赋值基本运算
		//复合赋值运算符其中隐含了一个强制类型转换
		byte num = 30;
		
		// num = byte + int
		//num = int + int
		//num = (byte)int
		num += 5;
		System.out.println(num);
		
	}
}

