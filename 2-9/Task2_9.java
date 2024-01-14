public class Task2_9 {


    // 定数（アカウント情報）
    private static final String USER_NAME = "alice";
    private static final String USER_PASSWORD = "alice123";

    // 定数（メッセージ）
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    public static void main(String[] args) {

        String name = "alice";
        String pass = "alice123";


          //問1
           if ( USER_NAME.equals(name) && USER_PASSWORD.equals(pass) ) {
            System.out.println(CONST_MSG_SUCCESS);

          //問2
         } else if ( USER_NAME.equals(name)){
            System.out.println(CONST_MSG_ERROR_NAME);

          //問3
         } else if ( USER_PASSWORD.equals(pass)){
            System.out.println(CONST_MSG_ERROR_PASS);

          //問4
         } else {
            System.out.println(CONST_MSG_ERROR_INPUT);

         }




    }


}