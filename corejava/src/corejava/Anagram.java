package corejava;

import java.util.*;
public class Anagram
{
    public static void main (String[] args) throws java.lang.Exception
    {
        boolean result = isAnagram("now","own");
        System.out.println(result);
    }
    public static boolean isAnagram(java.lang.String string, java.lang.String string2)
    {
        // remove all whitespaces and convert strings to lowercase
        string  = string.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        /* check whether string lengths are equal or not,
        if unequal then not anagram */
        if (string.length() != string2.length())
        return false;

        // convert string to char array
        char[] firstArray = string.toCharArray();
        char[] secondArray = string2.toCharArray();

        // sort both the arrays
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // checking whether both strings are equal or not
        return Arrays.equals(firstArray,secondArray);
    }
}
