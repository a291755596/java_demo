public class Operator4{
	public static void main(Sting[] args){
		//三元运算符
		int a = 10;
		int b = 20;
		int max = a > b ? a : b;
		System.out.println(max) //20
		
		//必须保证表达式A和表达式B都符合左侧数据类型的要求
		// int result = a > b ? 2.5 : 10  错误写法
		
		System.out.println(a > b ? a : b )  //正确写法  20

	}
}