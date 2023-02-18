package example;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Dictionary;


public class main {
    
 
  public static void main(String args[]) {
  
	  Dictionary data = new Hashtable();
	  data.put("10", "A");
	  data.put("0111", "B");
	  data.put("0101", "C");
	  data.put("011", "D");
	  data.put("1", "E");
	  data.put("1101", "F");
	  data.put("001", "G");
	  data.put("1111", "H");
	  data.put("11", "I");
	  data.put("1000", "J");
	  data.put("010", "K");
	  data.put("1011", "L");
	  data.put("00", "M");
	  data.put("01", "N");
	  data.put("000", "O");
	  data.put("1001", "P");
	  data.put("0010", "Q");
	  data.put("101", "R");
	  data.put("111", "S");
	  data.put("0", "T");
	  data.put("110", "U");
	  data.put("1110", "V");
	  data.put("100", "W");
	  data.put("0110", "X");
	  data.put("0100", "Y");
	  data.put("0011", "Z");
	  
	  data.put("10000", "1");
	  data.put("11000", "2");
	  data.put("11100", "3");
	  data.put("11110", "4");
	  data.put("11111", "5");
	  data.put("01111", "6");
	  data.put("00111", "7");
	  data.put("00011", "8");
	  data.put("00001", "9");
	  data.put("00000", "0");
	  data.put("*", " ");

	  
	 String str = "1111 1 1011 1011 000  100 000 101 1011 011";

	 String temp = "";
	 
	 char[] ch = str.toCharArray();
	 List<Character> charList = new ArrayList<>();
	 
	 for(int i = 0; i < ch.length; i++) {
		 charList.add(ch[i]);
	 }

	 for(int i = 0; i < charList.size()-1; i++) {
		 if(ch[i] == ' ' && ch[i+1] == ' ') {
			 charList.add(i+1, '*');
		 }
	 }
	 String newStr = "";

	 for(int i = 0; i < charList.size(); i++) {
		 newStr+=charList.get(i);
	 }
	 
	 Scanner n = new Scanner(newStr);
	 
	 while(n.hasNext()) {
		 
		 String a = n.next();
		 temp+=data.get(a);
		 
	 }
	 
	 System.out.print(temp);
	 
  }
}
