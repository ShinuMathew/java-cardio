package arrayprogs;

public class MultiDArrays {

	public static void main(String[] args) {
		int stdmark[][] = {{1,0,1,1,1}, {1,1,0,0,0}, {0,0,1,1,0}, {0,1,1,1,0}};
		int cachearr[][] = stdmark;
		
		//Print matrix
		System.out.println("*********** THE 2D MATRIX ***********");
		for(int i=0; i<stdmark.length; i++) {
			System.out.print("|");
			for(int j=0; j<stdmark[i].length; j++) {
				System.out.print(" "+stdmark[i][j]+" ");
			}
			System.out.print("|");
			System.out.println("");
		}
		System.out.println("**************************************");
		
		int mtrxSize = 1;
		for(int i=0; i<stdmark.length; i++) {
			for(int j=0; j<stdmark[i].length-1; j++) {
				if(stdmark[i][j]==1) {
					
				}
			}
		}
		
	}
	
	
}
