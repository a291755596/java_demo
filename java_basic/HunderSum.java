public class HunderSum{
	public static void main(String[] args){
		//��1-100֮���ż���ĺ�
		int evensum = 0;
		int oddsum = 0;
		for(int i = 1; i<=100; i++){
			if(i % 2 == 0 ){
				evensum += i;
				
			}else{
				oddsum += i;
				
			}
		}
		
		System.out.println("ż���ĺ�Ϊ��" + evensum);
		System.out.println("�����ĺ�Ϊ��" + oddsum);
		
	}
}


