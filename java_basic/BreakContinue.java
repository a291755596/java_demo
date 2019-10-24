//break和continue
/*
break关键字的用法有常见的两种：
1、可以在switch中使用，一旦执行，整个switch语句整体结束
2、可以在循环语句中使用，一旦执行，整个循环语句整体结束

continue关键字的用法：
一旦执行，立即跳过当前次循环剩余内容，马上开始下一次循环
*/

public class BreakContinue{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			if(i == 4){
				break;	//整体打断这个循环
			}
			
			System.out.println("我是第" + i + "次循环" );
		}
		
		
		
		for(int j=1;j<=10;j++){
			if(j==4){
				continue;	//跳过第四次循环
			}
			
			System.out.println("我是第"+ j +"次循环");
		}
	}
}