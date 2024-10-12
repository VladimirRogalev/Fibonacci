package telran.fibonacci;

import java.util.Iterator;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci(8);
		Iterator<Integer> iterator = fibonacci.iterator();
		int sum = 0;
		
		while( iterator.hasNext()) {
			int num = iterator.next();
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println("\n" + sum);
		iterator.next();
		
//		for(Integer num : fibonacci) {
//			sum += num;
//			System.out.print(num + " ");
//		}
//		
//		System.out.println("\n" + sum);

		// TODO print all numbers, and reduce sum
		// 1,1,2,3,5,8,13,21
		// sum = 54

	}

}
