public class Cell {
	boolean state;
	boolean visitedNode;
	double bWeight;

	public Cell() {
		this.state = true;
		this.visitedNode = false;
		this.bWeight = 0;
	}

	public boolean getState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public boolean getVisitedNode() {
		return this.visitedNode;
	}

	public void setVisitedNode(boolean visitedNode) {
		this.visitedNode = visitedNode;
	}

	public double getBWeight() {
		return this.bWeight;
	}

	public void setBWeight(double bWeight) {
		this.bWeight = bWeight;
	}

	public void displayAllCellParams() {
		System.out.println("state = " + this.getState());
		System.out.println("visitedNode = " + this.getVisitedNode());
		System.out.println("bWeight = " + this.getBWeight());
	}

	public static void main(String[] args) {
		Cell cell = new Cell();
		System.out.println("state = " + cell.getState());
		System.out.println("visitedNode = " + cell.getVisitedNode());
		System.out.println("bWeight = " + cell.getBWeight());
	}
}