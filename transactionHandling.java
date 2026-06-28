import java.sql.*;
import java.util.*;
import java.io.*;
public class transactionHandling {

    private static String url = "jdbc:mysql://localhost:3306/mydata";
    private static String username = "root";
    private static String password = "Supragya2006";

    public static void main(String[] args) throws SQLException{
        String debit ="UPDATE bank_accounts SET balance = balance - 10000 WHERE account_No = ?";
        String credit ="UPDATE bank_accounts SET balance = balance + 10000 WHERE account_No = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully !!!");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            con.setAutoCommit(false);
            PreparedStatement withdraw = con.prepareStatement(debit);
            withdraw.setString(1,"123456789876 ");
            PreparedStatement deposit = con.prepareStatement(credit);
            deposit.setString(1,"123456789000");
            int widrw= withdraw.executeUpdate();
            int dpst = deposit.executeUpdate();
            if(widrw >0 && dpst>0){
                con.commit();
                System.out.println("Transaction Successfull !!!");
            }
            else{
                con.rollback();
                System.out.println("Transaction Failed !!!");
            }
            withdraw.close();
            deposit.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
