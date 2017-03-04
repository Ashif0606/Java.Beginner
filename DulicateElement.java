package practicejava;

import java.util.HashSet;

public class DulicateElement {

	public DulicateElement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String [] strArray = {"a","2","a","2"};
		for(int i= 0;i<strArray.length-1;i++ ){
			if(strArray[i].equals(strArray[i+1])){
				System.out.println("The duplicate number is" +strArray[i+1]);}
			else{
				System.out.println("no duplicate" +strArray[i]);
			}
			}	
//		//using brute force method
//		//the for loop will go over all the elements in the array list
//		for(int i= 0;i<strArray.length-1;i++ ){  
//			//this will go to the next element from the first loop. 
//			for(int j =i+1;j<strArray.length;j++){
//				if(strArray[i].equals(strArray[j])){
//				  System.out.println("The duplicate number is" +strArray[j]);
//				}
//			}
//		}
	
//	//using HasHset
//	HashSet<String> x = new HashSet<String>();
//	for(String i :strArray){
//		if(!x.add(i)){
//			System.out.println("The duplicate element is"+i);
//		}
//	  
//	  }
	 
		
   
 }
}
