package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
Lab 1: Celsius to Fahrenheit Converter
Write a program that takes in a float Celsius, and displays its equivalent value in
Fahrenheit in two decimal places. The formula is as follows: °F = °C × (9/5) + 32.
 */
public class Main {
    public static void main(String[] args) {
        float tempCelsius = 0.00f;
        float tempFahrenheit = 0.00f;


        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        tempCelsius = myObj.nextFloat();
        tempFahrenheit = (tempCelsius * 9)/5.0f + 32;
        System.out.printf("Temperature in Fahrenheit: "+ String.format("%.2f",tempFahrenheit));

    }
}