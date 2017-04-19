package 源码阅读;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.Executor;*/

//集合框架源码阅读
public class SourceCodeReading {
	transient int modCount;
	public static void main(String[] args) {
		/*Hashtable ht = new Hashtable();
		HashMap<String, String> m = new HashMap<String, String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList ff = new LinkedList();
		Set<Person> set = new HashSet<Person>();
		LinkedHashSet lhs = new LinkedHashSet();
		LinkedHashMap lhm = new LinkedHashMap();
		TreeMap tm = new TreeMap();*/
		
		//String s1 = "abc";
		//String s2 = "abc";
		//System.out.println(s1 == s2);
		/*TreeSet<String> ts = new TreeSet<String>();
		
		
		Person p = new Person(1,"ff");
		Person p1 = new Person(1,"ff");
		set.add(p);
		set.add(p1);
		//System.out.println(set.size());
		Object object = new Object();
		
		ts.add("b");
		ts.add("a");
		ts.add("e");
		System.out.println(ts);
		for(String item : ts){
			System.out.println(item);
		}*/
		/*Vector v = new Vector();
		LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>();
		hm.put("a", "a");
		hm.put("b", "b");
		hm.put("c", "c");
		hm.put("d", "d");
		//hm.put(null, "null");
		for(String key : hm.keySet()){
			System.out.println(hm.get(key));
		}
		*/
		/*ArrayList<Integer> list = new ArrayList<Integer>(1);
		list.add(1);
		//list.add(2);
		list.trimToSize();
		System.out.println(list.size());*/
		
		/*HashMap hm = new HashMap();
		hm.put(null, "ff");
		hm.put(1, 2);
		for(Object key : hm.keySet()){
			System.out.println(hm.get(key));
		}*/
		
		//Collections.synchronizedCollection(c)
		
		/*Gabage g = new Gabage();
		g = null ;
		System.gc();*/
	}
}

class Gabage{
	public volatile Integer a = 0 ;
	
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("垃圾回收执行finalise()");
	}
	
}

class A implements Cloneable{
	final int a = 0;
}

class Person {
	int age ;
	String name ;
	public Person(int age, String name){
		this.age = age ;
		this.name = name ;
	}
	public boolean equals(Object obj){
		Person p = (Person)obj;
		if( p.age == age && p.name.equals(name))
			return true;
		else
			return false;
	}
	public int hashCode(){
		return age;
	}
}