package com.controle.tdd;

public class FizzBuzz {
    public  static String de(int nb){
       String rest="";
       if(nb%3==0){
           rest ="Fizz";
       }
      else  if(nb%5==0){
           rest= "Buzz" ;
       }
       else {
           rest = String.valueOf(nb);
       }
        return rest ;
    }
}
