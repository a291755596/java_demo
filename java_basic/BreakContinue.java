//break��continue
/*
break�ؼ��ֵ��÷��г��������֣�
1��������switch��ʹ�ã�һ��ִ�У�����switch����������
2��������ѭ�������ʹ�ã�һ��ִ�У�����ѭ������������

continue�ؼ��ֵ��÷���
һ��ִ�У�����������ǰ��ѭ��ʣ�����ݣ����Ͽ�ʼ��һ��ѭ��
*/

public class BreakContinue{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			if(i == 4){
				break;	//���������ѭ��
			}
			
			System.out.println("���ǵ�" + i + "��ѭ��" );
		}
		
		
		
		for(int j=1;j<=10;j++){
			if(j==4){
				continue;	//�������Ĵ�ѭ��
			}
			
			System.out.println("���ǵ�"+ j +"��ѭ��");
		}
	}
}