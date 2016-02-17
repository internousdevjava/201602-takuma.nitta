import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KisoKadai3 {

	public static void main(String[] args)throws IOException{
		System.out.println("テキストファイル管理プログラムver1.0を開始します");
		System.out.println("ファイルの新規作成は0,ファイルの読み込みは1,ファイルの追記は2,ファイルの上書きは3,終了は5を入力して下さい");
    	String str = null;
        BufferedReader br = new BufferedReader
        		(new InputStreamReader(System.in));



        int x = 0;
        //ループ用関数

        while (x==0){
        try{
            str = br.readLine();
            int a=Integer.parseInt(str);

            if (a == 0){
            	System.out.println("ファイルの新規作成を行います");
            	System.out.println("作成するファイル名を入力して下さい");

            	//新規作成プログラムが入る

            	File file = new File(args[0]);
            	File dir=new File(file.getParent());
            	//ディレクトリパスなるものを取得したらしい

//            	if(!dir.exists()){
//            		//フォルダがなかった場合
//            		System.out.println("フォルダがないので作成します" + file.getAbsolutePath());
//            		//アブソリュートパスはフォルダの位置を表す
//            		dir.mkdirs();
//            		System.out.println("フォルダを作りました");
//            	} else {
//            		System.out.println("フォルダを見つけました");
//            	//実行結果に関係なく下の処理へ
//
            	if(file.exists()){
            		//ファイルがあった場合
            		System.out.println("同名のファイルが既にあるみたいです\n" + file.getAbsolutePath());
            	}else{
            		System.out.println("同名のファイルはないみたいです\n" + file.getAbsolutePath());
            		try{
            			if (file.createNewFile()){
            			   System.out.println("ファイルを作りました");
            			}else{
            			   System.out.println("作れなかったみたいです…");
            			   //作れないってどういう状況…？
            			}

            		}catch(IOException e){
            			System.out.println("エラーです");
            		}
            		}


//            	}

    			break;

            } else if(a == 1){
            	System.out.println("ファイルの読み込みを行います");
            	System.out.println("読み込むファイルを選択して下さい");

            	File file = new File(args[0]);
            	File dir=new File(file.getParent());
            	//ディレクトリパスなるものを取得したらしい(2回目、ローカルにしないとどういうわけだかエラー)
            	//読み込みプログラムが入る

            	try{
            		FileReader filereader = new FileReader(file.getAbsolutePath());
            		//ファイルを読み込む

            		int b;


            	}catch(Exception e){
            		System.out.println("エラーです");
            	}

            	break;


            } else if(a == 2){
            	System.out.println("ファイルの追記を行います");
            	System.out.println("読み込むファイルを選択して下さい");

            	File file = new File(args[0]);
            	File dir=new File(file.getParent());
            	//ディレクトリパスなるものを取得したらしい(3回目、ローカルにしないとどういうわけだかエラー)

            	//読み込みプログラムが入る

            	FileWriter fw = new FileWriter(file.getAbsolutePath(),true);
            	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            	//どうやらReaderは使わないらしい。trueは追記でfalseは上書きになる

            	BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
            	String str3 = br3.readLine();
            	pw.println(str3);
            	//？？？？？

            	pw.close();
            	System.out.println("ファイルの追記が完了しました");


            	break;

            } else if(a == 3){
            	System.out.println("ファイルの上書きを行います");
            	System.out.println("読み込むファイルを選択して下さい");

            	File file = new File(args[0]);
            	File dir=new File(file.getParent());
            	//ディレクトリパスなるものを取得したらしい(3回目、ローカルにしないとどういうわけだかエラー)

            	//読み込みプログラムが入る

            	FileWriter fw = new FileWriter(file.getAbsolutePath(),false);
            	PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            	//どうやらReaderは使わないらしい。trueは追記でfalseは上書きになる

            	BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
            	String str3 = br3.readLine();
            	pw.println(str3);
            	//？？？？？

            	pw.close();
            	System.out.println("ファイルの上書きが完了しました");


            	break;

            } else if(a == 4){
            	System.out.println("4は縁起が悪いので使いません");
            	//そういうこともある

			} else if(a == 5){
				System.out.println("終了します");
				System.out.println("お疲れ様でした");

            	break;

			} else {
				System.out.println("ごめんなさい、0,1,2,3,5のいずれかを入力してください");
			}
			}catch(Exception e){
			  /*	e.printStackTrace();

			  	}*/
				System.out.println("すみません、0,1,2,3,5のいずれかを入力してください");


			}
         //try
        	}
        //while
				}
        //}static void
}
//}main class