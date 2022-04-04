package ru.maxvagan;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
//	    Task 1
        System.out.println("Task 1");
        byte step = 1;
        while (step < 10) {
            System.out.print(step + " ");
            step++;
        }
        System.out.println(step);
        for (; step>1; step--)
            System.out.print(step + " ");
        System.out.println(step);
//	    Task 2
        System.out.println("Task 2");
        int fridayDayNumber = (int)(1 + Math.round(Math.random()*6));
        while (fridayDayNumber<=31){
            System.out.println("Сегодня пятница, "+fridayDayNumber+"-е число. Необходимо подготовить отчет.");
            fridayDayNumber+=7;
        }
//	    Task 3
        System.out.println("Task 3");
        short startYearOfCometIncome = (short)(1900 + Math.round(Math.random()*500));
        byte periodOfIncome = 79;
        short itemYear = startYearOfCometIncome;
        System.out.println("Год начала наблюдения за кометой (нулевой) " + startYearOfCometIncome);
        System.out.println("За последние 200 лет комета наблюдалась в следующие года:");
        while (itemYear<=startYearOfCometIncome+200){
            System.out.println(itemYear);
            itemYear += periodOfIncome;
        }
        System.out.println("В следующий раз, когда мы сможем её наблюдать, будет " + itemYear + " год");
    }
}
