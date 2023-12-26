package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


class Car1{
	String brand;
	String color;
	int price;
	int model;
	public Car1(String brand, String color, int price, int model) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	public String toString() {
		String s="["+brand+","+color+","+price+","+model+"]";
		return s;
	}
	public int getPrice() {

		return price;
	}
}

class SortAccordingToModel implements Comparator<Car1>{
	public int compare(Car1 l1,Car1 l2) {
		return (int)(l2.getPrice()-l1.getPrice());
	}
	
}

public class LinkedList3 {

	private static final Comparator Car1 = null;

	public static void main(String[] args) {
		Car1 c1=new Car1("BMW","Black",6000000,2021);
		Car1 c2=new Car1("Maruti","White",30000,2015);
		Car1 c3=new Car1("Hyundai","Red",400000,2019);
		Car1 c4=new Car1("Tata","Yellow",45000,2017);
		Car1 c5=new Car1("Mahindra","Grey",500000,2022);
		LinkedList<Car1> l1=new LinkedList<>();
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		l1.add(c4);
		l1.add(c5);
		System.out.println(l1);
		System.out.println("=============================");
		Object o[]=l1.toArray();
		for(int i=0;i<o.length;i++) {
			Car1 c6=(Car1)o[i];
			for(int j=i+1;j<o.length;j++) {
				Car1 c7=(Car1)o[j];
				if(c7.getPrice()<c6.getPrice()) {
					Object c8=o[i];
					o[i]=o[j];
					o[j]=c8;
				}
			}
		}
		Iterator<Car1> k=l1.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		
		System.out.println("=============================");
		for(int i=0;i<o.length;i++) {
			for(int j=i+1;j<o.length;j++) {
				if(l1.get(j).price<l1.get(i).price) {
					Car1 o1=l1.get(j);
					l1.set(j, l1.get(i));
					l1.set(i, o1);
				}
			}
		}
		k=l1.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		Collections.sort(l1,new SortAccordingToModel());
		System.out.println("===========================");
		k=l1.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
	}

}
