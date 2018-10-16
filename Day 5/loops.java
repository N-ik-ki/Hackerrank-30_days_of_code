//Day 5:Loops
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res;
        for(int i=1;i<=10;i++)
        {
            res=n*i;
            System.out.println(n + " x "  + i +  " = " +res);
        }
        
    }
}
