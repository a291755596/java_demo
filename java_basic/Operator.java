public class Operator{
	public static void main(String[] args){
		//�����������byte,short,char����������Ϊint���м���
		//������֮�����ѧ����
		System.out.println(30 + 50);
		
		//������֮�����ѧ����
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1+num2);
		
		//�����ͳ������Ի��ʹ��
		System.out.println(num1 + 100);
		
		//��������
		//����һ�������ı��ʽ��˵�������õ������������������������������Ȼ������������������ֻ����
		int num3 = 10;
		int num4 = 3;
		//���ڶ���int ���͵����ݣ����Խ����3
		System.out.println(num3 / num4);
		
		//ȡ�����㣬ע��ֻ�ж�������������˵��ȡģ�����������������
		//�õ��������������������Խ����1
		System.out.println(num3 % num4);
		
		//�ر�ע�⣺һ�����㵱���в�ͬ���͵����ݣ���ô������������ݷ�Χ�������
		//int + double -->double + double = double
		//double ��ȡֵ��Χ��int ��ΧҪ��������Ҫ��int ת��Ϊdouble�ٽ�������
		double result = num3 + 2.5;
		System.out.println(result);	//�����������12.5
		
		System.out.println("----------------------------�ӷ�������ʹ�ò���-------------------------------------");
		
		//����ļӷ���������ַ�����ƴ�����ã�
		String str = "Hello";
		System.out.println(str);
		System.out.println(str + "world");	//����Ľ��ΪHelloWorld
		
		//�κ��������ͺ��ַ�����������ʱ�򶼻����ַ���
		//String + int = String
		String str1 = "Hello";
		System.out.println(str1 + 20);  //����Ľ��ΪHello20
		
		//���ȼ�������
		System.out.println(str1 + 20 + 30); //������ΪHello2030
		System.out.println(str1 + ( 20 + 30 ));	//������ΪHello50
		
		
		System.out.println("----------------------------�����Լ�����-------------------------------------");
	
		//�����Լ������ ֻ�б������ܽ��������Լ����㣬��������ʹ��
		//����ʹ�õĲ���
		int num = 10;
		System.out.println(num);
		++num;
		System.out.println(num);
		num++;
		System.out.println(num);
		
		//���ʹ�õĲ��֣�ǰ++�ͺ�++����ܴ�
		//�ʹ�ӡ���һ��ʹ��
		int num11 = 20;
		System.out.println(++num11);	//21
		System.out.println(num11);		//21
		
		int num12 = 30;
		System.out.println(num12++);	//30
		System.out.println(num12);		//31
		
		//���������һ��ʹ��
		int num13 = 10;
		int result3 = num13 --;
		System.out.println(result3); 	// 10
		System.out.println(num13);		//9
		
		int num14 = 50;
		int result4 = -- num14;
		System.out.println(result4); 	//49
		System.out.println(num14);		//49
		
	}
}