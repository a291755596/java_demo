public class DataType{
	public static void main(String[] args){
		//��ʽ����ת�������ݷ�Χ��С����
		System.out.println(1024);
		System.out.println(2.5);
		//�����long���ͣ��ұ���Ĭ�ϵ�int���ͣ��������Ͳ�һ��
		//���Ҳ��int��ֵ����ߵ�long int-->long�����ݷ�Χ��С����
		//���Իᷢ����������ת��
		long num1 = 100;
		System.out.println(num1);
		
		//�����double���ͣ��ұ���float���ͣ��������Ͳ�һ��
		//���ұߵ�float���͸�ֵ����ߵ�double���� float-->double�����ݷ�Χ��С����
		//�������ݻᷢ������ת��
		double num2 = 2.5F;
		System.out.println(num2);
		
		
		//�����float���ͣ��ұ���long���ͣ��������Ͳ�һ��
		//���ұߵ�long����ת��Ϊ��ߵ�float���� long-->float�����ݷ�Χ��С����
		//�������ݻᷢ������ת��  ���Ϊ30.0
		float num3 = 30L;
		System.out.println(num3);
		System.out.println("-------------------�����ķָ���------------------------");
		
		//ǿ������ת������ʽ����ΧС������ ��ΧС�ı��� = ����ΧС�����ͣ�ԭ����Χ������ݣ�
		//�����int���ͣ��ұ���long���ͣ��ұߵ����ݷ�Χ����ߵĴ󣬲��ܷ����Զ�ת����Ҫ����ǿ������ת��
		//int num5 = 100F;	�ᱨ����longת����int���ܺ�����ʧ
		int num5 = (int)100L;
		System.out.println(num5);
		
		//����ұߵ�����ȡֵ��Χ������ߵ�ȡֵ��Χ��ʱ�򣬽���ǿ������ת�����������������
		//longǿ��ת����Ϊint���ͻ��������
		int num6 = (int)6000000000L;
		System.out.println(num6);
		
		
		//�ұ�Ϊdouble���ͣ����Ϊint���ͣ�ǿ������ת����Ϊ2�����ݳ�����������
		int num7 = (int)2.5;
		System.out.println(num7);
		
		//char���Ϳ��Խ�������
		//һ��char���ͽ�������ѧ���㣬��ô�Ȱ�char����ת��Ϊint��Ȼ����ASCII�뷭���Ϊһ������
		char zifu = 'A';
		System.out.println(zifu + 1); //�����66��ASCII��
		
		//byte��byte���Ҳ����ת����Ϊint����
		byte num8 = 40;
		byte num9 = 50;
		//������Ҫע�⣺byte��byte�����byte�ᱻת����Ϊint����
		//byte + byte -->int + int = int  ��������Ӧ��ʹ��int������,����ʹ��byte������
		//byte result = num8 + num9;
		int result = num8 + num9;
		System.out.println(result);
		
		short num10 = 60;
		//byte + short --> int + int = int ����ҲҪʹ��int����
		int result1 = num8 + num10;
		System.out.println(result1);
		//���һ��Ҫʹ��short�����գ�����ʹ��ǿ������ת��
		//���뱣֤�߼��ϵĴ�Сû�г���short������ȡֵ��Χ
		short result2 = (short)(num8+num10);
		System.out.println(result2);
	}
}