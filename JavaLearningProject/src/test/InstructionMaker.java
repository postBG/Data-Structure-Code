package test;

public class InstructionMaker {

	public static void main(String[] args) {
		
		String input, Instruction, Genre, Movie, TargetName;
		input="DELETE %ACTION%  %BA%";
		Instruction=null;
		Genre=null;
		Movie=null;
		TargetName=null;
		getInstruction(input, Instruction, Genre, Movie, TargetName);
		
	}
	
	private static void getInstruction(String input, String Instruction, String Genre, String Movie, String TargetName){
		//input에서 Instruction을 알아내는 함수
		if(input.charAt(0)=='I'){
			//Insert인 경우
			Instruction=input.substring(0, 6);
			
			int[] index=new int[4];
			int cnt=0;
			for(int i=0; i<input.length(); i++){
				if(input.charAt(i)=='%'){
					index[cnt]=i;
					cnt++;
				}
			}
			
			Genre=input.substring(index[0]+1, index[1]);
			Movie=input.substring(index[2]+1, index[3]);
			
			System.out.println(input);
			System.out.println(Instruction);
			System.out.println(Genre);
			System.out.println(Movie);
		}
		else if(input.charAt(0)=='S'){
			//Search인 경우
			Instruction=input.substring(0, 6);
			
			int[] index=new int[2];
			int cnt=0;
			for(int i=0; i<input.length(); i++){
				if(input.charAt(i)=='%'){
					index[cnt]=i;
					cnt++;
				}
			}
			
			TargetName=input.substring(index[0]+1, index[1]);
			
			System.out.println(input);
			System.out.println(Instruction);
			System.out.println(TargetName);
		}
		else if(input.charAt(0)=='D'){
			//Delete인 경우
			Instruction=input.substring(0, 6);
			
			int[] index=new int[4];
			int cnt=0;
			for(int i=0; i<input.length(); i++){
				if(input.charAt(i)=='%'){
					index[cnt]=i;
					cnt++;
				}
			}
			
			Genre=input.substring(index[0]+1, index[1]);
			Movie=input.substring(index[2]+1, index[3]);
			
			System.out.println(input);
			System.out.println(Instruction);
			System.out.println(Genre);
			System.out.println(Movie);
		}
		else{
			//error
			
		}
	}
}
