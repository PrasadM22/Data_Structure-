package DS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Hash_Table {
	 static LinkedList<String> list = new LinkedList<String>();

	public static void main(String[] args) {
		
	System.out.println("Welcome Hash Table Data Structure");
	
	String str = "Paranoids are not paranoid because they "
			+ "are paranoid but because they keep putting "
			+ "themselves deliberately into paranoid avoidable situations";
	String arr[]=str.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		list.add(arr[i]);
	}
	Count_word(list);
	}
	 
	public static void Count_word(LinkedList<String> list)
	    {
	 	        Map<String, Integer> hm = new HashMap<String, Integer>();
	  
	        for (String i : list) 
	        {
	            Integer j = hm.get(i);
	            hm.put(i, (j == null) ? 1 : j + 1);
	        }

	        for (Map.Entry<String, Integer> val : hm.entrySet()) {
	            System.out.println("Key " + val.getKey() + " "+": " + val.getValue());
	        }
	    }
}

