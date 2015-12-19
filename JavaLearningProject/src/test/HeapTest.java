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
	//heap은 배열로 구현하며, 완전한 이진트리이다.
	//부모노드의 인덱스는 ((자식노드인덱스-1)/2) 이고, 자식노드의 인덱스는 (부모노드인덱스*2+1), (부모노드인덱스*2+2)이다
	//내부노드의 수는 (HeapSize-1)/2까지의 인덱스를 가지는 것들이다.
	//1번 인덱스부터 사용하고 0번은 보초를 둔다
	
	final int INT_MAX=Integer.MAX_VALUE;
	
	private int[] HeapArray;
	private int HeapSize;
	
	public HeapForSort(){
		//쓸 일이 없어서 구현은 하지않음
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
		//힙을 저장한 배열과 상승시킬 노드의 index 를 받아 upheap시킨다.
		int NodeValue=HeapArray[nodeindex];
		//힙에서 0번째 index는 사용하지 않으므로 보초를 둔다.
		
		while(nodeindex!=0 && HeapArray[(nodeindex-1)/2]<=NodeValue){
			
			//자식 노드에 부모의 값을 넣는다
			HeapArray[nodeindex]=HeapArray[(nodeindex-1)/2];
			
			nodeindex=(nodeindex-1)/2;
		}
		
		HeapArray[nodeindex]=NodeValue;
	}
	
	public void makeDownHeap(int nodeindex){
		//힙을 저장한 배열과 그 힙의 크기(배열의 크기가 아니다), 그리고 하강시킬 노드의 인덱스를 입력받아 downheap시킨다.
		int NodeValue=HeapArray[nodeindex];
		int IndexForChild;//자식 노드의 인덱스를 추적하는데 이용한다.
		
		System.out.println("Heap Size:"+HeapSize);
		System.out.print("Before:");
		printHeap();
		
		while(nodeindex<=((HeapSize)/2-1)){
			//내부노드에 한해서
			IndexForChild=nodeindex*2+1;//IndexForChild는 왼쪽 자식노드를 가리키게 된다.
			
			//더 큰 자식 노드와 비교하기 위해 오른쪽 자식이 더 크면 오른쪽 자식을 참조하게 Index를 올린다
			if(IndexForChild<HeapSize && HeapArray[IndexForChild]<HeapArray[IndexForChild+1])
				IndexForChild++;
			
			if(NodeValue>=HeapArray[IndexForChild])//부모의 값이  값이 더 큰 자식보다 커지면 나간다. 
				break;
			
			HeapArray[nodeindex]=HeapArray[IndexForChild];
			nodeindex=IndexForChild;
		}
		HeapArray[nodeindex]=NodeValue;
		
		System.out.print("After:");
		printHeap();
	}
	
	public void insert(int NewValue){
		//가장 말단 노드에 삽입 후에 heap조건에 맞게 upheap시킨다. 
		makeUpHeap(HeapSize);
		HeapSize++;
	}
	
	public int extract(){
		
		int RootValue=HeapArray[0];
		HeapArray[0]=HeapArray[HeapSize-1];//말단을 뿌리로 올린다
		HeapSize--;
		
		makeDownHeap(0);
		
		return RootValue;
	}
	
	public void returnSortedArray(int[] value){
		//인자로 받은 배열에 이 힙소트로 소트한 값을 넣어준다.
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

