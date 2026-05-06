package Ch04;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;



public class C04Ex {

	public static void main(String[] args) {
		//1) 1 ~ 45 까지숫자를 6개를 랜덤으로 받아(Random클래스를이용) set에 저장 / 출력
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		while(set.size()<6) {
			set.add(rnd.nextInt(45)+1);
		}
		for(Integer el : set) {
			System.out.println(el + " ");
		}
		System.out.println("-----------");	
		
		
		//2) [추가] 저장된 set의 오름차순정렬을 해보세요(검색을 통해서 해결해봅니다 - 스트림함수사용 )
		//2-1)
//		List<Integer> list = new ArrayList(set);
//		Collections.sort(list);
//		list.forEach(System.out::println);
//		for(int num : list)
//			System.out.print(num+" ");
		
		//2-2)
		List<Integer> li = set.stream().sorted().collect(Collectors.toList());
		li.forEach(System.out::println);
//		for(Integer el : li)	
//			System.out.print(el + " ");
//		System.out.println("\n-----------");

	}

}
