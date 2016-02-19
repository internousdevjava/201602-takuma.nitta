import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class KisoKadai3 {

	public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader
        		(new InputStreamReader(System.in));
		FileWriter fw1 ;
		String str1;
		File file3;
		// strは犠牲になったのだ
		//fileも犠牲になったのだ


//
		System.out.println("テキストファイル管理プログラムver1.2を開始します");
        //ループ用関数
        int x = 0;
        while (x==0){

        		 try{




		System.out.println("ファイルの新規作成は0,ファイルの上書きは1,ファイルの追記は2,ファイルの読み込みは3,終了は5を入力して下さい");


            str1 = br.readLine();
            int a=Integer.parseInt(str1);

            if (a == 0){



            	System.out.println("ファイルの新規作成を行います");
            	file3 = nitta(nittaku(br),br);
            	//nittakuではなくnittaに繋がってる？
//            	System.out.println("作成するファイル名を入力して下さい");
//
//            	//新規作成プログラムが入る
//            	fw1 = new FileWriter(file3);
//            	fw1.write(br.readLine());
//            	fw1.close();
            	//filewriterはcloseしないと終わらないとのこと
// 			    System.out.println("ファイルを作りました");
 			    totta();


            } else if(a == 1){
            	file3 = nitta(nittaku(br),br);
            	System.out.println("ファイルの上書きを行います");
            	System.out.println("内容を記載して下さい");

            	//読み込みプログラムが入る
            	fw1 = new FileWriter(file3);
            	fw1.write(br.readLine());
            	fw1.close();
            	System.out.println("ファイルの上書きが完了しました");
            	totta();



            } else if(a == 2){
            	file3 = nitta(nittaku(br),br);
            	System.out.println("ファイルの追記を行います");
            	System.out.println("内容を記載して下さい");

            	//読み込みプログラムが入る
            	fw1 = new FileWriter(file3,true);
            	fw1.write(br.readLine());
            	fw1.close();
            	System.out.println("ファイルの追記が完了しました");
            	totta();


            } else if(a == 3){
            	file3 = takuma(nittaku(br),br);
//            	System.out.println("ファイルの読み込みを行います");
//            	System.out.println("読み込むファイルを選択して下さい");
//
//
//            	//読み込みプログラムが入る
//            	FileReader fr = new FileReader(file3);
//            	int ch;
//            	while((ch = fr.read()) != -1){
//            		System.out.print((char)ch);
//            		//intからchar型に変換。一文字ずつ表示して全部表示しきると-1が戻り値になるためループ終了
//            	}
            	System.out.println("");
            	totta();

            } else if(a == 4){
            	System.out.println("4は縁起が悪いので使いません");
            	//そういうこともある

			} else if(a == 5){
				System.out.println("終了します");
				System.out.println("お疲れ様でした");
				System.exit(0);
				//System.exit(0);で終了。知らんかった

			} else {
				System.out.println("ごめんなさい、0,1,2,3,5のいずれかを入力してください");
			}

			}catch(Exception e){
			  /*	e.printStackTrace();

			  	}*/
				System.out.println("エラーです。メニューに戻ります");
				//ざっくり
				continue;
			}
        }
	}


	private static File takuma(String str, BufferedReader br) throws IOException{
			String str2 =str;
			String str3;
			String str4;
			File file2;

			while(true){
//            	System.out.println("ファイルの読み込みを行います");
            	System.out.println("読み込むファイルを選択して下さい");
            	str3 = br.readLine();
            	str4 = str2 + "\\" + str3;
            	//バックスラッシュが出ないクポ
            	file2 = new File(str4);
            		if(file2.exists()){
            			System.out.println("ファイルを見つけました。読み込みを行います");
                    	FileReader fr = new FileReader(file2);
                    	int ch;
                    	while((ch = fr.read()) != -1){
                    		System.out.print((char)ch);

                    	}
            			break;
            		}else{
            			file2.createNewFile();
            			System.out.println("ファイルを新規作成します");
            			break;
            		}
			}
			return file2;
	}

	private static File nitta(String str, BufferedReader br) throws IOException {
			String str2 =str;
			String str3;
			String str4;
			File file2;

			while(true){
            	System.out.println("ファイル名を入力して下さい");
            	str3 = br.readLine();
            	str4 = str2 + "\\" + str3;
            	//バックスラッシュが出ないクポ
            	file2 = new File(str4);
            		if(file2.exists()){
            			System.out.println("そのファイルは既に存在しています");

            		}else{
            			file2.createNewFile();
            			System.out.println("ファイルを作成しました");
            			break;
            		}

			}
			return file2;
	}
			private static String nittaku(BufferedReader br) throws IOException {
				String str1;
				String str2 = null;
				File file1;



				int q = 0;
				while(q < 1){
					System.out.println("参照するフォルダ名を入力して下さい");
					str2 = br.readLine();
					file1 = new File(str2);
					if(!file1.exists()){


	            	System.out.println("フォルダが存在しません。作成してもよろしいですか？ はい=a いいえ=b");
	            	while(true){
	            		str1 = br.readLine();
	            		String a = "a", b = "b";
	            		if(str1.equals(a)){
	            			file1.mkdirs();

	            			System.out.println("作成しました");
	            			q++;
	            			break;
	            		}else if(str1 .equals(b)){
	            			System.out.println("フォルダ参照に戻ります");
	            			break;
	            		}else{
	            			System.out.println("申し訳ありません、aかbで入力して下さい");
	            		}
	            	}


	            		}else{

	            			break;
	            		}

				}
				return str2;
			}
			private static void totta() throws IOException {
				System.out.println("継続して作業を行いますか？ はい=a いいえ=b");
				BufferedReader br = new BufferedReader(new InputStreamReader(System. in));

        		String a = "a", b = "b";
            	while(true){
            		String toto = br.readLine();
            		if(toto.equals(a)){
            			System.out.println("メニューに戻ります");
            			break;
            		}else if(toto .equals(b)){
            				 System.out.println("終了します。お疲れ様でした");
            			     System.exit(0);
            		}else{
            			System.out.println("申し訳ありません、aかbで入力して下さい");

            		}
         //try
        	}
        //while
				}
        //}static void
}
//}main class

