package aaa;

/**
 * 判断字符串是否为中文
 * 
 * 
 * @author Administrator
 *
 */
public class aaaa {
	public static boolean isChinese(char c) {
		return c >= 0x4E00 && c <= 0x9FA5;// 根据字节码判断
	}

	public static boolean isChinese(String str) {
		if (str == null)
			return false;
		for (char c : str.toCharArray()) {
			if (isChinese(c))
				return true;// 有一个中文字符就返回
		}
		return false; 
	}

	public static void main(String[] args) {
		boolean aaa = aaaa.isChinese("ssa是adsd");
		System.err.println(aaa);
	}
}