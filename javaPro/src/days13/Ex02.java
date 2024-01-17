package days13;

/**
 * @author user
 * @date 2024. 1. 17. 오후 3:27:09
 * @subject
 * @contents
 */
public class Ex02 {
	public static void main(String[] args) {
		int m[][] = new int[5][5];
		//fillM2(m);
		fillM3(m);
		dispM(m);
	}

	private static void fillM3(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j]=(j+1)*5-i;
			}
		}
		
	}

	private static void fillM2(int[][] m) {
		for (int i = 0; i < m.length; i++) { // m.length 행 갯수
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j]=5*i+j+1;
			}
		}
	}
	/*[3]
	 * private static void fillM2(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j]= 26-(5*i+j+1);
			}
		}

	}*/

	/* [2]
	 * private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // m.length 행 갯수
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=5*i+j+1;
			}

		}
	}*/
	/*
	 * [1]
	 * private static void fillM(int[][] m) {
		for (int i = 0, value =1; i < m.length; i++) { // m.length 행 갯수
			for (int j = 0; j < m[i].length; j++,value++) {
				m[i][j]=value;
			}

		}
	}*/

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // m.length 행 갯수
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}
	}

}
