import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


//ランダムのインポート
class KisoKadai2 {
	public static void main(String[] args) {


    	Random rand = new Random();
        //ランダムとスキャナのクラスインスタンス化

        System.out.println("数当てゲームver1.0を開始します");
        int answer = rand.nextInt(100) + 1;
        //ランダムで1～100の数を定義

        //答えの定義
    	String str = null;
        BufferedReader br = new BufferedReader
        		(new InputStreamReader(System.in));

        int x = 0;

            System.out.print("1から100までの数を当てて下さい : ");


                while (x==0){
                    try{
                        str = br.readLine();
                        int a=Integer.parseInt(str);
            if (answer > a){
                System.out.println("もっと大きい数です");
            } else if(answer < a){
                System.out.println("もっと小さい数です");
            } else {
            	System.out.println("正解です……");
            	break;
            }
            }catch(Exception e){
              /*	e.printStackTrace();
    	        }if (yourAns == i){
              		System.out.println("数字を入力してください");
              	}else if(yourAns <= 0){
              		System.out.println("1～100の数字を入力してください");
              	}else if(yourAns >= 101){
              	}*/
            	System.out.println("すみません、1～100の整数を入力してください");
            }


        }}}

	// }
	// Math.random()*100 if (0=ans){System.out.println("0");}

	// ここから下trycatch文

	// リセット
