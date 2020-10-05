package com.paynet.demo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunLengthTest {

  final String invalid = "invalid input";

  @Test
  public void runLength_sample1() {
    assertEquals("2a2b1c1d1e", RunLength.execute("aabbcde"));
  }

  @Test
  public void runLength_sample2() {
    assertEquals("3w3b1w", RunLength.execute("wwwbbbw"));
  }

  @Test
  public void runLength_withNumber() {
    assertEquals(invalid, RunLength.execute("ww2wb5bbw5"));
  }

  @Test
  public void runLength_withSymbols() {
    assertEquals(invalid, RunLength.execute("wwwb$bb%w&"));
  }

  @Test
  public void runLength_withPunctuation() {
    assertEquals(invalid, RunLength.execute("w,ww'bb!bw"));
  }
}
