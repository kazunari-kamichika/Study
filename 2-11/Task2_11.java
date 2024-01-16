public class Task2_11{  

  public static void main(String[] args){

        //問1
    int a = 0;
    int b = 0;
      a = 10;
      b = 3;

      System.out.println("和:"+(a + b));
      System.out.println("差:"+(a - b));
      System.out.println("積:"+(a *b));
      System.out.println("商:"+(a / b));
      System.out.println("余り:"+(a % b));

       //問2
    int t=0;
      for(t=1; t<20; t=t+2)
        System.out.println(t+1);

       //問3
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int add = sumOddNumbers(numbers);
      System.out.println("奇数の合計: " + add);
  }

    public static int sumOddNumbers(int[] numbers){
      int add = 0;

      for (int i = 0; i < numbers.length; i++){
         if( i % 2 ==0){
          add +=numbers[i];

         }
      }
      return add;
    }


}
