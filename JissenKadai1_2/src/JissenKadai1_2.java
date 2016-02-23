import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JissenKadai1_2 {
  public static void main(String[] args) {
        String msg = "";
        try {
        	Driver d = new Driver();

        	System.out.println("JDBCに接続できました！");
        }catch (Exception e){
            msg = "JDBC接続に失敗しました";
            System.out.println(msg);
        }

        String mesg = "";{
            try {
                // ドライバロード
                Class.forName("org.gjt.mm.mysql.Driver");

                // MySQLに接続
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "mysql");

                // ステートメント生成
                Statement stmt = con.createStatement();

                // SQLを実行
                String sqlStr = "SELECT * FROM test_table";
                ResultSet rs = stmt.executeQuery(sqlStr);

                // 結果行をループ
                while(rs.next()){
                    // レコードの値
                    int id = rs.getInt("user_id");
                    String name = rs.getString("user_name");

                    //表示
                    System.out.println(id + "：" + name);
                }

                // 接続を閉じる
                rs.close();
                stmt.close();
                con.close();

                System.out.println("値を取得しました");
            }catch (ClassNotFoundException e){
                mesg = "ドライバのロードに失敗しました";
                System.out.println(mesg);
            }catch (Exception e){
                mesg = "ドライバのロードに失敗しました";
                System.out.println(mesg);
            }
      }




      }



  }



