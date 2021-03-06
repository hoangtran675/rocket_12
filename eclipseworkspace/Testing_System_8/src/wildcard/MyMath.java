package wildcard;

public class MyMath<N extends Number> { // N ke thua kieu so
	public <T extends Comparable<T>> T max(T a, T b) {
		if (a.compareTo(b) > 0)
			return a;
		else if (a.compareTo(b) < 0)
			return b;
		else
			return a;
	}

	public N sum(N...numbers) {
		Double result = 0d; // khai bao sum kieu Double thi khi return co the ep kieu thanh N 
		// khong the ep kieu tu Primitive ve Generic N
		// ep kieu object ve object
		for (N n : numbers) {
			result = result + n.doubleValue();
		}
		return (N) result;
	}
	public N minus(N a, N b){
		Double result = 0d;
		result = a.doubleValue() - b.doubleValue();
		return (N)result;
	}
	public N pow(N d, int b){
		Double result = 1d;
		for(int i = 0; i < b; i++){
			result = result * d.doubleValue();
		}
		return (N)result;
	}
}
