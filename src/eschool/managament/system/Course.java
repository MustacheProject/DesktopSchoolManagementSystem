/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eschool.managament.system;

import java.util.Date;
import sun.awt.SunHints;

/**
 *
 * @author Eugenio
 * This class contain the details of the course
 * the ID identify the specific course.
 */
public class Course {
    String  courseName;
    int courseId;
    String beginningDate;
    String finishingDate;
    int fee;
    
    public Course(String courseName, int courseId, String beginningDate, String finishingDate,int fee){
        this.courseName=courseName;
        this.courseId=courseId;
        this.beginningDate=beginningDate;
        this.finishingDate=finishingDate;
        this.fee=fee;
    }
    
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(String beginningDate) {
        this.beginningDate = beginningDate;
    }

    public String getFinishingDate() {
        return finishingDate;
    }

    public void setFinishingDate(String finishingDate) {
        this.finishingDate = finishingDate;
    }
    
    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

}
