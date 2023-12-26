package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Car3{
	String brand;
	int price;
	int model;
	public Car3(String brand, int price,int model) {
		super();
		this.brand = brand;
		this.price = price;
		this.model=model;
		
	}
	@Override
	public String toString() {
		return "Car3 [brand=" + brand + ", price=" + price+"," +"model="+model+","+ "]";
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
		Car3 other = (Car3) obj;
		return Objects.equals(brand, other.brand) && model == other.model && price == other.price;
	}
	
	
	
	
}

public class HashSetQuestion3 {

	public static void main(String[] args) 
	{
		HashSet<Car3>hs=new HashSet();
	
	      Car3 c1=new Car3("BMW",50000,2019);
	      Car3 c2=new Car3("Maruti",100000,2020);
	      Car3 c3=new Car3("BMW",50000,2020);
	      Car3 c4=new Car3("BMW",50000,2020);
          hs.add(c1);
          hs.add(c2);          
          hs.add(c3);
          Iterator i=hs.iterator();
          while(i.hasNext()) {
        	  System.out.println(i.next()+" ");
          }
        
	}
}
