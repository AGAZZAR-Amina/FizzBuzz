package com.controle.tdd;



public class FizzBuzz {
    public  static String de(int nb){
       String rest="";
       if(nb==3){
           rest ="Fizz";
       }
       else {
           rest = String.valueOf(nb);
       }
        return rest ;
    }


}
