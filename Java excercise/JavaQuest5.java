public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "coding bootcamp.";
    char target = 'c';
    int index = -1; // Initialize index to -1 to indicate "not found"

    for (int i = 0; i < str.length(); i++) {// Loop through each character in the string
      if (str.charAt(i) == target) { // Check if the current character is equal to 'c'
        index = i; // Update index to the current position if 'c' is found
      }//Initially, index is -1. So first iteration, i=0, character is 'c', so index becomes 0. Then print "i=0, index=0".Next, i=1: character is 'o' → not 'c', so index remains 0. Print "i=1, index=0".
      System.out.println("The i is " + i + " and The index is " + index); // Print current i and value of index
    }

    for (int i = 0; i < str.length(); i++) {// Loop through each character in the string
      if (str.charAt(i) == target) { // Check if the current character is equal to 'c'
        index = i; // Update index to the current position if 'c' is found
      }//Initially, index is -1. So first iteration, i=0, character is 'c', so index becomes 0. Then print "i=0, index=0".Next, i=1: character is 'o' → not 'c', so index remains 0. Print "i=1, index=0".
      
    }
    System.out.println("The index of the last character of c is " +index); // Print curren or last value of index

    //! Approach 1: 
    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...

    //String str = "coding bootcamp.";
    char targetO = 'o';
    int indexO = -1; // Initialize index to -1 to indicate "not found"

    for (int i = 0; i < str.length(); i++) {// Loop through each character in the string
      if (str.charAt(i) == targetO) { // Check if the current character is equal to 'o'
        indexO = i; // Update index to the current position if 'o' is found
        System.out.println("Found. The i is "+i+". The indexO of the last character of o is " +indexO); // Print curren or last value of index
      }else{
        System.out.println("Not Found. The i is "+i +" The indexO is "+indexO); 
      }
    }
    
    //! Approach 2: 
    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    
    //String str = "coding bootcamp.";
    char targetChar = 'o';
    //int index = -1;

    for(int i = 0; i<str.length(); i++){
      if(str.charAt(i)==targetChar){
      index=i;
     
      }
    }
    if(index != -1) {
      System.out.println("Final result:");
      System.out.println("Found. The last character '" + str.charAt(index) + "' was found at index " + index);
  } else {
      System.out.println("Not Found. The character '" + targetChar + "' was not found in the string.");
  }




  }
}
