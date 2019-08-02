package firstUniqueCharacter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 把字符放进一个map里，index放进map=>value里。
 * 如果有重复的字符，就把map的索引值加1
 * 最后map索引值等于1的就是我们要找的唯一字符
 * @author Administrator
 *
 */
public class FirstUniqueCharacterDemo {
	public int firstUniqueCharacter(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}
		System.out.println("原字符串:"+ s);
		Map<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();
		for(int i=0; i<s.length(); i++){

			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), new ArrayList<Integer>());
			}

			map.get(s.charAt(i)).add(i);
		}

		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for (Map.Entry<Character, ArrayList<Integer>> entry : map.entrySet()){
			if(entry.getValue().size()==1){
				indexes.addAll (entry.getValue());
			}
		}
		Collections.sort(indexes);
		return  indexes.get(0);
		//return -1;
	}
}
