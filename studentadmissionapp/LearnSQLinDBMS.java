/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentadmissionapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnSQLinDBMS {
    public static void main(String[] args) {
        Connection con = DatabaseConnection.connect();
        /*
            Creating tables
        */
        String sql = "CREATE TABLE user_data(id int,name varchar(20))";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();    
        } catch (SQLException ex) {
            System.out.println("Exception Occured");
        }
        /*
            Inserting values
        */
      /*  Scanner sc = new Scanner(System.in);
        String id,name;
        try{
        while(true){
            id = sc.next();
            name = sc.next();
            sql = "INSERT INTO user_data values(?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, name);
            System.out.println(ps.executeUpdate());
            con.commit();
            System.out.println("Do you want to enter more(Y/N)");
            if(sc.next().equals("N"))
                break;
        }
        }catch(SQLException e){
        
        }
        */
        /*
            Reading Data from table
        */
        try{
            sql = "SELECT * from user_data";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                System.out.println("ID:- "+rs.getString(1)+" Name:- "+rs.getString(2));
            }
        
        }catch(SQLException e){
        
        }
    }
}
