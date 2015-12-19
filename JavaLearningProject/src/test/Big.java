package test;

public class Big {

	public static void main(String[] args) {
		char[] ContainNum1=new char[120];
		char[] ContainNum2=new char[120];
		char[] ContainResult=new char[240];
		
		ContainNum1="12312413".toCharArray();
		ContainNum2="1".toCharArray();
		
		PlusBigInteger(ContainNum1, ContainNum2, ContainResult);
		
		System.out.println(ContainResult);
	}
	private static void PlusBigInteger(char[] ContainNum1, char[] ContainNum2, char[] ContainResult){
		//num1�� num2�� �޾Ƽ� ���ϴ� ������ �����Ѵ�	
		int carry=0;
	
		String tmpNum1_1=new String(ContainNum1);
		StringBuffer num1=new StringBuffer(tmpNum1_1);
		
		String tmpNum2_1=new String(ContainNum1);
		StringBuffer num2=new StringBuffer(tmpNum2_1);
		
		//num1�� num2���� �׻� ū ������ �Ѵ�
		if(BiggerNum(num1, num2)==0){//num1���� num2�� �� ũ�� �� ���� �ٲ۴�
		
			String containNum1=num1.toString();
			String containNum2=num2.toString();
		
			num1.delete(0, containNum1.length());
			num2.delete(0, containNum2.length());
		
			num1.append(containNum2, 0, containNum2.length());
			num2.append(containNum1, 0, containNum1.length());
		
		}
		
		int top=num1.length();
		int low=num2.length();
	
		int differ=top-low;
	
		//�ڸ������� ����� ���� �ӽ������� �ִ´� 
		int[] temp=new int[120];
	
		for(int i=top; i>(top-low); --i){
			//���� ����Ѵ�
			//���� ������ ���ڸ��� �� Ŀ���Ƿ� index�� ���� top�� ������ ���� �����Ѵ�
			temp[i]=((num1.charAt(i-1)+num2.charAt(i-differ-1)+carry)%48);
		
			if(temp[i]>=10){
				//����  10���� ���ų� ũ��
				temp[i]=temp[i]%10;
				carry=1;
	
			}
			else{
				//���� 10���� ������ �״�� ����
				carry=0;
			}
		}
	
		if(differ!=0){//�� ���� �ڸ����� �ٸ���
			//num1�� �ִ� �ڸ����� ����ϴ� ����
			for(int i=differ; i>0; i--){
			
				temp[i]=(num1.charAt(i-1)+carry)%48;
			
				if(temp[i]>=10){
					//���� �μ��� ���� 10���� Ŭ ��� 
					temp[i]=temp[i]%10;
					carry=1;
				}
				else{
					carry=0;
				}
			}
		}
		else{
			//���� �ڸ����̸� 
			temp[0]=0;
		}
	
		if(carry==1){
			//������ carry�� 1�̸�
			//���� ���ڸ��� 1
			temp[0]=1;
			MakeResult(temp, ContainResult, 0, top);
		}
		else{
		
			MakeResult(temp, ContainResult, 1, top);
		}
	
	}//Plus
	
	private static void MakeResult(int[] temp, char[] ContainResult, int start, int end){
		//tempString�� result�� �̿��� ����� result���ڿ��� �ϼ��Ѵ�.
		//start�� end�� �̿��ؼ� tempString�� ��𼭺��� ������ ������ ��ȿ�� ���ڰ� �ִ��� �� �� �ִ�
	
		int cnt=0;
	
		for(int i=0; i<=end; i++){
		
			if(temp[i]==0)
				cnt++;//0�� ����
		}
	
		if(cnt==end+1){//���� 0�̸�
		
			ContainResult[0]=(char)48;
			ContainResult[1]='\0';
		}
		else{
		
			if(start!=0){
			
				for(int i=start; i<=end; ++i){
					//�ƽ�Ű�ڵ�� ��ȯ
					ContainResult[i-start]=(char)(temp[i]+48);
				}
			
			}
			else{
			
				for(int i=start; i<=end; i++){
				
					ContainResult[i]=(char)(temp[i]+48);
				}
			}
		}
	
	}//MakeResult
	
	private static int BiggerNum(StringBuffer num1, StringBuffer num2){
		//�� ���� ������ 2, num1�� ũ�� 1, num2�� ũ�� 0�� �����ϴ� �Լ� 
		//���ڵ��� �̹� ��ȣ�� ������ �����̹Ƿ� ���ڸ� �ٷ��
		int len1=num1.length();
		int len2=num2.length();
		
		if(len1>len2)//���밪�̹Ƿ� ���̰� ��� ū���̴�
			return 1;
		else if(len1<len2)
			return 0;
		else{//�� ���� ���̰� ���� ���
			
			for(int i=0; i<len1; ++i){
				
				if(num1.charAt(i)!=num2.charAt(i)){//�� �ڸ����� ���Ͽ� ���ڰ� �޶�����
					
					if(num1.charAt(i)>num2.charAt(i))//num1�� ���ڰ� �� ũ�� num1�� �� ū��
						return 1;
					else//�׷��� ���� ��� num2�� �� ū��
						return 0;
						
				}
					
			}
			//���� ���� �ݺ����� ����ϸ� ��� ���ڰ� �����Ƿ� ���� �����̴�
			return 2;
		}
			
		//error�� �ִ� ���
		
	}
}
