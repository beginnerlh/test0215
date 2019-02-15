/*
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
案例:
s = "leetcode"
返回 0.

s = "loveleetcode",
返回 2.


给定两个字符串 s 和 t，它们只包含小写字母。

字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

请找出在 t 中被添加的字母。

 示例:
输入：
s = "abcd"
t = "abcde"
输出：
e
解释：
'e' 是那个被添加的字母。

*/
package lianxi0215;

public class test0215 {
	public static void main(String[] args) {
		Solution S= new Solution();
/*		String s ="loveleetcode";
		int a =S.firstUniqChar(s);
		System.out.println("下标索引为："+a);*/
		String s =  "abcd";
		String t =  "abcde";
		char a = S.findTheDifference(s, t);
		System.out.println("添加的字符为：" +a);
	
	}
}

/*class Solution {
    public int firstUniqChar(String s) {
    //将字符串转化为字符数组，遍历查找比较，找出没重复的元素
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
    	//两个字符串合起来有一个是单独的，其他的都是成对的，
    	//所以我们可以将两个字符串转换为字符数组时，然后在将两个字符数组的元素相异或，最终得到的就是添加的，
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
