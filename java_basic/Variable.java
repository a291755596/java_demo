public class Variable{
	public static void main(String[] args){
		int num1;
		num1 = 10;
		System.out.println(num1);
		num1 = 20;
		int num2 = 200;
		num2 = 2000;
		System.out.println(num2);
		
		byte num = 30;
		System.out.println(num);
		//byte num = 150  byte的取值在-128~127之间，打印150超出了数据返回，所以会报错
		
		short num3 = 50;
		System.out.println(num3);
		
		//long类型定义的变量默认为int类型，如果想要使用long类型，需要在后面加L区分
		//int类型只支持2亿左右的长度
		long num4 = 3000000000L;
		System.out.println(num4);
		
		//字符串类型
		//float类型与long类型使用方法一样，字符串默认定义为double类型，如果使用float类型需要在后面添加F区分
		float num5 = 2.5F;
		System.out.println(num5);
		
		double num6 = 1.2;
		System.out.println(num6);
		
		//字符类型
		char zifu = 'A';
		System.out.println(zifu);
		
		//布尔类型
		boolean var1 = true;
		System.out.println(var1);
		
		boolean var2 = var1;
		System.out.println(var2);
		
		
		//变量使用不能超过它的作用域
		//System.out.println(num8);	变量一定要先定义后使用
		
		int num8 = 500
		System.out.println(num8)
		
		{
			int num9 = 1200;
			//这样显示是没有问题的
			System.out.println(num9);
		}
		
		//这样就会出现问题，超出了作用域、
		//但是可以在页面中重新定义num9变量
		System.out.println(num9);
		
	}
}