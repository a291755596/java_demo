public class Operator{
	public static void main(String[] args){
		//算数运算符（byte,short,char）都会提升为int进行计算
		//两常量之间的数学运算
		System.out.println(30 + 50);
		
		//两变量之间的数学运算
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1+num2);
		
		//变量和常量可以混合使用
		System.out.println(num1 + 100);
		
		//除法运算
		//对于一个整数的表达式来说，除法用的是整除，整除数除以整数，结果仍然是整数，不看余数，只看商
		int num3 = 10;
		int num4 = 3;
		//由于都是int 类型的数据，所以结果是3
		System.out.println(num3 / num4);
		
		//取余运算，注意只有对于整数除法来说，取模运算才有余数的意义
		//得到的运算结果是余数，所以结果是1
		System.out.println(num3 % num4);
		
		//特别注意：一旦运算当中有不同类型的数据，那么结果将会是数据范围大的那种
		//int + double -->double + double = double
		//double 的取值范围比int 范围要大，所以先要把int 转化为double再进行运算
		double result = num3 + 2.5;
		System.out.println(result);	//输出的内容是12.5
		
		System.out.println("----------------------------加法的特殊使用部分-------------------------------------");
		
		//特殊的加法运算符（字符串的拼接作用）
		String str = "Hello";
		System.out.println(str);
		System.out.println(str + "world");	//输出的结果为HelloWorld
		
		//任何数据类型和字符串进行连的时候都会变成字符串
		//String + int = String
		String str1 = "Hello";
		System.out.println(str1 + 20);  //输出的结果为Hello20
		
		//优先级的问题
		System.out.println(str1 + 20 + 30); //输出结果为Hello2030
		System.out.println(str1 + ( 20 + 30 ));	//输出结果为Hello50
		
		
		System.out.println("----------------------------自增自减部分-------------------------------------");
	
		//自增自减运算符 只有变量才能进行自增自减运算，常量不能使用
		//单独使用的部分
		int num = 10;
		System.out.println(num);
		++num;
		System.out.println(num);
		num++;
		System.out.println(num);
		
		//混合使用的部分，前++和后++区别很大
		//和打印输出一起使用
		int num11 = 20;
		System.out.println(++num11);	//21
		System.out.println(num11);		//21
		
		int num12 = 30;
		System.out.println(num12++);	//30
		System.out.println(num12);		//31
		
		//和运算操作一起使用
		int num13 = 10;
		int result3 = num13 --;
		System.out.println(result3); 	// 10
		System.out.println(num13);		//9
		
		int num14 = 50;
		int result4 = -- num14;
		System.out.println(result4); 	//49
		System.out.println(num14);		//49
		
	}
}