package Java;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str= new ArrayList<String>();
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add("sat");
		str.add("sun");
		System.out.println(str.get(5));
		System.out.println("--------------");
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		System.out.println("--------------------------");
		for(String each:str)
		{
			System.out.println("each");
		}

	}

}
