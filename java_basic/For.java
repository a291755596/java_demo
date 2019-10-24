/*
循环的基本组成部分：
1、初始化语句：再循环最初执行，并且只执行一次
2、条件判断：如果成立，继续循环，如果不成立，循环推出
3、循环体：重复要做的事情，若干行语句
4、步进语句：每次循环过后的扫尾工作，每次循环完成后都需要执行一次

for循环的结构：
for(初始化语句，条件判断，步进语句){
	循环体
}


while循环的结构
1、标准格式
while(条件判断){
	循环体
}
扩展格式

2、初始化语句
while(条件判断){
	循环体;
	步进语句;
}



do-while循环的结构
标准格式
do{
	循环体
}while(条件语句);

扩展格式
初始化语句;
do{
	循环体;
	步进语句
}while(条件语句)
	


三种循环的区别：
1、如果条件语句从来没有满足过for和while不会执行，do-while会至少会执行一次
2、for循环在小括号当中定义，只有在循环体内才可以使用，而while和do-while就是在外部定义，可以全局使用

*/

public class For{
	public static void main(String[] args){
		//for循环的结构
		// for(int i=1;i<100; i++){
			// System.out.println("循环" + i);
		// }
		

		//while循环的结构
		// int i = 1;
		// while(i < 100){
			// System.out.println("循环体" + i);
			// i++;
		// }
		
		
		// do-while循环的结构
		// int i = 1;
		// do{
			// System.out.println("循环" + i);
			// i++;
		// }while(i <= 10);//这里的分号不能丢
		
	}
}