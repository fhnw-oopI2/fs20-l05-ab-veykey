package ab1;

import java.util.stream.Stream;

public class FibonacciTest {

	public static void main(String[] args) {
		// Stream.iterate(0, n -> n + 1).limit(30).forEach(n -> System.out.println(n));;

		Stream.iterate(Tuple.SEED, Tuple::next).limit(10).forEach(n -> System.out.println(n));

	}
}
