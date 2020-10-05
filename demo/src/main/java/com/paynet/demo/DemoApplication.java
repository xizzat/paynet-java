package com.paynet.demo;

import com.paynet.demo.util.WordSplit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

    String[] input = new String[]{"ballbase", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
    //String[] input = new String[]{"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
    String output = WordSplit.wordSplit(input);
    System.out.println(output);
  }
}
