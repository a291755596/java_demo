public class Operator3{
	public static void main(String[] args){
		//与、或、非运算符
		System.out.println(true && false); //false
		System.out.println(3 < 4 && 10 > 5); //true
		
		
		System.out.println(true || false);	//true
		System.out.println(true || true);	//true
		System.out.println(false || false);	//false
		
		System.out.println(true);
		System.out.println(!true);
		
		
		//&&和||的短路问题
		int a = 10;
		System.out.println(3 > 4 && ++a > 100); //fale
		System.out.println(a);	//10
		
		
		int b = 20;
		System.out.println(2 > 1 || ++b > 100) //true
		System.out.println(b)	//20

	}
}