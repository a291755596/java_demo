public class Variable{
	public static void main(String[] args){
		int num1;
		num1 = 10;
		System.out.println(num1);
		num1 = 20;
		int num2 = 200;
		num2 = 2000;
		System.out.println(num2);
		
		byte num = 30;
		System.out.println(num);
		//byte num = 150  byte��ȡֵ��-128~127֮�䣬��ӡ150���������ݷ��أ����Իᱨ��
		
		short num3 = 50;
		System.out.println(num3);
		
		//long���Ͷ���ı���Ĭ��Ϊint���ͣ������Ҫʹ��long���ͣ���Ҫ�ں����L����
		//int����ֻ֧��2�����ҵĳ���
		long num4 = 3000000000L;
		System.out.println(num4);
		
		//�ַ�������
		//float������long����ʹ�÷���һ�����ַ���Ĭ�϶���Ϊdouble���ͣ����ʹ��float������Ҫ�ں������F����
		float num5 = 2.5F;
		System.out.println(num5);
		
		double num6 = 1.2;
		System.out.println(num6);
		
		//�ַ�����
		char zifu = 'A';
		System.out.println(zifu);
		
		//��������
		boolean var1 = true;
		System.out.println(var1);
		
		boolean var2 = var1;
		System.out.println(var2);
		
		
		//����ʹ�ò��ܳ�������������
		//System.out.println(num8);	����һ��Ҫ�ȶ����ʹ��
		
		int num8 = 500
		System.out.println(num8)
		
		{
			int num9 = 1200;
			//������ʾ��û�������
			System.out.println(num9);
		}
		
		//�����ͻ�������⣬������������
		//���ǿ�����ҳ�������¶���num9����
		System.out.println(num9);
		
	}
}