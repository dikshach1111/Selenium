import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testStream {
	
	

	 //@Test
	public void streamFilter()

	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("David");
		names.add("Adam");
		names.add("Alex");
		names.add("Sam");
		names.add("Smith");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	
		long d = Stream.of("David","Adam","Alex","Sam","Smith").filter(s->
		{
			return s.startsWith("S");
					
		}).count();
		
		System.out.println(d);
		
		//names.stream().filter(s->s.length()<5).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()<5).limit(1).forEach(s->System.out.println(s));

	}
		

		//@Test
		public void streamMap()
		{
			/*ArrayList<String> names = new ArrayList<String>();
			
			names.add("David");
			names.add("Adam");
			names.add("Alex");
			names.add("Sam");
			names.add("Smith");*/
			
			//names.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			Stream.of("David","Adam","Alex","Sam","Smith").filter(s->s.endsWith("m")).map(s->s.toUpperCase())
			.forEach(s->System.out.println("Upper case:"+s));
			
			List<String> names = Arrays.asList("David","Adam","Alex","Sam","Smith");
			names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println("lower case:"+s));
	
			
				}
		
		
		//@Test
		public static void Stream2()

		{

		//Stream.of("Madan","Mohan","Adam","Barbie","Chopra","Magan").filter(s->s.endsWith("n")).forEach(s->System.out.println(s));

			List<String> ls = Stream.of("Madan","Mohan","Adam","Barbie","Chopra","Magan").filter(s->s.endsWith("n")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			
			System.out.println(ls.get(0));

		}
		
		
		
		//@Test
		public static void concat() {
			ArrayList<String> fruits = new ArrayList<String>();
			
			fruits.add("Mango");
			fruits.add("Grapes");
			fruits.add("Watermelon");
			fruits.add("Orange");
			fruits.add("Apple");
			
			List<String >veggies = Arrays.asList("Potato","Carrot","Brocoli");
			
			Stream<String> ns = Stream.concat(fruits.stream(), veggies.stream());
			
			//ns.sorted().forEach(s->System.out.println(s));
			
			boolean flag = ns.anyMatch(s->s.equalsIgnoreCase("Mango1"));
			System.out.println(flag);
			Assert.assertTrue(flag);
		}

	
		@Test
		public static void Assignment() {
			List<Integer> list = Arrays.asList(3,5,6,8,3,2,6,8,9);
			list.stream().distinct().forEach(s->System.out.println("Unique:"+s));
			List<Integer> li = list.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println("3rd element:"+li.get(3));
			
		}

//Assignment
		//-array of integers
		//-print unique nos from list/array and sort array
}

