package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car{
	private String brand;
	private int model;
	private String color;
	private int price;
	public Car(String brand, int model, String color, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public int getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	
}

public class CarQuestion {

	public static void main(String[] args) {
	             Car c1=new Car("BMW",2022,"White",5000000);
	             Car c2=new Car("Toyoto",2023,"Black",400000);
	             Car c3=new Car("Maruti",2015,"Red",50000);
	             Car c4=new Car("Hyundai",2018,"Smoke White",200000);
	             Car c5=new Car("Mahindra",2021,"Grey",400000);
		         ArrayList<Car> al=new ArrayList<Car>();
		         al.add(c1);
		         al.add(c2);
		         al.add(c3);
		         al.add(c4);
		         al.add(c5);
		         Iterator<Car> i=al.iterator();
		         while(i.hasNext()) {
		        	 System.out.println(i.next());
		         }
		         System.out.println("==========================");
		         i=al.iterator();
		         while(i.hasNext()) {
		        	 Car c= i.next();
		        	 
		        	 if(c.getColor().equals("White")) {
		        		 System.out.println(c);
		        	 }
		         }
		         System.out.println("===========================");
		         i=al.iterator();
		         while(i.hasNext()) {
		        	 Car c= i.next();
		        	 if(c.getModel()>=2020 && c.getModel()<=2023)
		        		 System.out.println(c);
		         }
		         System.out.println("============================");
		       i=al.iterator();
		       while(i.hasNext()) {
		    	   Car c= i.next();
		    	   if(c.getPrice()>=5000000)
		    		   System.out.println(c);
		       }
		       System.out.println("==============================");
		       Object []o=al.toArray();
		       for(int j=0;j<o.length;j++) {
		    	   Car cc1=(Car)o[j];
		    	   for(int k=j+1;k<o.length;k++) {
		    		   Car cc2=(Car)o[k];
		    		   if(cc1.getModel()>cc2.getModel()) {
		    			   Object obj=o[j];
		    			   o[j]=o[k];
		    			   o[k]=obj;   
		    		   }
		    	   }
		       }
		       for(Object o1:o) {
		    	   System.out.println(o1);
		       }
		       System.out.println("====================================");
		       for(int j=0;j<al.size();j++) {
		    	   for(int k=j+1;k<al.size();k++) {
		    		   if(al.get(j).getModel()>al.get(k).getModel()) {
		    			  Car o2=al.get(j);
		    			  al.set(j,al.get(k));
		    			  al.set(k, o2);
		    		   }
		    	   }
		       }
		       i=al.iterator();
		       while(i.hasNext()) {
		    	   System.out.println(i.next());
		       }
		       
		       

	}

}
