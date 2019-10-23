/*
	注意：对于byte/short/char/三种类型来说，如果右侧的赋值没有超过范围
	那么javac编译器将会自动补上一个(byte)(short)(char)
	
	如果没有超过左侧的范围，那么编译器强转，如果超过了 编译器报错

*/

public class Notice{
	public static void main(String[] args){
		//右侧是一个int类型，但是没有超过byte的类型，没有报错
		//int -->byte 范围没有遵循从小到大的顺序，也没有进行强制类型转换
		byte num = 30;
		
		
		//右侧是一个int类型，但是超过了byte类型，报错了。
		// byte num1 = 128;
		
		
		//字符65没有超过char的范围，所以就会隐形的加上一个强制转换，所以能打印出来是字母A
		char zifu = /*(char)*/65;
		System.out.println(zifu);

		
	}
}