package dao;

import java.util.List;
import java.util.Map;

import entity.Student;

public interface IStudentDao {
  
    //将查询对象封装到Student对象中，测试if动态拼接字符串
    List<Student>  selectStudentByIf(Student student);
    
    //测试Where动态拼接字符串
    List<Student>  selectStudentByWhere(Student student);
    
    //测试choose动态拼接字符串
    List<Student>  selectStudentByChoose(Student student);
    
    //测试传入是数组的foreach动态拼接字符串
    List<Student>  selectStudentByForeach(int[]  a);
    
    //测试传入是List的foreach动态拼接字符串
    List<Student>  selectStudentByForeach2(List  a);
    } 
