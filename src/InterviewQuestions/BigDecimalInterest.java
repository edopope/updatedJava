package InterviewQuestions;

import chapter17.functionalInterfacesConsumers.BiConsumerExample;
import chapter17.functionalInterfacesConsumers.UnaryExample;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class BigDecimalInterest{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value for principal::");
        double principals = keyboard.nextDouble();
        System.out.println("Enter a value for rate::");
        double rates = keyboard.nextDouble();
        System.out.println("Enter number of years::");
        int years = keyboard.nextInt();
        BigDecimal principal = BigDecimal.valueOf(principals);
        BigDecimal rate = BigDecimal.valueOf(rates);
        for (int i = 1; i <= years; i++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(years));
            System.out.printf("%4d%20s%n", i, NumberFormat.getCurrencyInstance().format(amount));


        }
    }


    }
