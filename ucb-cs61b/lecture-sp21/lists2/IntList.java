public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

	/** if 2 numbers in a row are the same,
	 * we add them together and make one large node **/
	public void addAdjacent(){
		IntList p = this;
		while (p != null && p.rest != null){
			if (p.first == p.rest.first) {
				p.first *= 2;
				p.rest = p.rest.rest;
			}
			p = p.rest;
		}
	}

	public void squareInt(int x){
		IntList p = this;
		while (p != null){
			p.rest = new IntList(p.first * p.first, p.rest);
			if (p.rest.rest == null) {
				p.rest = new IntList(x, null);
			}
			p = p.rest.rest;

		}
	}

	public static void main(String[] args) {
		IntList L = new IntList(2, null);
		L = new IntList(1, L);
//		L = new IntList(1, L);
//		L.addAdjacent();
		L.squareInt(5);

//		System.out.println(L.get(100));
	}
} 