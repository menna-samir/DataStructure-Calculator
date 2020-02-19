
public class SimpleCalculator implements ICalculator{
	int x;
	int y;
	public int add(int x, int y) {
		System.out.println(x+"+"+y+"="+(x+y));
		return x+y;
	}
	public float divide(int x, int y) throws RuntimeException{
		if(y==0) {
			throw new RuntimeException("division by zero not allowed");
		}
		else if(x==0){
			return (float)0;
		}
		else {
			System.out.println(x+"/"+y+"="+((float)x/(float)y));
			return (float)x/(float)y;
		}
	}
}
