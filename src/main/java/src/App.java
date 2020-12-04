package src;
import java.util.Vector;

public class App {
	
	public static Vector unionSet(Vector a, Vector b) {
		Vector res = a;
		res.addAll(b);
		
		return res;
	}
}
