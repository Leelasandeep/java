import java.util.*;
import java.util.stream.Collectors;
import  java.util.stream.Stream;
import java.util.Arrays;
public class Streamsexmp {
    public static void main(String[] args){
        //method - 1
        String[] people = {"monkey","man","cat","rat","samantha","modi","Jai Shri Ram"};
        Arrays.stream(people).filter(p->p.contains("R")).forEach(System.out::println);
        //method-2
        Stream.of(people)
                .filter(word -> word.contains("a"))  // Filter words containing "a"
                .forEach(System.out::println);      // Print each filtered word
    }
}
//don't write like this contains('R') it will give error