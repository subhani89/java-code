package com.collections;
import java.util.*;

public class VectoR {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("subbu");
		v.add("subbu");
		v.add("sub");
		v.add("su");
		v.add(0,"s");//if you mention index then it will stored in that particular index
		System.out.println(v.size());
		
		System.out.println(v.capacity());
		
		System.out.println(v);
		
		//the difference between vector and array list is vector is 100% increse its capacity
		//when the data memory is filled with maximum
		//and the array list are incresed their capacity with 50%
		//vector will not allow multi thread
		//so that array list performance is better than vector
		//because array list allow multi threading conceot
		
		Vector v1=new Vector();

		v1.add("kefm");
		v1.add("kefm");
		v1.add("kefm");
		
		//to add v1 data into v then use addall method
		v.addAll(v1);
		System.out.println(v);
		
		//we can get data from specific index
		System.out.println(v.get(3));
		System.out.println(v.remove(2));
		System.out.println(v);
		v1.clear(); //to clear entire collection
		System.out.println(v.contains("s"));
		//to check the specific element in the collection
		System.out.println(v.contains(v1));
		 
		System.out.println(v.set(0,"hello"));//replace the value in specific index
		System.out.println(v);
		System.out.println(v.indexOf("hello"));
		System.out.println(v.lastIndexOf("subbu"));//when we have duplicate elements
		
		//to print the data in array format
		Object[] arr=v.toArray();
		System.out.println(Arrays.toString(arr));
		
		//we can convert array data to list
//		Object[] ar=new Object[] {1,2,3,4,5};
//		Vector v2=new vector(Arrays.asList(ar));
//		System.out.println(v2);

	}

}
