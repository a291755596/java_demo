public class DataType{
	public static void main(String[] args){
		//隐式类型转换（数据范围从小到大）
		System.out.println(1024);
		System.out.println(2.5);
		//左边是long类型，右边是默认的int类型，左右类型不一样
		//将右侧的int赋值给左边的long int-->long（数据范围从小到大）
		//所以会发生数据类型转化
		long num1 = 100;
		System.out.println(num1);
		
		//左边是double类型，右边是float类型，左右类型不一样
		//将右边的float类型赋值给左边的double类型 float-->double（数据范围从小到大）
		//所以数据会发生类型转化
		double num2 = 2.5F;
		System.out.println(num2);
		
		
		//左边是float类型，右边是long类型，左右类型不一样
		//将右边的long类型转化为左边的float类型 long-->float（数据范围从小到大）
		//所以数据会发生类型转化  结果为30.0
		float num3 = 30L;
		System.out.println(num3);
		System.out.println("-------------------华丽的分割线------------------------");
		
		//强制类型转换（格式：范围小的类型 范围小的变量 = （范围小的类型）原本范围大的数据）
		//左边是int类型，右边是long类型，右边的数据范围比左边的大，不能发生自动转化，要进行强制类型转换
		//int num5 = 100F;	会报错，从long转换到int可能忽悠损失
		int num5 = (int)100L;
		System.out.println(num5);
		
		//如果右边的数据取值范围超过左边的取值范围的时候，进行强制类型转化会出现数据溢出情况
		//long强制转化成为int类型会数据溢出
		int num6 = (int)6000000000L;
		System.out.println(num6);
		
		
		//右边为double类型，左边为int类型，强制类型转化后为2，数据出现溢出的情况
		int num7 = (int)2.5;
		System.out.println(num7);
		
		//char类型可以进行运算
		//一旦char类型进行了数学运算，那么先把char类型转化为int，然后按照ASCII码翻译成为一个数字
		char zifu = 'A';
		System.out.println(zifu + 1); //输出了66的ASCII码
		
		//byte和byte相加也会先转化成为int类型
		byte num8 = 40;
		byte num9 = 50;
		//这里需要注意：byte和byte相加两byte会被转化成为int类型
		//byte + byte -->int + int = int  所以这里应该使用int来接收,不能使用byte来接收
		//byte result = num8 + num9;
		int result = num8 + num9;
		System.out.println(result);
		
		short num10 = 60;
		//byte + short --> int + int = int 所以也要使用int接收
		int result1 = num8 + num10;
		System.out.println(result1);
		//如果一定要使用short来接收，可以使用强制类型转化
		//必须保证逻辑上的大小没有超过short的数据取值范围
		short result2 = (short)(num8+num10);
		System.out.println(result2);
	}
}