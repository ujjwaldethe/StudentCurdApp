package JDBC_CURD_APP_Persistance;

import JDBC.JDBCStandardApp2;
import JDBC_CURD_APP_dto.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Persistance Logic USing JDBC API
public class StudentDaompl implements IstudentDao{
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public String addStudent(String sname, Integer sage, String address) {
        try {
            conn = JDBCStandardApp2.getJDBCConnection();
            String sqlInsertQuery  = "Insert into students (`name`,`age`,`address`) values (?,?,?)";
            if(conn!=null)
            {
                ps = conn.prepareStatement(sqlInsertQuery);
            }
            if(ps!=null)
            {
                ps.setString(1,sname);
                ps.setInt(2,sage);
                ps.setString(3,address);

                int rowAffected= ps.executeUpdate();
                if(rowAffected==1)
                {
                    return "Success";
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "Failed";
    }

    @Override
    public Student searchStudent(Integer id) {
        try {
            conn = JDBCStandardApp2.getJDBCConnection();
            String sqlInsertQuery  = "select id,name, age, address from students where id=? ";
            if(conn!=null)
            {
                ps = conn.prepareStatement(sqlInsertQuery);
            }
            if(ps!=null)
            {
                ps.setInt(1,id);
                rs = ps.executeQuery();
            }
            if(rs!=null)
            {
                Student s = null;
                if(rs.next())
                {
                    s = new Student();
                    s.setSid(rs.getInt(1));
                    s.setName(rs.getString(2));
                    s.setSage(rs.getInt(3));
                    s.setSaddress(rs.getString(4));
                    return s;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

       return null;
    }


    @Override
    public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
        return null;
    }

    @Override
    public String deleteStudent(Integer sid) {
        return "";
    }
}
