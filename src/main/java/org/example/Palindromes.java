package org.example;

public class Palindromes {
  public static int[][] longestPalindrome(String fw) {
    String bw = new StringBuilder(fw).reverse().toString();
    int n = fw.length();
    int[][] K = new int[n + 1][n + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (fw.charAt(i - 1) == bw.charAt(j - 1)) {
          K[i][j] = K[i - 1][j - 1] + 1;
        }
        else if (K[i - 1][j] >= K[i][j - 1]) {
          K[i][j] = K[i - 1][j];
        }
        else {
          K[i][j] = K[i][j - 1];
        }
      }
    }
    return K;
  }

  public static int lengthLPS(String fw) {
    int[][] K = longestPalindrome(fw);
    int n = fw.length();
    return K[n][n];
  }

  public static String generateLPS(String fw) {
    int[][] K = longestPalindrome(fw);
    int n = fw.length();
    String bw = new StringBuilder(fw).reverse().toString();
    int index = K[n][n];
    char[] pal = new char[index];
    int i = n;
    int j = n;
    while (i > 0 && j > 0) {
      if (fw.charAt(i - 1) == bw.charAt(j - 1)) {
        pal[index - 1] = fw.charAt(i - 1);
        i--;
        j--;
        index--;
      }
      else if (K[i-1][j] > K[i][j-1]) {
        i--;
      }
      else {
        j--;
      }
    }
    return new String(pal);
  }
}
