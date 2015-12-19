package test;

public class StackTest {

	public static void main(String[] args) {
		StackForCalculate postfix=new StackForCalculate(20);
		postfix.push(12.457);
		postfix.push(-123.43);
		postfix.push(809.34123);
		
		System.out.println(postfix.top());
		System.out.println(postfix.top());
		System.out.println(postfix.top());
		
		System.out.println(postfix.isEmpty());
		
		System.out.println();
		
		System.out.println(postfix.pop());
		System.out.println(postfix.pop());
		System.out.println(postfix.pop());
		
		System.out.println(postfix.isEmpty());
	}

}

class Stack{
	//infix와 postfix를 다루기 위한 스택
	private char[] stack;
	private int NumberOfElement;
	private int TopOfStackNum;
	
	//////////////////////////////////////
	
	public Stack(int size){
		stack=new char[size];
		NumberOfElement=0;
		TopOfStackNum=-1;
	}
	public Stack(){
		stack=new char[100];
		NumberOfElement=0;
		TopOfStackNum=-1;
	}
	
	public void push(char value){
		TopOfStackNum++;
		stack[TopOfStackNum]=value;
		NumberOfElement++;
	}
	
	public char pop(){
		char tmp=stack[TopOfStackNum--];
		NumberOfElement--;
		return tmp;
	}
	
	public char top(){
		return stack[TopOfStackNum];
	}
	
	public boolean isEmpty(){
		if(NumberOfElement==0)
			return true;
		else
			return false;
	}
}

class StackForCalculate{
	
	private double[] StackNum;
	private int TopOfStackNum;
	private int NumberOfElement;
	
	//////////////////////////////////////
	public StackForCalculate(int size){
		StackNum=new double[size];
		TopOfStackNum=-1;
		NumberOfElement=0;
	}
	public StackForCalculate(){
		StackNum=new double[100];
		TopOfStackNum=-1;
		NumberOfElement=0;
	}
	public void push(double value){
		TopOfStackNum++;
		StackNum[TopOfStackNum]=value;
		NumberOfElement++;
	}
	public double top(){
		return StackNum[TopOfStackNum];
	}
	public double pop(){
		double tmp=StackNum[TopOfStackNum--];
		NumberOfElement--;
		return tmp;
	}
	public boolean isEmpty(){
		if(NumberOfElement==0)
			return true;
		else
			return false;
	}
}