package com.paynet.demo.util;

public final class RunLength {
  public static String execute(String str) {
    String result = "";

    if(str.matches("[a-zA-Z]+")) {
      for (int i = 0; i < str.length(); i++) {
        int count = 1;
        while (i + 1 < str.length() && isNextCharSame(str, i)) {
          i++;
          count++;
        }
        result = result.concat(compressed(str, i, count));
      }
    } else {
      result = "invalid input";
    }

    return result;
  }

  private static boolean isNextCharSame(String input, int index) {
    return input.charAt(index) == input.charAt(index + 1);
  }

  private static String compressed(String str, int index, int count) {
    return "" + count + str.charAt(index);
  }
}
