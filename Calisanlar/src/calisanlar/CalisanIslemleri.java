
package calisanlar;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalisanIslemleri {
    private Connection con=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    
    public CalisanIslemleri(){
       String url="jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.db_ismi+"?useUnicode=true&characterEncoding=utf8";  //bağlanılacak db nin şekli
        
        try {
            con = (Connection) DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
       
    }
    public static void main(String[] args){
    CalisanIslemleri islemler=new CalisanIslemleri();
    
    
    }
}