package aaa;
/**
 * 判断字符串是否为中文
 * 
 * 
 * @author Administrator
 *
 */
public class aaaa2 {

	public static boolean aaa(String str) {
		if (str != null&&str!="") {
			for (int i = 0; i < str.length(); i++) {
				boolean matches = str.substring(i, i + 1).matches("[\\u4e00-\\u9fa5]+");
				if (matches == false) {
					return false;
				}

			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean aaa = aaaa2.aaa("是的撒大所");
		System.err.println(aaa);
	}
}