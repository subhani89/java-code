package com.Streams;
import java.util.*;

class Students{
	int roll;
	String name;
	int marks;
	public Students(int roll,String name,int marks) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
}

public class FlatMapOnObjects {

	public static void main(String[] args) {
		//combining the multiple list with using object creation
		List<Students> SectionA=new ArrayList<>();
		SectionA.add(new Students(1,"subhani",100));
		SectionA.add(new Students(2,"subbu",99));
		SectionA.add(new Students(3,"shaa",98));
		
		List<Students> SectionB=new ArrayList<>();
		SectionB.add(new Students(4,"rabiya",97));
		SectionB.add(new Students(5,"rahima",96));
		SectionB.add(new Students(6,"alone",95));
		
		List<Students> SectionC=new ArrayList<>();
		SectionC.add(new Students(7,"ayub",94));
		SectionC.add(new Students(8,"babu",93));
		SectionC.add(new Students(9,"shareef",92));
		
		List<List<Students>> Class=Arrays.asList(SectionA,SectionB,SectionC);
		System.out.println(Class);
		Class.stream().flatMap(n->n.stream()).filter(n->n.marks<95).map(s->s.roll+"->"+s.name+"->"+s.marks).forEach(s->System.out.println(s));
         //this the way to combine the collections and filter the data using flash map
	}

}
