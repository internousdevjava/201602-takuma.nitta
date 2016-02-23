
import com.mysql.jdbc.Driver;

public class JissenKadai1_1 {
  public static void main(String[] args) {
        String msg = "";
        try {
        	Driver d = new Driver();

        	System.out.println("JDBCに接続できました！");
        }catch (Exception e){
            msg = "JDBC接続に失敗しました";
            System.out.println(msg);
        }
  }
}