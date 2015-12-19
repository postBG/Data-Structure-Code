package test;

import java.io.*;
import java.util.*;

public class NewSortingTest
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			boolean isRandom = false;	// �Է¹��� �迭�� �����ΰ� �ƴѰ�?
			int[] value;	// �Է� ���� ���ڵ��� �迭
			String nums = br.readLine();	// ù ���� �Է� ����
			if (nums.charAt(0) == 'r')
			{
				// ������ ���
				isRandom = true;	// �������� ǥ��

				String[] nums_arg = nums.split(" ");

				int numsize = Integer.parseInt(nums_arg[1]);	// �� ����
				int rminimum = Integer.parseInt(nums_arg[2]);	// �ּҰ�
				int rmaximum = Integer.parseInt(nums_arg[3]);	// �ִ밪

				Random rand = new Random();	// ���� �ν��Ͻ��� �����Ѵ�.

				value = new int[numsize];	// �迭�� �����Ѵ�.
				for (int i = 0; i < value.length; i++)	// ������ �迭�� ������ �����Ͽ� ����
					value[i] = rand.nextInt(rmaximum - rminimum + 1) + rminimum;
			}
			else
			{
				// ������ �ƴ� ���
				int numsize = Integer.parseInt(nums);

				value = new int[numsize];	// �迭�� �����Ѵ�.
				for (int i = 0; i < value.length; i++)	// ���پ� �Է¹޾� �迭���ҷ� ����
					value[i] = Integer.parseInt(br.readLine());
			}

			// ���� �Է��� �� �޾����Ƿ� ���� ����� �޾� �׿� �´� ������ �����Ѵ�.
			while (true)
			{
				int[] newvalue = (int[])value.clone();	// ���� ���� ��ȣ�� ���� ���纻�� �����Ѵ�.

				String command = br.readLine();

				long t = System.currentTimeMillis();
				switch (command.charAt(0))
				{
					case 'B':	// Bubble Sort
						newvalue = DoBubbleSort(newvalue);
						break;
					case 'I':	// Insertion Sort
						newvalue = DoInsertionSort(newvalue);
						break;
					case 'H':	// Heap Sort
						newvalue = DoHeapSort(newvalue);
						break;
					case 'M':	// Merge Sort
						newvalue = DoMergeSort(newvalue);
						break;
					case 'Q':	// Quick Sort
						newvalue = DoQuickSort(newvalue);
						break;
					case 'R':	// Radix Sort
						newvalue = DoRadixSort(newvalue);
						break;
					case 'X':
						return;	// ���α׷��� �����Ѵ�.
					default:
						throw new IOException("�߸��� ���� ����� �Է��߽��ϴ�.");
				}
				if (isRandom)
				{
					// ������ ��� ����ð��� ����Ѵ�.
					System.out.println((System.currentTimeMillis() - t) + " ms");
				}
				else
				{
					// ������ �ƴ� ��� ���ĵ� ������� ����Ѵ�.
					for (int i = 0; i < newvalue.length; i++)
					{
						System.out.println(newvalue[i]);
					}
				}

			}
		}
		catch (IOException e)
		{
			System.out.println("�Է��� �߸��Ǿ����ϴ�. ���� : " + e.toString());
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int[] DoBubbleSort(int[] value)
	{
		// TODO : Bubble Sort �� �����϶�.
		// value�� ���ľȵ� ���ڵ��� �迭�̸� value.length �� �迭�� ũ�Ⱑ �ȴ�.
		// ����� ���ĵ� �迭�� ������ �־�� �ϸ�, �ΰ��� ����� �����Ƿ� �� �����ؼ� ����Ұ�.
		// �־��� value �迭���� ���� ������ �ٲٰ� value�� �ٽ� �����ϰų�
		// ���� ũ���� ���ο� �迭�� ����� �� �迭�� ������ ���� �ִ�.
		return (value);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int[] DoInsertionSort(int[] value)
	{
		// TODO : Insertion Sort �� �����϶�.
		return (value);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int[] DoHeapSort(int[] value)
	{
		// TODO : Heap Sort �� �����϶�.
		return (value);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int[] DoMergeSort(int[] value)
	{
		// TODO : Merge Sort �� �����϶�.
		return (value);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int[] DoQuickSort(int[] value)
	{
		// TODO : Quick Sort �� �����϶�.
		return (value);
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////
	private static int[] DoRadixSort(int[] value)
	{
		
		int MaxValue=value[0];
		int MinValue=value[0];
		
		for(int i=0; i<value.length; i++){ //searching for max and min value
			if(value[i]>MaxValue){
				MaxValue=value[i];
			}
			if(value[i]<MinValue){
				MinValue=value[i];
			}
		}
		
		int MaxDigit=digit_count(MaxValue)>digit_count(MinValue)? digit_count(MaxValue):digit_count(MinValue);
		
		int c;
		ArrayList<ArrayList<Integer>> Positions=new ArrayList<ArrayList<Integer>>();
		for(int j=0; j<20; j++){
			Positions.add(new ArrayList<Integer>());
		}
		int d;
		
		for(int i=0; i<MaxDigit; i++){
			
			/*//initialize
			for(int j=0; j<20; j++){
				Positions.add(new ArrayList<Integer>());
			}*/
			
			for(int j=0; j<value.length; j++){
				d=(int)((value[j]/Math.pow(10, i))%10)+10;
				Positions.get(d).add(value[j]);
			}
			
			c=0;
			
			for(int j=1; j<20; j++){
				
				for(int index=0; index<Positions.get(j).size(); index++){
					value[c++]=Positions.get(j).get(index);
				}
				
			}
			//Positions.clear();
			for(int j=0; j<20; j++){
				Positions.get(j).clear();
			}
		}	
		
		return (value);
	}
	
	private static int digit_count(int n){
		
		int d=0;
		
		while(n!=0){
			d++;
			n/=10;
		}
		
		return d;
	}
}

