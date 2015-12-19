package tomato2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class tomatocode2 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Daycomparator CompareWithDay=new Daycomparator();
		PriorityQueue<Grid> DayQueue=new PriorityQueue<Grid>(20, CompareWithDay);
		
		try {
			String input=br.readLine();
			
			StringTokenizer st=new StringTokenizer(input);
			int M=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(st.nextToken());
			int H=Integer.parseInt(st.nextToken());
			
			Grid[][][] TomatoPlate=new Grid[M+2][N+2][H+2];//x,y, z����
			
			for(int k=1; k<=H; k++){
			
				for(int i=1; i<=N; i++){
				
					input=br.readLine();
					st=new StringTokenizer(input);
					for(int j=1; j<=M; j++){
					
						TomatoPlate[j][i][k]=new Grid(Integer.parseInt(st.nextToken()), j, i, k);
					
					}
				
				}
			}
			//������ -1�� �θ���
			for(int i=0; i<M+2; i++){//m, n
				for(int j=0; j<N+2; j++){
					TomatoPlate[i][j][0]=new Grid(-1, i, j, 0);
					TomatoPlate[i][j][H+1]=new Grid(-1, i, j, H+1);
				}
			}
			
			for(int i=0; i<M+2; i++){//m, h
				for(int j=1; j<=H; j++){
					TomatoPlate[i][0][j]=new Grid(-1, i, 0, j);
					TomatoPlate[i][N+1][j]=new Grid(-1, i, N+1, j);
				}
			}
			
			for(int i=1; i<=N; i++){
				for(int j=1; j<=H; j++){
					TomatoPlate[0][i][j]=new Grid(-1, 0, i, j);
					TomatoPlate[M+1][i][j]=new Grid(-1, M+1, i, j);
				}
				
			}
			
			for(int k=1; k<=H; k++){
				for(int i=1; i<=M; i++){//��ó��  ���� �;��ִ� �丶�並 pq�� �ִ´�
					for(int j=1; j<=N; j++){
						if(TomatoPlate[i][j][k].day==0){
							DayQueue.add(new Grid(0, i, j, k,1));
						}
					}
				}
			}
			//������� pq���� ���� ���� ó���Ѵ�
			//pq�� empty�� �ɶ����� ����
			Grid Tmp;
			int tx, ty, tz, newday;
			while(!DayQueue.isEmpty()){
				//���� ���� ����  ������ ������ ū ��� continue
				//�׷��� ���� ��� ������ update�ؼ� �����ϸ� �ٽ� pq�� �ִ´�
				
				Tmp=DayQueue.remove();
				tx=Tmp.x;
				ty=Tmp.y;
				tz=Tmp.z;
				
				/*System.out.println("Tomato["+tx+"]["+ty+"].day="+TomatoPlate[tx][ty].day);
				System.out.println("Tmp.day="+Tmp.day);*/
				
				if(TomatoPlate[tx][ty][tz].day<Tmp.day){
					continue;
				}
				
				//����������� update�� �õ��Ͽ� �����ϸ� pq�� �ִ´�
				newday=TomatoPlate[tx][ty][tz].day+1;

				//up
				if(newday<TomatoPlate[tx][ty-1][tz].day){
					TomatoPlate[tx][ty-1][tz].day=newday;
					DayQueue.add(new Grid(newday, tx, ty-1, tz, 1));
				}
				//down
				if(newday<TomatoPlate[tx][ty+1][tz].day){
					TomatoPlate[tx][ty+1][tz].day=newday;
					DayQueue.add(new Grid(newday, tx, ty+1, tz, 1));
				}
				//right
				if(newday<TomatoPlate[tx+1][ty][tz].day){
					TomatoPlate[tx+1][ty][tz].day=newday;
					DayQueue.add(new Grid(newday, tx+1, ty, tz, 1));
				}
				//left
				if(newday<TomatoPlate[tx-1][ty][tz].day){
					TomatoPlate[tx-1][ty][tz].day=newday;
					DayQueue.add(new Grid(newday, tx-1, ty, tz, 1));
				}
				//front
				if(newday<TomatoPlate[tx][ty][tz+1].day){
					TomatoPlate[tx][ty][tz+1].day=newday;
					DayQueue.add(new Grid(newday, tx, ty, tz+1, 1));
				}
				//back
				if(newday<TomatoPlate[tx][ty][tz-1].day){
					TomatoPlate[tx][ty][tz-1].day=newday;
					DayQueue.add(new Grid(newday, tx, ty, tz-1, 1));
				}
			}
			
			/*for(int i=1; i<=M; i++){
				for(int j=1; j<=N; j++){	
					System.out.print(TomatoPlate[i][j].day);
					System.out.print(' ');
				}
				System.out.println();
			}*/
			
			//���������� max���� ã�Ƽ� ���
			int max=-1;
			
			for(int k=1; k<=H; k++){
				for(int i=1; i<=M; i++){
					for(int j=1; j<=N; j++){
						
						if(max<TomatoPlate[i][j][k].day){
							max=TomatoPlate[i][j][k].day;
						}
						
					}
				}
			}
			if(max==Integer.MAX_VALUE)
				System.out.println(-1);
			else
				System.out.println(max);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		
		
	}

}
class Grid{
	
	public int day;
	public int x, y, z;
	
	public Grid(int state, int x, int y, int z){
		
		if(state==1){//���� �丶��
			day=0;
		}
		else if(state==0){//���� ���� �丶��
			day=Integer.MAX_VALUE;
		}
		else{//����ִ� ����
			day=-100;
		}
		
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Grid(int newday, int x, int y, int z, int ver){
		day=newday;
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
}
class Daycomparator implements Comparator<Grid>{

	@Override
	public int compare(Grid o1, Grid o2) {
		
		if(o1.day<o2.day)
			return -1;
		else if(o1.day==o2.day)
			return 0;
		else
			return 1;
		
	}
	
	
}