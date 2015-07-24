package com.tusehgntkeji.quiz02;
/**
 * what to say 
 * very practical methods.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {
	public static void main(String args[]){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("d", 2);
		map.put("c", 1);
		map.put("b", 1);
		map.put("a", 3);

		/**
		 * 映射项（键-值对）。Map.entrySet 方法返回映射的 collection 视图，
		 * 其中的元素属于此类。获得映射项引用的唯一 方法是通过此 collection 
		 * 视图的迭代器来实现。这些 Map.Entry 对象仅 在迭代期间有效；更确切地讲，
		 * 如果在迭代器返回项之后修改了底层映射，则某些映射项的行为是不确定的，
		 * 除了通过 setValue 在映射项上执行操作之外。
		 */
		List<Map.Entry<String, Integer>> infoIds =
		    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		
		//排序前
		for (int i = 0; i < infoIds.size(); i++) {
		    String id = infoIds.get(i).toString();
		    System.out.print(id+"\t");
		}
		System.out.println();
		System.out.println("************");
		
		//排序
		/**
		 * 根据指定比较器产生的顺序对指定列表进行排序。
		 * 此列表内的所有元素都必须可使用指定比较器相互比较
		 *（也就是说，对于列表中的任意 e1 和 e2 元素，c.compare(e1, e2) 
		 * 不得抛出 ClassCastException）。此排序被保证是稳定的：
		 * 不会因调用 sort 而对相等的元素进行重新排序。
		 * 
		 * 强行对某个对象 collection 进行整体排序 的比较函数。
		 * 可以将 Comparator 传递给 sort 方法（如 Collections.sort
		 * 或 Arrays.sort），从而允许在排序顺序上实现精确控制。还可以
		 * 使用 Comparator 来控制某些数据结构（如有序 set或有序映射）
		 * 的顺序，或者为那些没有自然顺序的对象 collection 提供排序。
		 */
		Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {   
		    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {      
		        return (o2.getValue() - o1.getValue()); 
		        //return (o1.getKey()).toString().compareTo(o2.getKey());
		    }
		}); 

		//排序后
		for (int i = 0; i < infoIds.size(); i++) {
		    String id = infoIds.get(i).toString();
		    System.out.print(id+"\t");
		}
		//根据key排序a 3//b 1//c 1//d 2
		//根据value排序//a 3//d 2//b 1//c 1
		//根据value的值从大到小进行排序。
		//由这句话进行控制o2.getValue() - o1.getValue()
	}
}
