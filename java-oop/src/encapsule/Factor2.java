package encapsule;

/**
 * @file_name : Factor.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 22.
 * @story : 약수 알고리즘
 */
public class Factor2 {
	public String factorCalc(int dest) {
		String result = "";
		for (int i = 1; i <= dest; i++) {
			if (dest % i == 0) {
				result = result.concat(i + " ");
			}
		}
		return result;
	}
//
//	public String getName() {
//		String foo = "";
//		return foo;
//	}
//	public String ggetName() {
//		String	name = "";
//		return name;
//	}
}
