package com.java.recursion;

public class recursion_ex1 {

    /**
     * function call itself in a function definition, it's called recursive
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(recurse(6));
        loop(1);
        recurse2(10);
    }

    static int recurse(int n){
        if(n==1){
            return 1;
        }
        return n + recurse(n-1);
    }


    static void loop(int n){

        int ans = 0;
        while (n<=6){
            ans += n;
            n++;
        }
        System.out.println(ans);
    }

    static void recurse2(int n){
        //Base Case
        if(n==1){
            System.out.println(1);
        }

        //Recursive case
        else {
            System.out.println(n);
            recurse2(n-1);
        }

        //loop
        for (int i = n; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
