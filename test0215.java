/*
 * ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��
����:
s = "leetcode"
���� 0.

s = "loveleetcode",
���� 2.


���������ַ��� s �� t������ֻ����Сд��ĸ��

�ַ��� t ���ַ��� s ������ţ�Ȼ�������λ�����һ����ĸ��

���ҳ��� t �б���ӵ���ĸ��

 ʾ��:
���룺
s = "abcd"
t = "abcde"
�����
e
���ͣ�
'e' ���Ǹ�����ӵ���ĸ��

*/
package lianxi0215;

public class test0215 {
	public static void main(String[] args) {
		Solution S= new Solution();
/*		String s ="loveleetcode";
		int a =S.firstUniqChar(s);
		System.out.println("�±�����Ϊ��"+a);*/
		String s =  "abcd";
		String t =  "abcde";
		char a = S.findTheDifference(s, t);
		System.out.println("��ӵ��ַ�Ϊ��" +a);
	
	}
}

/*class Solution {
    public int firstUniqChar(String s) {
    //���ַ���ת��Ϊ�ַ����飬�������ұȽϣ��ҳ�û�ظ���Ԫ��
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i =0; i<chars.length; i++)
        {
            for(int j = 0;j<chars.length ;j++)
            {
                if(i!=j)
                {
                    if (chars[i] == chars[j])
                    {
                        count = -1;
                        break;
                    }
                    else
                    {
                        count = i;
                    }
                }
            }
            if(count == i)
            {
                return count;
            }
        }
        if (s.equals("")) {
            return -1;
        }
        return count;
        }
}*/

class Solution {
    public char findTheDifference(String s, String t) {
    	//�����ַ�����������һ���ǵ����ģ������Ķ��ǳɶԵģ�
    	//�������ǿ��Խ������ַ���ת��Ϊ�ַ�����ʱ��Ȼ���ڽ������ַ������Ԫ����������յõ��ľ�����ӵģ�
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        char c =char2[0];
        for(int i=0;i<char1.length;i++)
        {
            c^=char1[i];
            c^=char2[i+1];
        }
        return c;
    }
}
