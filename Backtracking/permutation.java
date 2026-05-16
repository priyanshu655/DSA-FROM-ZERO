/**This program prints **all possible permutations (arrangements)** of the characters of a string using **backtracking + recursion**.

For the input `"abc"`, it generates every possible ordering of the characters:

* abc
* acb
* bac
* bca
* cab
* cba

### Core Idea

At every step:

1. Pick one character from the string.
2. Add it to the answer being built.
3. Remove that character from the remaining string.
4. Recursively repeat for the remaining characters.
5. Continue until no characters are left.

When the remaining string becomes empty, one complete permutation is formed and printed.

This problem is a classic example of:

* Recursion tree generation
* Backtracking
* Choice → Explore → Undo pattern
* Branching recursion

Time Complexity:

* O(n!) permutations are generated for a string of length (n).
**/

package Backtracking;

public class permutation {
    public static void printPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String newstr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String ans="";
        printPermutation("abc", ans);
    }
}
