package telran.fibonacci.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
	private int index = 0;
	private int curr = 1;
	private int next = 0;
	private int quantity;

	public FibonacciIterator(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean hasNext() {

		return index < quantity;
	}

	@Override
	public Integer next() {
		if (quantity <1) {
			throw new NoSuchElementException();
		}
		int res = next + curr;
		curr = next;
		next = res;
		index++;

		return res;
	}

}
