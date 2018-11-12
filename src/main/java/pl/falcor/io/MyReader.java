package pl.falcor.io;

import java.util.Scanner;

/**
 * Wrapper for the Scanner.
 *
 */


public class MyReader {

    public static int read(){
        return new Scanner(System.in).nextInt();
    }
}