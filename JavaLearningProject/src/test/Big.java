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
		//num1과 num2를 받아서 더하는 연산을 실행한다	
		int carry=0;
	
		String tmpNum1_1=new String(ContainNum1);
		StringBuffer num1=new StringBuffer(tmpNum1_1);
		
		String tmpNum2_1=new String(ContainNum1);
		StringBuffer num2=new StringBuffer(tmpNum2_1);
		
		//num1이 num2보다 항상 큰 수여야 한다
		if(BiggerNum(num1, num2)==0){//num1보다 num2가 더 크면 두 수를 바꾼다
		
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
	
		//자릿수마다 계산한 값을 임시적으로 넣는다 
		int[] temp=new int[120];
	
		for(int i=top; i>(top-low); --i){
			//합을 계산한다
			//합은 많으면 한자리가 더 커지므로 index의 값이 top인 곳부터 값을 저장한다
			temp[i]=((num1.charAt(i-1)+num2.charAt(i-differ-1)+carry)%48);
		
			if(temp[i]>=10){
				//합이  10보다 같거나 크면
				temp[i]=temp[i]%10;
				carry=1;
	
			}
			else{
				//합이 10보다 작으면 그대로 저장
				carry=0;
			}
		}
	
		if(differ!=0){//두 수가 자릿수가 다르면
			//num1만 있는 자릿수를 계산하는 과정
			for(int i=differ; i>0; i--){
			
				temp[i]=(num1.charAt(i-1)+carry)%48;
			
				if(temp[i]>=10){
					//만일 두수의 합이 10보다 클 경우 
					temp[i]=temp[i]%10;
					carry=1;
				}
				else{
					carry=0;
				}
			}
		}
		else{
			//같은 자릿수이면 
			temp[0]=0;
		}
	
		if(carry==1){
			//마지막 carry가 1이면
			//가장 앞자리가 1
			temp[0]=1;
			MakeResult(temp, ContainResult, 0, top);
		}
		else{
		
			MakeResult(temp, ContainResult, 1, top);
		}
	
	}//Plus
	
	private static void MakeResult(int[] temp, char[] ContainResult, int start, int end){
		//tempString과 result를 이용해 출력할 result문자열을 완성한다.
		//start와 end를 이용해서 tempString에 어디서부터 어디까지 복사할 유효한 숫자가 있는지 알 수 있다
	
		int cnt=0;
	
		for(int i=0; i<=end; i++){
		
			if(temp[i]==0)
				cnt++;//0의 갯수
		}
	
		if(cnt==end+1){//전부 0이면
		
			ContainResult[0]=(char)48;
			ContainResult[1]='\0';
		}
		else{
		
			if(start!=0){
			
				for(int i=start; i<=end; ++i){
					//아스키코드로 변환
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
		//두 수가 같으면 2, num1이 크면 1, num2가 크면 0을 리턴하는 함수 
		//인자들은 이미 부호를 제거한 상태이므로 숫자만 다룬다
		int len1=num1.length();
		int len2=num2.length();
		
		if(len1>len2)//절대값이므로 길이가 길면 큰수이다
			return 1;
		else if(len1<len2)
			return 0;
		else{//두 수의 길이가 같은 경우
			
			for(int i=0; i<len1; ++i){
				
				if(num1.charAt(i)!=num2.charAt(i)){//각 자릿수를 비교하여 숫자가 달라지면
					
					if(num1.charAt(i)>num2.charAt(i))//num1의 숫자가 더 크면 num1이 더 큰수
						return 1;
					else//그렇지 않은 경우 num2가 더 큰수
						return 0;
						
				}
					
			}
			//만일 위의 반복문을 통과하면 모든 숫자가 같으므로 같은 숫자이다
			return 2;
		}
			
		//error가 있는 경우
		
	}
}
