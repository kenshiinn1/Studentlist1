
package student;

import java.util.Scanner;


public class ReverseWord {
    
    public static void main (String[] args) {
        char [] myWord =new char [7];
        myWord [6] = 's';
          myWord [5] = 't';
            myWord [4] = 'u';
              myWord [3] = 'd';
                myWord [2] = 'e';
                  myWord [1] = 'n';
                    myWord [0] = 't';
                                   
    for (int i = 0; i < myWord.length; i++)
    {
        System.out.println(myWord[i]);
    }
        Scanner sc= new Scanner (System.in);
        
        System.out.println("enter word");
        String word = sc.nextLine();
        char[] myLetters = new char [word.length()];
        for(int i = 0 ; i <myLetters.length-1; i--){
            myLetters[i] = word.charAt(i);
            System.out.println(myLetters[i]);
        }
    }
}
