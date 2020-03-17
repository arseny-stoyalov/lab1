package com.company;

public class Primes {

    public static void main(String[] args) {

        System.out.print("Prime nums in range from 2 to 100: ");
        for (int i = 2; i < 101; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Method returns whether the given number is prime or not
     *
     * @param n number to test
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return true;
    }

}
