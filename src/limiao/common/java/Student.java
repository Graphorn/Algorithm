package limiao.common.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class Student {
	String name;
	String eage;

	public Student(String name, String age) {
		this.name = name;
		this.eage = age;
	}
	public static void main(String[] args) {
		Map<Student, Double> map =  new HashMap<Student, Double>();
		map.put(new Student("T","t"), 1.1);
		map.put(new Student("T", "t"), 1.2);
		System.out.println(map.get(new Student("T", "t")));
		System.out.println(map.size());
		for(Student student : map.keySet()) {
			System.out.println(student.hashCode());
		}
	}
	@Override
	public int hashCode() {
		System.out.println("hash");
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equal");
		return true;
	}
	
	
}
