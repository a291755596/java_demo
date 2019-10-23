public class Notice1{
	public static void main(String[] args){
		//右侧是两个变量的情况
		short num1 = 2;
		short num2 = 8;
		
		//这种是错误写法，必须使用int来接收
		// short result1 = num1 + num2;
		
		
		//右侧为两个常量的情况
		short result = 2 + 8;  //这样不会报错
		System.out.println(result);
		
		
	}
}

