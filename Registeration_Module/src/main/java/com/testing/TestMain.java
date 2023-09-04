package com.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {

	
	public static void main(String[] args) {
		List<Order> list=new ArrayList<>();
		Order od=new Order("Mobile", "10000", "21/07/23", "Shipped");
		Order od1=new Order("Laptop", "100000", "22/07/23", "Packed");
		Order od2=new Order("Mobile", "10000", "21/07/23", "Shipped");
		Order od3=new Order("Laptop", "30000", "22/07/23", "Dileverd");
		Order od4=new Order("Mobile", "10000", "20/07/23", "Shipped");
		Order od5=new Order("Toy", "10000", "21/07/23", "Shipped");
		Order od6=new Order("Mobile", "10000", "21/07/23", "Shipped");
		Order od7=new Order("Fridge", "90000", "21/07/23", "Created");
		Order od8=new Order("Mobile", "10000", "21/07/23", "Created");
	
		list.add(od);
		list.add(od1);
		list.add(od2);
		list.add(od3);
		list.add(od4);
		list.add(od5);
		list.add(od6);
		list.add(od7);
		list.add(od8);
//		
// Object list1 = list.parallelStream().collect(Collectors.groupingBy(x->x.getStatus()));
//		System.out.print(list);
	    Map<String, Map<String, Long>> statusCountByDate = list.stream()
                .collect(Collectors.groupingBy(Order::getCreateDate,
                        Collectors.groupingBy(Order::getStatus, Collectors.counting())));
	    statusCountByDate.forEach((a,b)->System.out.println(a+""+b));
//		   Map<Object, List<Order>> createDate = list.stream().collect(Collectors.groupingBy(x->x.getCreateDate()));
//		//	createDate.forEach((a,b)->System.out.println(a+""+b));
//			 createDate.keySet().forEach(x->{ 
//			 List<Order> list2 = createDate.get(x);
//			Map<Object, Long> statusCount = list2.parallelStream().collect(Collectors.groupingBy(y->y.getStatus(),
//					Collectors.counting()));
		//	createDate.forEach((a,b)->System.out.println(a+""+b));
			//statusCount.forEach((a,b)->System.out.println(a+""+b));
		
			
			  //});
		
		
		
		
		
		
	}
}
