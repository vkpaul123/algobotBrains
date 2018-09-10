public class Matrix {
	Cell cellMat[][] = new Cell[8][8];

	public Matrix() {
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				this.cellMat[i][j] = new Cell();
			}
		}
	}

	public void displayMatrix() {
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				System.out.println("\n" + i + "," + j);
				this.cellMat[i][j].displayAllCellParams();
			}
		}
	}

	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.displayMatrix();
	}	
}