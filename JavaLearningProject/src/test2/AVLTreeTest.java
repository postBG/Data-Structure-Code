package test2;

import java.util.LinkedList;

//hello.compareTo(bye)���� hello�� ���ĺ������� ���̸� ����, ������ 0, ���̸� ����� ��ȯ�Ѵ�.
//���ĺ������� �� ���� ����  AVLTree���� ������ �ڽ��� �ǰ�, ���ΰ��� ���� �ڽ��� �ȴ�.

public class AVLTreeTest {

	public static void main(String[] args) {
		
		String Pattern1="6";
		
		ListNode node0=new ListNode(Pattern1, 1, 1, 1);
		ListNode node1=new ListNode(Pattern1, 2, 10, 1);
		ListNode node2=new ListNode(Pattern1, 3, 10, 1);
		ListNode node3=new ListNode(Pattern1, 3, 11, 1);
		ListNode node4=new ListNode(Pattern1, 4, 12, 1);
		ListNode node5=new ListNode(Pattern1, 5, 6, 1);
		ListNode node6=new ListNode(Pattern1, 8, 6, 1);
		
		String Pattern2="4";
		
		ListNode node7=new ListNode(Pattern2, 1, 12, 1);
		ListNode node8=new ListNode(Pattern2, 2, 23, 1);
		ListNode node9=new ListNode(Pattern2, 2, 25, 1);
		ListNode node10=new ListNode(Pattern2, 3, 14, 1);
		ListNode node11=new ListNode(Pattern2, 4, 7, 1);
		
		String Pattern3="3";
		
		ListNode node12=new ListNode(Pattern3, 1, 13, 1);
		ListNode node13=new ListNode(Pattern3, 2, 10, 1);
		ListNode node14=new ListNode(Pattern3, 2, 11, 1);
		ListNode node15=new ListNode(Pattern3, 3, 3, 1);
		ListNode node16=new ListNode(Pattern3, 3, 4, 1);
		ListNode node17=new ListNode(Pattern3, 3, 7, 1);
		ListNode node18=new ListNode(Pattern3, 4, 12, 1);
		ListNode node19=new ListNode(Pattern3, 4, 17, 1);
		ListNode node20=new ListNode(Pattern3, 5, 10, 1);
		ListNode node21=new ListNode(Pattern3, 6, 10, 1);
		ListNode node22=new ListNode(Pattern3, 6, 11, 1);
		ListNode node23=new ListNode(Pattern3, 7, 12, 1);
		ListNode node24=new ListNode(Pattern3, 7, 23, 1);
		ListNode node25=new ListNode(Pattern3, 8, 6, 1);
		
		String Pattern4="2";
		
		ListNode node26=new ListNode(Pattern4, 1, 24, 1);
		ListNode node27=new ListNode(Pattern4, 1, 25, 1);
		
		String Pattern5="5";
		String Pattern6="1";
		
		ListNode node28=new ListNode(Pattern5, 3, 1, 1);
		
		AVLTree TestTree=new AVLTree(1);
		AVLTree TestTree2=new AVLTree(2);
		AVLTree TestTree3=new AVLTree(3);
		
		TestTree3.PrintByHashValue(3);
		
		ListNode nodefor2in1=new ListNode(Pattern1, 2, 3, 2);
		ListNode nodefor2in2=new ListNode(Pattern1, 2, 4, 2);
		ListNode nodefor2in3=new ListNode(Pattern1, 3, 10, 2);
		ListNode nodefor2in4=new ListNode(Pattern1, 4, 5, 2);
		
		ListNode nodefor2in5=new ListNode(Pattern2, 2, 3, 2);
		ListNode nodefor2in6=new ListNode(Pattern2, 2, 4, 2);
		ListNode nodefor2in7=new ListNode(Pattern2, 3, 10, 2);
		
		ListNode nodefor2in8=new ListNode(Pattern3, 4, 5, 2);
		ListNode nodefor2in9=new ListNode(Pattern3, 2, 3, 2);
		ListNode nodefor2in10=new ListNode(Pattern3, 2, 4, 2);
		
		ListNode nodefor2in11=new ListNode(Pattern4, 3, 10, 2);
		
		ListNode nodefor2in12=new ListNode(Pattern5, 4, 5, 2);
		ListNode nodefor2in13=new ListNode(Pattern5, 5, 3, 2);
		ListNode nodefor2in14=new ListNode(Pattern5, 6, 4, 2);
		
		ListNode nodefor2in15=new ListNode(Pattern6, 3, 10, 2);
		ListNode nodefor2in16=new ListNode(Pattern6, 4, 5, 2);
		
		TestTree2.InsertNode(nodefor2in1);//1
		TestTree2.InsertNode(nodefor2in2);
		TestTree2.InsertNode(nodefor2in8);//3
		TestTree2.InsertNode(nodefor2in9);
		TestTree2.InsertNode(nodefor2in10);
		
		TestTree2.InsertNode(nodefor2in3);
		TestTree2.InsertNode(nodefor2in4);
		TestTree2.InsertNode(nodefor2in5);//2
		TestTree2.InsertNode(nodefor2in6);
		TestTree2.InsertNode(nodefor2in7);
		
		TestTree2.InsertNode(nodefor2in11);//4
		TestTree2.InsertNode(nodefor2in12);//5
		TestTree2.InsertNode(nodefor2in13);
		TestTree2.InsertNode(nodefor2in14);
		TestTree2.InsertNode(nodefor2in15);//6
		TestTree2.InsertNode(nodefor2in16);
		
	
		System.out.println(TestTree2.SearchNode(Pattern1).getNumberOfElement());
		System.out.println(TestTree2.SearchNode(Pattern2).getNumberOfElement());
		System.out.println(TestTree2.SearchNode(Pattern3).getNumberOfElement());
		System.out.println(TestTree2.SearchNode(Pattern4).getNumberOfElement());
		System.out.println(TestTree2.SearchNode(Pattern5).getNumberOfElement());
		System.out.println(TestTree2.SearchNode(Pattern6).getNumberOfElement());
		
		TestTree2.SearchNode(Pattern1).PrintNode();
		TestTree2.SearchNode(Pattern2).PrintNode();
		TestTree2.SearchNode(Pattern3).PrintNode();
		TestTree2.SearchNode(Pattern4).PrintNode();
		TestTree2.SearchNode(Pattern5).PrintNode();
		TestTree2.SearchNode(Pattern6).PrintNode();
		
		System.out.println(TestTree2.SearchNode(Pattern1).getBalnceFactor());
		System.out.println(TestTree2.SearchNode(Pattern2).getBalnceFactor());
		System.out.println(TestTree2.SearchNode(Pattern3).getBalnceFactor());
		System.out.println(TestTree2.SearchNode(Pattern4).getBalnceFactor());
		System.out.println(TestTree2.SearchNode(Pattern5).getBalnceFactor());
		System.out.println(TestTree2.SearchNode(Pattern6).getBalnceFactor());
		
		TestTree2.PrintByHashValue(2);
		
		TestTree.InsertNode(node0);//pattern1
		TestTree.InsertNode(node7);//pattern2
		TestTree.InsertNode(node1);
		TestTree.InsertNode(node2);
		TestTree.InsertNode(node12);//pattern3
		TestTree.InsertNode(node13);
		TestTree.InsertNode(node14);
		TestTree.InsertNode(node15);
		TestTree.InsertNode(node26);//pattern4
		TestTree.InsertNode(node16);
		TestTree.InsertNode(node17);
		TestTree.InsertNode(node3);
		TestTree.InsertNode(node18);
		TestTree.InsertNode(node8);
		TestTree.InsertNode(node4);
		TestTree.InsertNode(node19);
		TestTree.InsertNode(node20);
		TestTree.InsertNode(node5);
		TestTree.InsertNode(node6);
		TestTree.InsertNode(node9);
		TestTree.InsertNode(node10);
		TestTree.InsertNode(node11);
		TestTree.InsertNode(node28);//pattern5
		TestTree.InsertNode(node21);
		TestTree.InsertNode(node22);
		TestTree.InsertNode(node23);
		TestTree.InsertNode(node24);
		TestTree.InsertNode(node25);
		TestTree.InsertNode(node27);
		
		System.out.println(TestTree.SearchNode(Pattern1).getNumberOfElement());
		System.out.println(TestTree.SearchNode(Pattern2).getNumberOfElement());
		System.out.println(TestTree.SearchNode(Pattern3).getNumberOfElement());
		System.out.println(TestTree.SearchNode(Pattern4).getNumberOfElement());
		System.out.println(TestTree.SearchNode(Pattern5).getNumberOfElement());
		
		TestTree.SearchNode(Pattern1).PrintNode();
		TestTree.SearchNode(Pattern2).PrintNode();
		TestTree.SearchNode(Pattern3).PrintNode();
		TestTree.SearchNode(Pattern4).PrintNode();
		TestTree.SearchNode(Pattern5).PrintNode();
		TestTree.SearchNode(Pattern6).PrintNode();
		
		System.out.println(TestTree.SearchNode(Pattern1).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern2).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern3).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern4).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern5).getBalnceFactor());
		
		TestTree.PrintByHashValue(1);
		System.out.println("index:"+1+" line:"+TestTree.SearchNode(Pattern1).SearchByIndex(1).getLine());
		System.out.println("index:"+1+" col:"+TestTree.SearchNode(Pattern1).SearchByIndex(1).getCol());
		
		System.out.println("index:"+2+" line:"+TestTree.SearchNode(Pattern1).SearchByIndex(2).getLine());
		System.out.println("index:"+2+" col:"+TestTree.SearchNode(Pattern1).SearchByIndex(2).getCol());
		
		System.out.println();
		
		System.out.println(TestTree.getLevel(TestTree.SearchNode(Pattern3)));
		
		/*TestTree.RotateLeft(TestTree.SearchNode(Pattern2));
		
		System.out.println(TestTree.SearchNode(Pattern1).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern2).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern3).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern4).getBalnceFactor());
		System.out.println(TestTree.SearchNode(Pattern5).getBalnceFactor());
		
		TestTree.PrintByHashValue(1);*/
		
		System.out.println();
		System.out.println();
		System.out.println("New Test");
		System.out.println();
		System.out.println();
		
		String TestString1=new String("this is a boy. hello, boy.");
		String TestString2=new String("it is more important to avoid using a bad data structure.");
		String TestString3=new String("i am a boyboy. boys be ambitious!");
		String TestString4=new String("boyboyoboyboyboy");
		String TestString5=new String("more important to avoid it is more important to data");
		
		Hash Table=new Hash();
		
		Table.HashFunction(TestString1, 1);
		Table.HashFunction(TestString2, 2);
		Table.HashFunction(TestString3, 3);
		Table.HashFunction(TestString4, 4);
		Table.HashFunction(TestString5, 5);
		
		Table.getAVLTree(60).PrintByHashValue(60);
		
		int value='l'+'e'+'s'+' '+'o'+'r';
		value%=100;
		System.out.println(value);
		
		Table.retrievalPattern("boyboy");
		
		Table.retrievalPattern("more im");
	}
}
class Hash{
	
	private int TableSize=0;
	private AVLTree AVLTrees[] = null;
	/////////////////////////////////////////////
	
	public Hash(){
		TableSize=100;
		AVLTrees=new AVLTree[100];
		
		for(int i=0; i<100; i++){
			AVLTrees[i]=new AVLTree(i);
		}
	}
	public void HashFunction(String OneLine, int line){
		int size=OneLine.length();
		int sum;
		for(int i=0; i<size-5; i++){
			sum=0;
			for(int j=0; j<6; j++){
				sum+=OneLine.charAt(i+j);
			}
			int HashValue=sum%100;
			String NewPattern=new String(String.copyValueOf(OneLine.toCharArray(), i, 6));
			ListNode NewNode=new ListNode(NewPattern, line, i+1, HashValue);
			
			AVLTrees[HashValue].InsertNode(NewNode);
		}
	}
	public AVLTree getAVLTree(int HashValue){
		return AVLTrees[HashValue];
	}
	public int getTableSize(){
		return TableSize;
	}
	public void retrievalPattern(String pattern){
		
		int NumberOfHashValue=pattern.length()-5;//�� ���� hashvalue�� �ʿ����� ���Ѵ�
		String SubStringOfPattern;
		LinkedList<ListNode> list=new LinkedList<>();
		
		int HashValue;
		
		for(int i=0; i<NumberOfHashValue; i++){
			
			SubStringOfPattern=new String(String.copyValueOf(pattern.toCharArray(), i, 6));
			
			HashValue=0;
			
			for(int j=0; j<6; j++){
				HashValue+=SubStringOfPattern.charAt(j);
			}
			
			HashValue=HashValue%100;
			//�� ������ ���� treenode�� ����
			TreeNode TmpTreeNode=this.getAVLTree(HashValue).SearchNode(SubStringOfPattern);
			
			if(i==0){//�� ó���� ���
				
				//���� �� �ش� ������ ���� Ʈ������� ������ ���� ���Ѵ�
				int NumberOfElement=TmpTreeNode.getNumberOfElement();
				
				for(int j=0; j<NumberOfElement; j++){
					//���� ���ο� ��ũ�帮��Ʈ�� �� ��ǥ���� �ű��
					ListNode Tmp=TmpTreeNode.SearchByIndex(j);
					list.add(Tmp);
				}
			}
			else{
				//�� ó���� �ƴ� ���
				int NumberOfElement=TmpTreeNode.getNumberOfElement();
				ListNode Tmp;
				
				for(int j=list.size()-1; j>=0; j--){
					ListNode TmpListNode=list.get(j);
					int flag=0;
					
					for(int k=0; k<NumberOfElement; k++){
						
						Tmp=TmpTreeNode.SearchByIndex(k);
						int Line=Tmp.getLine();
						int Col=Tmp.getCol();
						
						if(TmpListNode.IsEqual(Line, Col-i))
							flag=1;
							
					}
					if(flag==0)//���ӵǴ� ���� �������� �ʴ� ��� ����
						list.remove(j);
					//�����ϴ� ��� ����
				}//for
				
			}//else
			
		}//for
		
		if(list.size()!=0){
			for(int i=0; i<list.size()-1; i++){
				System.out.print("("+list.get(i).getLine()+", "+list.get(i).getCol()+") ");
			}
			System.out.println("("+list.get(list.size()-1).getLine()+", "+list.get(list.size()-1).getCol()+")");
		}
		else if(list.size()==0){
			System.out.println("(0, 0)");
		}
	}
}
class AVLTree{
	//��  AVLTree�� ���� �콬���̺��� ��Ŷ���̴�.
	//���� ���� � �콬�� ����ϴ��� �� ���� �����Ѵ�.
	private int HashValue;
	private int NumberOfElement;
	
	//�� ��Ʈ�� �θ�� �� SuperParent�̴�.
	private TreeNode SuperParent=null;
	
	//�� Ʈ������ ����� ��� �ϱ� ���� ����
	private TreeNode NodeForPrint=null;
	//////////////////////////////////////////////////
	public AVLTree(int HashValue){
		initAVLTree(HashValue);
	}
	public void initAVLTree(int HashValue){
		this.HashValue=HashValue;
		NumberOfElement=0;
		SuperParent=new TreeNode();
		NodeForPrint=new TreeNode();
	}
	public int InsertNode(ListNode NewNode){
		//ListNode�� �޾� �װ��� �̿��� Node�� Ʈ���� �����Ѵ�.
		if(NewNode.getHashValue()!=HashValue){
			System.out.println("HashValue is not equal!");
			return 1;
		}
		
		String TmpPattern=NewNode.getPattern();
		
		if(this.SearchNode(TmpPattern)!=NodeForPrint){
			//�̹� �����ϴ� ��� �̰����� ó��
			//��ũ�帮��Ʈ�� �߰��ȴ�.
			TreeNode TmpNode=this.SearchNode(TmpPattern);
			TmpNode.pushList(NewNode);
			return 0;
		}
		
		//�������� �ʴ� ���
		TreeNode Parent=SuperParent;
		TreeNode iter=SuperParent.getLeft();
		
		while(iter!=null){
			
			Parent=iter;
			
			if(TmpPattern.compareTo(iter.getPattern())<0){
				//TmpPattern�� �� ���̹Ƿ� �������� �����Ѵ�
				//�������� ���� iter�� �ִ� ����� balancefactor�� 1�� �����Ѵ�.
				iter=iter.getLeft();
				
			}
			else if(TmpPattern.compareTo(iter.getPattern())>0){
				//TmpPattern�� ���ĺ������� �� �ڸ� ���������� �����Ѵ�.	
				iter=iter.getRight();
			}
			else if(TmpPattern.compareTo(iter.getPattern())==0){
				//���� ������ ��� ��ũ�帮��Ʈ�� �߰�
				iter.pushList(NewNode);
				return 0;
			}
		}
		
		iter=new TreeNode(NewNode);
		if(Parent==this.SuperParent || TmpPattern.compareTo(Parent.getPattern())<0){
			Parent.setLeft(iter);
			iter.setParent(Parent);
			NumberOfElement++;
			ChangeAllBalanceFactor(SuperParent.getLeft());
		}
		else{
			Parent.setRight(iter);
			iter.setParent(Parent);
			NumberOfElement++;
			ChangeAllBalanceFactor(SuperParent.getLeft());
		}
		
		MakeBalanced(iter);
		return 0;
	}
	public void RotateLeft(TreeNode Curr){
		//balancefactor�� 2�� ���� �ڽ��� curr
		
		TreeNode RightChild=Curr.getRight();
		TreeNode Parent=Curr.getParent();
		TreeNode RightChildsLeftChild=RightChild.getLeft();
		
		int flag;
		
		if(Parent.getLeft()==Curr)
			flag=1;
		else
			flag=-1;
		
		if(flag==1)
			Parent.setLeft(RightChild);
		else
			Parent.setRight(RightChild);
		
		RightChild.setParent(Parent);
		
		Curr.setParent(RightChild);
		RightChild.setLeft(Curr);
		
		Curr.setRight(RightChildsLeftChild);
		if(RightChildsLeftChild!=null){
			RightChildsLeftChild.setParent(Curr);
		}
		
		ChangeAllBalanceFactor(SuperParent.getLeft());
		
	}
	public void RotateRight(TreeNode Curr){
		TreeNode Parent=Curr.getParent();
		TreeNode LeftChild=Curr.getLeft();
		TreeNode LeftChildsRightChild=Curr.getRight();
		
		int flag;
		
		if(Parent.getLeft()==Curr)
			flag=1;
		else
			flag=-1;
	
		if(flag==1)
			Parent.setLeft(LeftChild);
		else
			Parent.setRight(LeftChild);
		
		LeftChild.setParent(Parent);
		
		Curr.setParent(LeftChild);
		LeftChild.setRight(Curr);
		
		Curr.setLeft(LeftChildsRightChild);
		if(LeftChildsRightChild!=null){
			LeftChildsRightChild.setParent(Curr);
		}
		
		ChangeAllBalanceFactor(SuperParent.getLeft());
	}
	public int getNumberOfElement(){
		return NumberOfElement;
	}
	public int getHashvalue(){
		return HashValue;
	}
	public TreeNode getSuperParent(){
		return SuperParent;
	}
	public TreeNode SearchNode(String Pattern){
		//������ ���� ��带 ã�Ƽ� �� �ּҸ� �����Ѵ�.
		TreeNode iter=SuperParent.getLeft();
		
		while(iter!=null && Pattern.compareTo(iter.getPattern())!=0){
			if(Pattern.compareTo(iter.getPattern())<0){
				//���ĺ������� Pattern�� �� ���̸�  ���� �ڽ����� ����.
				iter=iter.getLeft();
			}
			else{
				//���ĺ������� Pattern�� �� �ڰų� ������ ������ �ڽ����� ����.
				iter=iter.getRight();
			}
		}
		
		if(iter==null)
			return NodeForPrint;//��ã�� ��
		else
			return iter;
	}
	public void PreOrederTraverse(TreeNode Start){
		if(Start!=null){
			System.out.print(Start.getPattern()+' ');
			PreOrederTraverse(Start.getLeft());
			PreOrederTraverse(Start.getRight());
		}
	}
	public void PrintByHashValue(int HashValue){
		//���� �� AVLTree�� �´� HashValue�� ������ ���ϵ��� ���� ����Ѵ�.
		//���� �������� ������ ����ϸ� �ȵǴµ�...
		if(HashValue==this.HashValue){
			if(NumberOfElement!=0){
				PreOrederTraverse(SuperParent.getLeft());
				System.out.println();
			}
			else{
				System.out.println("EMPTY");
			}
		}
		
	}
	public int getLevel(TreeNode Root){
		//Root�� �Ѹ��� �ϴ� Ʈ���� �ִ� ���̸� ��ȯ
		if(Root==null) return 0;
		
		int lLevel=getLevel(Root.getLeft());
		int rLevel=getLevel(Root.getRight());
		
		if(lLevel>rLevel)
			return lLevel+1;
		else
			return rLevel+1;
	}
	public void setBalanceFactor(TreeNode Node){
		//Node�� balacneFactor�� �����Ѵ�.
		int LeftSubTreeLevel=getLevel(Node.getLeft());
		int RightSubTreeLevel=getLevel(Node.getRight());
		
		int NewBlanceFactor=LeftSubTreeLevel-RightSubTreeLevel;
		
		Node.setBalanceFactor(NewBlanceFactor);
		
	}
	public void ChangeAllBalanceFactor(TreeNode Root){
		if(Root!=null){
			setBalanceFactor(Root);
			ChangeAllBalanceFactor(Root.getLeft());
			ChangeAllBalanceFactor(Root.getRight());
		}
	}
	public TreeNode FindUnbalancedNode(TreeNode NewNode){
		//���ο� ��带 �߽����� �ұ����� �߻��� ���� ��带 ã�� ����
		
		TreeNode iter=NewNode;
		
		while(iter.getBalnceFactor()!=-2 && iter.getBalnceFactor()!=2 && iter!=SuperParent){
			iter=iter.getParent();
		}
		
		return iter;
	}
	public void MakeBalanced(TreeNode NewNode){
		//balance�� �ȸ´� ��带 �޾� �װ��� �̿��� ȸ�� ������ ����
		
		TreeNode iter=NewNode;
		
		//System.out.println("here1 "+iter.getPattern());
		
		while(iter.getBalnceFactor()!=-2 && iter.getBalnceFactor()!=2 && iter!=SuperParent){
			iter=iter.getParent();
		}
		
		//System.out.println("here2 "+iter.getPattern());
		
		if(iter==SuperParent){//������ ���� �´� ���
			ChangeAllBalanceFactor(SuperParent.getLeft());
			return;
		}
		
		if(iter.getBalnceFactor()==2){
			TreeNode LeftChild=iter.getLeft();
			if(LeftChild.getBalnceFactor()==-1){//"Left Right case"
				RotateLeft(LeftChild);//reduce to "Left Left case"
			}
			//Left Left Case
			RotateRight(iter);
		}
		else if(iter.getBalnceFactor()==-2){
			TreeNode RightChild=iter.getRight();
			if(RightChild.getBalnceFactor()==1){
				//Right Left Case
				RotateRight(RightChild);//reduce to Right Right Case
			}
			//Right Right Case
			RotateLeft(iter);
		}
	}
}

class TreeNode{
	//�� Ʈ���� ���� ����� ��ũ�� ����Ʈ�̴�.
	
	private int BalanceFactor=0;
	
	//�� ������ ���ڿ� ������ �����Ѵ�.
	private String TreePattern;
	
	//�Ʒ��� �� ������ head�� ����Ѵ�.
	private TreeNode parent=null;
	private TreeNode left=null;
	private TreeNode right=null;
	
	//�Ʒ��� �� ������ ���� ��ũ�帮��Ʈ�� ������ ���� �̿��Ѵ�.
	private ListNode head=null;
	private ListNode tail=null;
	
	//��ũ�帮��Ʈ�� ������ ����
	private int NumberOfElement=0;
	//////////////////////////////////////////////
	public TreeNode(){
		initList();
	}
	public TreeNode(String Pattern){
		initList(Pattern);
	}
	public TreeNode(ListNode NewNode){
		initList(NewNode.getPattern());
		pushList(NewNode);
	}
	public void initList(){
		//�� �����ڴ� root�� parent�� ���鶧 �̿��Ѵ�.
		//TreePattern�� ���� null�� ���� �̿��� �����Ѵ�.
		
		//����Ʈ�� ������ ���� �ڵ�
		NumberOfElement=0;
		head=new ListNode();
		tail=new ListNode();
		
		head.setIndex(-1);
		
		head.setNext(tail);
		head.setPrev(head);
		
		tail.setNext(tail);
		tail.setPrev(head);
		
		//Ʈ���� �ʿ��� ������ �ʱ�ȭ
		parent=null;
		left=null;
		right=null;
		
		TreePattern=null;
	}
	public void initList(String Pattern){
		//�� ��ǥ�� ���� ����Ʈ�� �����ϰ� �ʱ�ȭ�Ѵ�.
		
		//����Ʈ�� ������ ���� �ڵ�
		NumberOfElement=0;
		head=new ListNode();
		tail=new ListNode();
		
		head.setIndex(-1);
		
		head.setNext(tail);
		head.setPrev(head);
		
		tail.setNext(tail);
		tail.setPrev(head);
		
		//Ʈ���� �ʿ��� ������ �ʱ�ȭ
		parent=null;
		left=null;
		right=null;
		
		TreePattern=new String(Pattern);
	}
	public int getNumberOfElement(){
		return NumberOfElement;
	}
	
	public void pushList(ListNode NewNode){
		//�ܺο��� ListNode�� �ʱ�ȭ�Ͽ� �� ��ũ�帮��Ʈ�� ������.
		ListNode Front=tail.getPrev();
		ListNode Back=tail;
		
		NewNode.setNext(Back);
		NewNode.setPrev(Front);
		
		Front.setNext(NewNode);
		Back.setPrev(NewNode);
		
		NewNode.setIndex();
		
		NumberOfElement++;
	}
	
	public void setParent(TreeNode Parent){
		this.parent=Parent;
	}
	
	public void setLeft(TreeNode Left){
		this.left=Left;
	}
	
	public void setRight(TreeNode Right){
		this.right=Right;
	}
	
	public void SetPattern(String Pattern){
		this.TreePattern=new String(Pattern);
	}
	
	public void setBalanceFactor(int newBalanceFactor){
		this.BalanceFactor=newBalanceFactor;
	}
	
	public String getPattern(){
		return this.TreePattern;
	}
	
	public TreeNode getParent(){
		return this.parent;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public int getBalnceFactor(){
		return BalanceFactor;
	}
	
	public void PrintNode(){
		//�� �Լ��� �״�� ����� �� ����.
		
		ListNode iter=head.getNext();
		
		if(NumberOfElement==0){
			System.out.println("(0, 0)");
			return;
		}
		
		while(iter!=tail.getPrev()){
			System.out.printf("(%d, %d) ", iter.getLine(), iter.getCol());
			iter=iter.getNext();
		}
		
		//������ ��ǥ �ڿ��� ������ ������� �ʴ´�.
		System.out.printf("(%d, %d)", iter.getLine(), iter.getCol());
		System.out.println();
		
		return;
	}
	
	public ListNode SearchByIndex(int index){
		//index�� �޾� �� index�� ���� ��带 �����Ѵ�
		
		ListNode iter=head.getNext();
		
		while(iter!=tail && iter.getIndex()!=index){
			iter=iter.getNext();
		}
		
		if(iter==tail)
			return null;
		
		return iter;
	}
}

class ListNode{
	
	private String pattern;
	
	//�� �ΰ��� key���̴� 
	private int line;
	private int col;
	private int index;
	
	private ListNode next=null;
	private ListNode prev=null;
	
	private int HashValue;
	//////////////////////////////////
	public ListNode(){
		
	}
	public ListNode(String Pattern, int line, int col, int hash){
		//���� �ؽ��� ���� ��ġ �׸��� ������ �Է¹޾� ����Ʈ�� ���� ��带 �ʱ�ȭ�Ѵ�.
		HashValue=hash;
		this.line=line;
		this.col=col;
		this.pattern=new String(Pattern);
		
	}
	
	public void setNext(ListNode NextNode){
		this.next=NextNode;
	}
	
	public void setPrev(ListNode PrevNode){
		this.prev=PrevNode;
	}
	
	public int getLine(){
		return line;
	}
	
	public int getCol(){
		return col;
	}
	
	public void setIndex(){
		this.index=(this.getPrev().getIndex())+1;
	}
	
	public void setIndex(int a){
		this.index=a;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public ListNode getNext(){
		return next;
	}
	public ListNode getPrev(){
		return prev;
	}
	
	public int getHashValue(){
		return HashValue;
	}
	
	public String getPattern(){
		return pattern;
	}
	
	public boolean IsEqual(int Line, int Col){
		if(this.line==Line && this.col==Col)
			return true;
		else
			return false;
	}
}
