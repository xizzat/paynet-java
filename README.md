# paynet-java
App to demonstrate function wordsplit and runlength

## To run
```
cd paynet-java/demo
./gradlew bootRun
```

## Utils
### 1. WordsSplit
This utility is to determine if the first element in the input can be split into two words, where both words exist in the dictionary that is provided in the second input

### 2. RunLength
This util algorithm works by taking the occurrence of each repeating character and outputting that number along with a single character of the repeating sequence. For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols. 
