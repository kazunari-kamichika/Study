public class Task2_10 {

     public static void main(String[] args) {

           //問1
        String[] fruits ={"みかん","りんご","ぶどう","メロン"};
        
           //問2
           for( int count = 0;count< fruits.length; count++) {
            System.out.println(fruits[count]);

        }
           //問3
           //[iが50以下の場合、iが出力される処理が継続される]


        int i = 1;
           while(i <= 50) {
            System.out.print(i);
            i++;
        }
            System.out.println();

           //問4
           for ( int t = 5; t <= 9; t++) {
               System.out.print(t +"||" );

               for ( int j =1; j <=9; j++){
                 System.out.print( " "+(t * j)+" | ");
               } 

               System.out.println();
           }

     }
}