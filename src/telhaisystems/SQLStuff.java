/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telhaisystems;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Nitzan
 */
public class SQLStuff {
    public static List<Student> getAcademyStuFromSQL() //pull list of aca students
    {
        List<Student> lst=new ArrayList<>();
        try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="SELECT * from student where WhichCollege = 'Academy'";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next())
        {
            Student temp=new Student(rs.getString("WhichCollege"),rs.getString("Name"),rs.getString("Id"),rs.getString("Subject"),rs.getInt("StudyYears"));
            System.out.println(temp.Name+" "+temp.Id+" "+temp.getCollege());
            lst.add(temp);
        }
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
         return lst;
    }
    
    public static List<Student> getTechnologyStuFromSQL() //pull list of tech students
    {
        List<Student> lst=new ArrayList<>();
        try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="SELECT * from student where WhichCollege = 'Technology'";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next())
        {
            Student temp=new Student(rs.getString("WhichCollege"),rs.getString("Name"),rs.getString("Id"),rs.getString("Subject"),rs.getInt("StudyYears"));
            System.out.println(temp.Name+" "+temp.Id+" "+temp.getCollege());
            lst.add(temp);
        }
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
         return lst;
    }
    
    public static List<Teacher> getAcademyTeachFromSQL() // pull academy teacher list from db
    {
        List<Teacher> lst=new ArrayList<>();
        try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="SELECT * from aca_teacher";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next())
        {
            Teacher temp=new Teacher(rs.getString("WhichCollege"),rs.getString("Name"),rs.getString("Id"),rs.getString("Subject"));
            System.out.println(temp.Name+" "+temp.Id+" "+temp.getCollege());
            lst.add(temp);
        }
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
         return lst;
    }
    public static List<Teacher> getTechnologyTeachFromSQL() // pull tech teacher list from db
    {
       List<Teacher> lst=new ArrayList<>();
        try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="SELECT * from tech_teacher";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next())
        {
            Teacher temp=new Teacher(rs.getString("WhichCollege"),rs.getString("Name"),rs.getString("Id"),rs.getString("Subject"));
            System.out.println(temp.Name+" "+temp.Id+" "+temp.getCollege());
            lst.add(temp);
        }
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
         return lst;
    }
    public static void setAcademyStudentToSQL(Student toAdd) //idkun ba sql
    {
         try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="INSERT INTO student VALUES("+"'"+toAdd.getId()+"'"+","+"'"+toAdd.getName()+"'"+","+"'"+toAdd.getSub()+"'"+","+"'"+toAdd.getCollege()+"'"+","+toAdd.getYears()+")";
        Statement st=conn.createStatement();
        st.execute(query);
       // ResultSet rs=st.executeQuery(query);
        
        
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
    }
    
    public static void setAcademyTeachToSQL(Teacher toAdd) //idkun ba sql
    {
         try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="INSERT INTO aca_teacher VALUES("+"'"+toAdd.getId()+"'"+","+"'"+toAdd.getName()+"'"+","+"'"+toAdd.getSub()+"'"+","+"'"+toAdd.getCollege()+"')";
        Statement st=conn.createStatement();
        st.execute(query);
       // ResultSet rs=st.executeQuery(query);
        
        
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
    }
    public static void setTechnologyTeachToSQL(Teacher toAdd) //idkun ba sql
    {
         try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="INSERT INTO tech_teacher VALUES("+"'"+toAdd.getId()+"'"+","+"'"+toAdd.getName()+"'"+","+"'"+toAdd.getSub()+"'"+","+"'"+toAdd.getCollege()+"')";
        Statement st=conn.createStatement();
        st.execute(query);
       // ResultSet rs=st.executeQuery(query);
        
        
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
    }
    
    public static boolean removeStudentFromSQL(String ID)
    {
         try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        
        String query="DELETE FROM student WHERE ID='"+ID+"'";
        Statement st=conn.createStatement();
        st.execute(query);
        return true;
        
        
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
            return false;
        }
    }
    public static boolean removeTeachFromSQL(String ID,int WhichCollege)
        //the int is internal for us to check which college to delete from the DB , and to prevent junk code  
        // by NOT adding another func to remove
        // 0 - is academy , 1 (or else in my case) - is technology
    {
         try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        String query;
        if(WhichCollege == 0) //if academy
            query="DELETE FROM aca_teacher WHERE ID='"+ID+"'";
        else //if technology
            query="DELETE FROM tech_teacher WHERE ID='"+ID+"'";
        Statement st=conn.createStatement();
        st.execute(query);
       return true;
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
            return false;
        }
    }
    
     public static int getLoginFromSQL(String username,String password) // pull login
    {
         // prmission 0 is academy
         //permission 1 is technology
         //permission 2 is both!
       List<User> lst=new ArrayList<>();
       int permissionToReturn=-1;
        try{
        Connection conn;
        String server="jdbc:mysql://localhost:3306/telhaiproj";
        String user="root";
        String pass="root";
        conn=DriverManager.getConnection(server, user, pass);
        System.out.println("Success");
        System.out.println("Debug "+username+" "+password);
        String query="SELECT * from users WHERE username='"+username+"'"+" and pass='"+password+"'";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        
        while(rs.next())
        {
            User temp=new User(rs.getString("username"),rs.getString("pass"),rs.getInt("permission"));
            System.out.println(temp.username+" "+temp.password);
            if(rs.getInt("permission")==0)
                permissionToReturn=0;
            else if(rs.getInt("permission")==1)
                permissionToReturn=1;
            else if(rs.getInt("permission")==2)
                permissionToReturn=2;
            System.out.println(temp.username+" "+temp.password+" "+temp.permission);
            lst.add(temp);
        }
        
       
        
        }
        catch(SQLException e)
        {
            System.out.println("Failed with "+e);
        }
         return permissionToReturn;
    }
}
