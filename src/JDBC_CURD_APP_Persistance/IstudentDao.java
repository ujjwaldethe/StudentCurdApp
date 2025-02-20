package JDBC_CURD_APP_Persistance;

import JDBC_CURD_APP_dto.Student;

public interface IstudentDao {
    public String addStudent(String sname,Integer sage,String address);
    public Student searchStudent(Integer id);
    public String updateStudent(Integer sid,String sname,Integer sage,String saddress);
    public String deleteStudent(Integer sid);
}
