package com.paynet.demo.util;

import java.util.Arrays;
import java.util.List;

public final class WordSplit {
  public static String execute(String[] strArray) {
    String inputWord = strArray[0];
    String[] dictionary = strArray[1].split("\\s*,\\s*"); //add regex to allowed white spacing

    String result = "not possible";

    for (String firstWord : dictionary) {
      String secondWord = inputWord.replaceFirst(firstWord, "");
      if (inputWord.startsWith(firstWord) &&
          isValid(Arrays.asList(firstWord, secondWord), dictionary)
      ) {
        result = assemble(firstWord, secondWord);
      }
    }

    return result;
  }

  private static boolean isValid(List<String> containWords, String[] dictionary) {
    return Arrays.asList(dictionary).containsAll(containWords);
  }

  private static String assemble(String first, String second) {
    return String.join(",", first, second);
  }
}
