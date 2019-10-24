public class HunderSum{
	public static void main(String[] args){
		//求1-100之间的偶数的和
		int evensum = 0;
		int oddsum = 0;
		for(int i = 1; i<=100; i++){
			if(i % 2 == 0 ){
				evensum += i;
				
			}else{
				oddsum += i;
				
			}
		}
		
		System.out.println("偶数的和为：" + evensum);
		System.out.println("奇数的和为：" + oddsum);
		
	}
}


