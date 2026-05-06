package Ch04;

import java.util.HashMap;
import java.util.Map;

public class C06MapMain {

	public static void main(String[] args) {
		
		Map<String,Integer> map =  new HashMap();
		
		//추가
		map.put("aaa",1111);
		map.put("aaa",2222);
		map.put("aaa",3333);
		map.put("aaa",4444);		//
		
		//확인
		for(String key : map.keySet()) //["aaa","bbb","ccc","ddd"]
			System.out.println("KEY : " + key + " VALUE : " + map.get(key));

	}

}
