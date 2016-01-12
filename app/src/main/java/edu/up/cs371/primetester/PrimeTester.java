package edu.up.cs371.primetester;

import android.util.Log;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        // for now, return a random result
        for (int i = 3; i*i <= n; i += 2) {
            Log.i("isPrime", "" + i);
            if (n % i == 0) return false;
        }
        return true;
    }
}
