package com.paynet.demo;

import com.paynet.demo.util.RunLength;
import com.paynet.demo.util.WordSplit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

    System.out.println("[Running WordSplit]...");

    String[] input = new String[]{"ballbase", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
    String[] input2 = new String[]{"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
    System.out.println("Input : " + Arrays.toString(input));
    System.out.println("Output: " + WordSplit.execute(input));
    System.out.println("Input : " + Arrays.toString(input2));
    System.out.println("Output: " + WordSplit.execute(input2));

    System.out.println("[Running RunLength]...");

    System.out.println("Input : aabbcde");
    System.out.println("Output: " + RunLength.execute("aabbcde"));
    System.out.println("Input : wwwbbbw");
    System.out.println("Output: " + RunLength.execute("wwwbbbw"));
  }
}
