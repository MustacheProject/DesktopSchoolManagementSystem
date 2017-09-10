/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eschool.managament.system;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Eugenio
 * This class in the basic class for all the member of the school.
 * Contain the basic parameters included the IpAddress and the Port Number
 * for the chat service.
 * BOOLEAN STUDENT = true it's a student
 * BOOLEAN TEACHER = true it's a teacher, FALSE it's a office worker
 * UNIQUE ID =  FIRST NUMBER 1 or 2 = STUDENT
 *              FIRST NUMBER 3 or 4 = TEACHER
 *              FIRST NUMBER 5 or 6 = OFFICE WORKER
 */
public class Person {
    
    
    String name;
    String surname;
    String dob;
    String address;
    String mobile;
    String uniqueId;
    String ipAddress;
    int portNumber;
    boolean student;
    boolean teacher;
    int courseId;
    int newCourse;
    String password;
    
    
    public Person(String name, String surname, String date, String address, String mobile,
            String uniqueId, String ipAddress,int portNumber,boolean student,boolean teacher,int courseId,String password){
        this.name=name;
        this.surname=surname;
        this.dob=date;
        this.address=address;
        this.mobile=mobile;
        this.uniqueId=uniqueId;
        this.ipAddress=ipAddress;
        this.portNumber=portNumber;
        this.student=student;
        this.teacher=teacher;
        this.courseId=courseId;
        this.password=password;
    }
    
    
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    
      public String getIdAddress() {
        return ipAddress;
    }

    public void setIdAddress(String idAddress) {
        this.ipAddress = idAddress;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }
     public boolean isTeacher() {
        return teacher;
    }

    public void setTeacher(boolean teacher) {
        this.teacher = teacher;
    }
    
      public int getNewCourse() {
        return newCourse;
    }

    public void setNewCourse(int newCourse) {
        this.newCourse = newCourse;
    }
    
}
