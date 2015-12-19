package test2;

import java.util.Random;

public class TestCaseMaker {

	public static void main(String[] args) {
		int a;
		
		a=1000;
		String TmpString=new String("aabbcc");
		String A[]=new String[3];
		Random rand=new Random();
		int tmp;
		
		A[0]=new String("a");
		A[1]=new String("b");
		A[2]=new String("c");
		
		for(int i=0; i<a; i++){
			tmp=(rand.nextInt(3))%3;
			TmpString=TmpString.concat(A[tmp]);
			TmpString=String.copyValueOf(TmpString.toCharArray(), 1, 6);
			System.out.println(TmpString);
		}
		
		int tmp2='a'+'a'+'b'+'b'+'c'+'c';
		tmp2%=100;
		System.out.println(tmp2);
	}

}
