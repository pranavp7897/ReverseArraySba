package com.company;
// Name : Pranav Patel
// Apps. Support SBA

/*Write a method reverseWords() that takes a message as an array of characters and reverses the order of the words in place.
        For example:
        char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };
        reverseWords(message);
        System.out.println(message); // prints: "steal pound cake"*/
// When writing your method, assume the message contains only letters and spaces, and all words are separated by one space.

public class Main {

    public static String reverseWords(char[] cArray)
    {
        int i = cArray.length -1;
        int wordFirstIndex;
        int wordLastIndex = i + 1; //set up default last index out of array bcz its null
        String message = "";

             while(i >= 0)
            {
               // char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };
                if(cArray[i] == ' ') //finding space in char array from backward
                {
                    wordFirstIndex = i + 1; //added 1 to begin with word to store in message
                    while(wordFirstIndex != wordLastIndex)
                    {
                        message = message + cArray[wordFirstIndex];
                        wordFirstIndex++;
                    }
                    message += ' ';
                    wordLastIndex = i; //set up end with the first space found
                }
                i--; // if no space found decrease the index to continue backward
            }

        wordFirstIndex = 0;
        while(wordFirstIndex != wordLastIndex)
        message = message + cArray[wordFirstIndex++];

            return message;

}
    public static void main(String[] args) {
	// write your code here
        char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };
        System.out.println("Array Length: " + message.length);
        String msg = reverseWords(message);
       System.out.println(msg); // prints: "steal pound cake"*/

        /*char [] test = {'P','a','t','e','l',' ','P','r','a','n','a','v'};
        String testMsg = reverseWords(test);
        System.out.println(testMsg);*/
    }
}
