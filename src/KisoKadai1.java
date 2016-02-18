import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//インポート

public class KisoKadai1
{
    public static void main(String[] args) throws IOException{
    	//メインメソッドの宣言
    	System.out.println("\n九九表ver1.1\n\n[x軸とy軸を調整できます]\n---\n");


        int i = 0;

        while (i==0){
        try{

      		String str = null;
      		//Stringを使用するためにリセット

      		BufferedReader br = new BufferedReader
                		(new InputStreamReader(System.in));
      		//BufferedReaderとInputStreamReaderの新規使用

             		System.out.println("x軸を入力してください");
             		str = br.readLine();
             		//readLIneの使用宣言

             		int a=Integer.parseInt(str);
//
             		System.out.println("y軸を入力してください");
             		str = br.readLine();
             		//readLIneの使用宣言

             		int b=Integer.parseInt(str);

             		System.out.println(" " + "x軸=" + a + " " + "y軸=" + b);

             		for( int x=1; x<=b; x++ ) {
                		for( int y=1; y<=a; y++ ) {
                			if(x*y<=9) System.out.print(" ");
                			System.out.print((x*y) + " ");
            			}
                		System.out.println();



		}

            		System.out.println("続けますか？ yes→1 no→2");
             		str = br.readLine();

             		int c=Integer.parseInt(str);

             		if(c == 1){continue;
             		}else if(c == 2){
             			System.out.println("終了します。お疲れ様でした");
             			break;
             		}else{
             			System.out.println("無効な値が入力されました。終了します");
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
          	System.out.println("すみません、正の整数を入力してください");
		}
          }

            }
}