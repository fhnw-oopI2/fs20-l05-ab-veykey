package ab1;

/**
 * Die Klasse Tuple verpackt zwei Werte. Sie ist also ein einfacher Datentyp
 * (ein Tupel). Die Daten sind immutable.
 *
 */
public class Tuple<T extends Number> {

	public final T t1;
	public final T t2;

	public static final Tuple<Integer> SEED = new Tuple<Integer>(0, 1);

	/**
	 * Erzeugt ein neues Tupel.
	 * 
	 * @param t1
	 * @param t2
	 */
	public Tuple(T t1, T t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public String toString() {
		return String.valueOf(t2);
	}

	public Tuple next() {
		return new Tuple<T>(t2, add(t1, t2));
	}

	public static <T extends Number> T add(T x, T y) {
		Integer sum;
		sum = x.intValue() + y.intValue();
		return (T) sum;
	}
}
