package coreJava;

public class InterviewMaxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{2,4,5},{3,0,7},{1,2,9}};
		int max = abc[0][0];
		
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<abc[i].length; j++) {
				if(max < abc[i][j]) {
					max = abc[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
