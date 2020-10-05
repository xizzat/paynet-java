package com.paynet.demo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSplitTest {

  final String expected = "cat,yellow";
  final String expectedReverse = "yellow,cat";
  final String not_possible = "not possible";

  @Test
  public void wordSplit_helloCat() {
    String[] input = new String[]{"catyellow", "apple,bat,cat,goodbye,hello,yellow,why"};
    assertEquals(expected, WordSplit.execute(input));
  }

  @Test
  public void wordSplit_withSpacing() {
    String[] input = new String[]{"catyellow", "apple,bat, cat,goodbye ,hello, yellow  ,why"};
    assertEquals(expected, WordSplit.execute(input));
  }

  @Test
  public void wordSplit_reverse() {
    String[] input = new String[]{"yellowcat", "apple,bat,cat,goodbye,hello,yellow,why"};
    assertEquals(expectedReverse, WordSplit.execute(input));
  }

  @Test
  public void wordSplit_notExist() {
    String[] input = new String[]{"ballyellow", "apple,bat, cat,goodbye ,hello, yellow  ,why"};
    assertEquals(not_possible, WordSplit.execute(input));
  }

  @Test
  public void wordSplit_3words() {
    String[] input = new String[]{"catyellowcat", "apple,bat, cat,goodbye ,hello, yellow  ,why"};
    assertEquals(not_possible, WordSplit.execute(input));
  }

  @Test
  public void wordSplit_empty() {
    String[] input = new String[]{"", "apple,bat, cat,goodbye ,hello, yellow  ,why"};
    assertEquals(not_possible, WordSplit.execute(input));
  }
}
