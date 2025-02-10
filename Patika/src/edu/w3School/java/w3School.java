package edu.w3School.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.in;

public class w3School {


          public static void main(String[] args) {
            // addTwoNumbers();
            //  countWords();
            //  reverseString();
            //   sumOfArray();
            //   stringToArray();
            //  findArrayAvarage();
            //  findSmallestNumber();
            arrayListLoop();
            HashMap<String, String> capitalCities = new HashMap<>();
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");

            for(String i: capitalCities.keySet()){
                System.out.println(i);
            }
            for(String i: capitalCities.values()){
                System.out.println("Capital Cities: "+i);
            }
            for(String i: capitalCities.keySet()){
                System.out.println("key: "+ i+ "  value: "+ capitalCities.get(i));
            }
            System.out.println("Area of Rectangle : " + areaRectangle(3,6));

            int number = (int)(Math.random()*101);
            numberCheck(number);




        }

        // Add two Numbers
        public static void addTwoNumbers(){
            int firstNumber, secondNumber, sum;

            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Type a number");
                firstNumber = input.nextInt();
                System.out.println("Type another number");
                secondNumber = input.nextInt();

                sum = firstNumber + secondNumber;
                System.out.println("Sum: " + sum);
                input.close();

            } catch (NumberFormatException n) {
                System.out.println("Please enter a number"+ n.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        public static  void  countWords(){
            Scanner input = new Scanner(in);
            System.out.println("Please enter words : ");
            String userInput = input.nextLine();
            int result = userInput.split("\\s").length;
            System.out.println("Word number "+ result);

        }

        public  static void reverseString(){
            Scanner input = new Scanner(in);
            System.out.println("Please enter a word: ");
            String word = input.nextLine();
            String reverseWord= " ";
            for(int i= 0; i<word.length(); i++){
                reverseWord = word.charAt(i)+ reverseWord;
            }
            System.out.println("Reverse word is: "+reverseWord);
        }
        public static void sumOfArray(){
            int[] array = {1,5,10,25,30};
            int sum = 0;
            for(int arr: array){
                sum+=arr;
            }
            System.out.println("Sum is: "+ sum);
        }

        public static void   stringToArray(){
            Scanner input = new Scanner(in);
            System.out.println("Please enter a word: ");
            String text= input.nextLine();

            char[] array = text.toCharArray();
            for(char c: array){
                System.out.println(c);
            }

        }
        public  static  void  findArrayAvarage(){
            int[] array = {45,46,8, 28,32,15,89,75};

            int count= array.length;
            int sum=0;
            for(int arr: array){
                sum +=arr;
            }
            int avarage = sum / count;

            System.out.println("Avarage numbers of Array : "+ avarage);
        }

        public static void  findSmallestNumber(){
            int[] ages = {3,9,5,87,56,25,4,21, 1};
            int lowestAge = ages[0];
            for(int age: ages){
                if(lowestAge>age){
                    lowestAge = age;
                }
            }
            System.out.println("The smallest number: " + lowestAge);
        }

        public static void arrayListLoop(){
            ArrayList<Integer> ages = new ArrayList<>();
            ages.add(3);
            ages.add(6);
            ages.add(5);
            ages.add(7);
            ages.add(9);
            ages.add(11);
            ages.add(25);
            ages.add(22);
            ages.add(63);
            ages.add(36);

//        for(Integer arr: ages){
//            System.out.println(arr);
//        }

            int min = Collections.min(ages);
            int max = Collections.max(ages);
            int sum = ages.stream().reduce(0,(a,b)->a+b);

            System.out.println("Min : "+ min);
            System.out.println("Max : "+ max);
            System.out.println("Sum : "+ sum);
        }

        public static  int areaRectangle(int x, int y){
            return x*y;
        }

        public static  void numberCheck(int x){
            if(x%2 == 0){
                System.out.println("Number "+x+ " even number");
            }
            else {
                System.out.println("Number "+x+ " odd number");
            }
        }


    }


