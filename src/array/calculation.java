package array;

public class calculation {
	public static void main(String[] args) {
		int mat1[][]= {{1,23,23},{23,235,565},{32,56,89}};
		int mat2[][]= {{13,243,243},{253,235,565},{352,565,89}};
		int mat3[][]=new int[3][3];
		
		//addition
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				mat3[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(mat3[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
