package lrs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;

public class LRSSimple {

    public static String find(String s) {
        int n = s.length();

        System.out.println("building suffixes...");
        StringWrapper[] suffixes = new StringWrapper[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = new StringWrapper(s, i);// s.substring(i, n);
        }

        System.out.println("sorting suffixes...");
        //Arrays.sort(suffixes);
        RadixQuickSort.sort(suffixes);

        System.out.println("finding lcp...");
        String lrs = "";
        for (int i = 0; i < n - 1; i++) {
            int len = lcp(suffixes[i], suffixes[i + 1]);
            if (len > lrs.length()) {
                // lrs = suffixes[i].substring(0, len);
                lrs = suffixes[i].substring().substring(0, len);
            }
        }
        return lrs;
    }

    public static void main(String[] args) {
        ;
        // System.out.println(args[0]);
        // BufferedReader in = null;
        // StringBuilder sb = new StringBuilder();
        // try {
        // in = new BufferedReader(new InputStreamReader(System.in));
        // String line;
        // while ((line = in.readLine()) != null) {
        // sb.append(line);
        // }
        // } catch (Exception e) {
        //
        // } finally {
        //
        // }
        // System.out.println(System.in.toString());
        // System.out.println(sb.toString());
        // find(System.in.toString());
        // System.out.println(sb.toString().toUpperCase());
        // find(sb.toString().toUpperCase());
        System.out.println(find(StdIn.readAll()));
         //System.out.println(find("aacaagtttacaagc"));
        // System.out.println(find("it was the best of times it was the worst of
        // times it was the age of wisdom it was the age of foolishness it was
        // the epoch of belief it was the epoch of incredulity it was the season
        // of light it was the season of darkness it was the spring of hope it
        // was the winter of despair"));

    }

    private static int lcp(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        int len = 0;
        for (; len < l1 && len < l2; len++) {
            if (s1.charAt(len) != s2.charAt(len)) {
                break;
            }
        }
        return len;
    }

    private static int lcp(StringWrapper s1, StringWrapper s2) {
        return lcp(s1.substring(),s2.substring());
    }

}
