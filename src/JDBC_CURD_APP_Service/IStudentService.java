package JDBC_CURD_APP_Service;

import JDBC_CURD_APP_dto.Student;

public interface IStudentService{
    public String addStudent(String sname,Integer sage,String address);
    public Student searchStudent(Integer id);
    public String updateStudent(Integer sid,String sname,Integer sage,String saddress);
    public String deleteStudent(Integer sid);
}
