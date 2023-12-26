package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

class Car4 implements Comparable<Car4>{
	String brand;
	int price;
	int model;
	public Car4(String brand, int price, int model) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	@Override 
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", model=" + model + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car4 other = (Car4) obj;
		return Objects.equals(brand, other.brand) && model == other.model && price == other.price;
	}
	@Override
	public int compareTo(Car4 o) {
	        return this.price-o.price;
	
	}	
}

public class HashSetQuestion4 {

	public static void main(String[] args) 
	{
	 Car4 c1=new Car4("Hyundai",3500,2021);
	 Car4 c2=new Car4("Maruti",300,2020);
	 Car4 c3=new Car4("Tata",25000,2013);
	 Car4 c4=new Car4("BMW",4000,2018);
	 Car4 c5=new Car4("Toyota",20,2013);
	 HashSet<Car4> hs=new HashSet<Car4>();
	 hs.add(c1);
	 hs.add(c2);
	 hs.add(c3);
	 hs.add(c4);
	 hs.add(c5);
	 
	 LinkedList<Car4> li=new LinkedList<Car4>(hs);
	 
	
	 for(Car4 i:li) {
		 System.out.println(i);
	 }
	 Collections.sort(li);
	 System.out.println("======================================");
	 for(Car4 i:li) {
		 System.out.println(i);
	 }
     
	}

}
