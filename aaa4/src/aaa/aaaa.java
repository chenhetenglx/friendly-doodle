package aaa;

/**
 * �ж��ַ����Ƿ�Ϊ����
 * 
 * 
 * @author Administrator
 *
 */
public class aaaa {
	public static boolean isChinese(char c) {
		return c >= 0x4E00 && c <= 0x9FA5;// �����ֽ����ж�
	}

	public static boolean isChinese(String str) {
		if (str == null)
			return false;
		for (char c : str.toCharArray()) {
			if (isChinese(c))
				return true;// ��һ�������ַ��ͷ���
		}
		return false; 
	}

	public static void main(String[] args) {
		boolean aaa = aaaa.isChinese("ssa��adsd");
		System.err.println(aaa);
	}
}