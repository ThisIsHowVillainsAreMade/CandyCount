class CandyCount {
   public static void main(String[] args) {
       double money = 12.4;
       double price = 1.2;
       int candies = 0;

       if (money > 0 && price > 0) {
           while (money >= price) {
               candies++;
               money -= price;
           }
       }

       System.out.println(candies);
   }
}
