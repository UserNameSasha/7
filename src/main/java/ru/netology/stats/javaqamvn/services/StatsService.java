package ru.netology.stats.javaqamvn.services;

 public class StatsService {

     public long stats(long[] sales) {
         long total = 0;
         for (long sale : sales) {
             total += sale;
         }
         return total;
     }


     public long average(long[] sales) {
         return stats(sales) / sales.length;
     }

     public int max(long[] sales) {
         int maxMonth = 0;
         long maxSale = sales[0];
         for (int i = 0; i < sales.length; i++) {
             if (sales[i] >= maxSale) {
                 maxSale = sales[i];
                 maxMonth = i;
             }
         }
         return maxMonth + 1;
     }

     public int min(long[] sales) {
         int minMonth = 0;
         long minSale = sales[0];
         for (int i = 0; i < sales.length; i++) {
             if (sales[i] <= minSale) {
                 minSale = sales[i];
                 minMonth = i;
             }
         }
         return minMonth + 1;
     }

     public int belowAverage(long[] sales) {
         int counter = 0;
         long averageSale = average(sales);
         for (long sale : sales) {
             if (sale < averageSale) {
                 counter++;
             }
         }
         return counter;
     }

     public int overAverage(long[] sales) {
         int counter = 0;
         long averageSale = average(sales);
         for (long sale : sales) {
             if (sale > averageSale) {
                 counter++;
             }
         }
         return counter;
     }
 }


