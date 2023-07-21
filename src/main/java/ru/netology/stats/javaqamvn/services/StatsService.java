package ru.netology.stats.javaqamvn.services;

 public class StatsService {

     //1
     public int sum(int[] sales) {
         int result = 0;
         for (int sale : sales) {
             result += sale;
         }
         return result;
     }
     //2
     public int average(int[] sales) {
         int result = sum(sales);
         return result / sales.length;
     }
     //3
     public int maxMonth(long[] sales){
         int maxMonth = 0;
         int month = 0;
         for (long sale : sales) {
             if (sale >= sales[maxMonth]) {
                 maxMonth = month;
             }
             month = month + 1;
         }
         return maxMonth + 1;
     }
     //4
     public int minMonth(long[] sales){
         int minMonth = 0;
         int month = 0;
         for (long sale : sales) {
             if (sale <= sales[minMonth]) {
                 minMonth = month;
             }
             month = month + 1;
         }
         return minMonth + 1;
     }
     //5
     public  int belowAverage(int[] sales) {
         int counter = 0;
         int averageSales = average(sales);
         for (int i=0; i < sales.length; i++){
             if (sales[i] < averageSales) {
                 counter++;
             }
         }
         return counter;
     }
     //6
     public int overAverage(int[] sales) {
         int count = 0;
         int salesAvg = average(sales);
         for (int i = 0; i < sales.length; i++) {
             if (sales[i] > salesAvg) {
                 count++;
             }
         }
         return count;
     }
 }


