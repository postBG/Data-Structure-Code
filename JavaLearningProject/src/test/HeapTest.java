package test;

public class HeapTest {
	
	public static void main(String[] args) {
		int[] value={7, 2, 4, 6 ,3, 9, 2, 1};
		
		HeapForSort heap=new HeapForSort(value);
		
		
		System.out.println("Unsorted");
		for(int i=0; i<value.length; i++){
			System.out.println(value[i]);
		}
		System.out.println();
		System.out.println();
		
		//heap.printHeap();
		
		heap.returnSortedArray(value);
		
		System.out.println("Sorted");
		for(int i=0; i<value.length; i++){
			System.out.println(value[i]);
		}
	}
	
	
}

class HeapForSort{
	//heap�� �迭�� �����ϸ�, ������ ����Ʈ���̴�.
	//�θ����� �ε����� ((�ڽĳ���ε���-1)/2) �̰�, �ڽĳ���� �ε����� (�θ����ε���*2+1), (�θ����ε���*2+2)�̴�
	//���γ���� ���� (HeapSize-1)/2������ �ε����� ������ �͵��̴�.
	//1�� �ε������� ����ϰ� 0���� ���ʸ� �д�
	
	final int INT_MAX=Integer.MAX_VALUE;
	
	private int[] HeapArray;
	private int HeapSize;
	
	public HeapForSort(){
		//�� ���� ��� ������ ��������
	}
	
	public int getHeapSize(){
		return HeapSize;
	}
	
	public HeapForSort(int[] value){
		
		HeapArray=value;
		
		HeapSize=0;
		for(int i=0; i<value.length; i++){
			this.insert(value[i]);
		}
		
	}
	
	public void makeUpHeap(int nodeindex){
		//���� ������ �迭�� ��½�ų ����� index �� �޾� upheap��Ų��.
		int NodeValue=HeapArray[nodeindex];
		//������ 0��° index�� ������� �����Ƿ� ���ʸ� �д�.
		
		while(nodeindex!=0 && HeapArray[(nodeindex-1)/2]<=NodeValue){
			
			//�ڽ� ��忡 �θ��� ���� �ִ´�
			HeapArray[nodeindex]=HeapArray[(nodeindex-1)/2];
			
			nodeindex=(nodeindex-1)/2;
		}
		
		HeapArray[nodeindex]=NodeValue;
	}
	
	public void makeDownHeap(int nodeindex){
		//���� ������ �迭�� �� ���� ũ��(�迭�� ũ�Ⱑ �ƴϴ�), �׸��� �ϰ���ų ����� �ε����� �Է¹޾� downheap��Ų��.
		int NodeValue=HeapArray[nodeindex];
		int IndexForChild;//�ڽ� ����� �ε����� �����ϴµ� �̿��Ѵ�.
		
		System.out.println("Heap Size:"+HeapSize);
		System.out.print("Before:");
		printHeap();
		
		while(nodeindex<=((HeapSize)/2-1)){
			//���γ�忡 ���ؼ�
			IndexForChild=nodeindex*2+1;//IndexForChild�� ���� �ڽĳ�带 ����Ű�� �ȴ�.
			
			//�� ū �ڽ� ���� ���ϱ� ���� ������ �ڽ��� �� ũ�� ������ �ڽ��� �����ϰ� Index�� �ø���
			if(IndexForChild<HeapSize && HeapArray[IndexForChild]<HeapArray[IndexForChild+1])
				IndexForChild++;
			
			if(NodeValue>=HeapArray[IndexForChild])//�θ��� ����  ���� �� ū �ڽĺ��� Ŀ���� ������. 
				break;
			
			HeapArray[nodeindex]=HeapArray[IndexForChild];
			nodeindex=IndexForChild;
		}
		HeapArray[nodeindex]=NodeValue;
		
		System.out.print("After:");
		printHeap();
	}
	
	public void insert(int NewValue){
		//���� ���� ��忡 ���� �Ŀ� heap���ǿ� �°� upheap��Ų��. 
		makeUpHeap(HeapSize);
		HeapSize++;
	}
	
	public int extract(){
		
		int RootValue=HeapArray[0];
		HeapArray[0]=HeapArray[HeapSize-1];//������ �Ѹ��� �ø���
		HeapSize--;
		
		makeDownHeap(0);
		
		return RootValue;
	}
	
	public void returnSortedArray(int[] value){
		//���ڷ� ���� �迭�� �� ����Ʈ�� ��Ʈ�� ���� �־��ش�.
		for(int i=value.length-1; i>=0; i--){
			value[i]=extract();
		}
	}
	
	public void printHeap(){
		
		for(int i=0; i<HeapSize; i++){
			System.out.printf("%d ", HeapArray[i]);
		}
		System.out.println();
	}
}

