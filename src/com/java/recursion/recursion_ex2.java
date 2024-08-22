package com.java.recursion;

public class recursion_ex2 {
    public static void main(String[] args) {
        System.out.println(recurse(6));
    }

    static int recurse(int n){
        if(n<=1){
            return n;
        }
        return recurse(n-1) + recurse(n-2);
    }

}
