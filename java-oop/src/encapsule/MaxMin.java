package encapsule;

/**
 * @file_name : MaxMin.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 22.
 * @story : 최고점 최저점 구하기
 */
public class MaxMin {
	public String calc(int[] scores) {
		int min = 10000, max = 0, big = 0, small = 0;
		String result = null;
// My version
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] < min) {
				min = scores[i];
			}
		}
// 성한 version		
//		for (int i = 0; i < scores.length; i++) {
//			if (i==0) {
//				max = scores[i];
//				min = scores[i];
//			}else {
//				if(scores[i] > max){
//					max = scores[i];
//				}
//				if (scores[i] < min) {
//					min = scores[i];
//				}
//			}
//		}
//성한2 version
//		for (int i = 0; i < scores.length; i++) {
//			if(i!=4){
//				if (scores[i] > scores[i+1]) {
//					max = scores[i];
//					min = scores[i+1];
//				}
//				else {
//			
//				}
//			}
//		}
		result = "최고점 : " + max + ", 최저점 : " + min;
		return result;
	}
}

