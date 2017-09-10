/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eschool.managament.system;

import java.util.LinkedList;

/**
 *
 * @author Eugenio
 */
public class CourseList {
     static LinkedList<Course> courseList = new LinkedList<Course>();
 
    public void add(Course newCourse){
        courseList.add(newCourse);
        
    }
    
    public String getNameCourseFromCode (int courseCode){
        for(int i=0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseId()==courseCode)
                return courseList.get(i).getCourseName();
        }
        return "NotFound" ;
    }
    
    public int getCodeFromName (String name){
        for(int i=0; i<courseList.size(); i++){
            if(courseList.get(i).getCourseName().equals(name)){
                return courseList.get(i).getCourseId();
            }
        }
        return 0;
    }
    
    
    public String[] getCourseList(){
        String [] list = new String[courseList.size()+1];
        String firstLine ="No course enrolled";
        list[0]=firstLine;
        for (int i=0; i<courseList.size();i++)
            list[i+1]=courseList.get(i).getCourseName();
        return list;
        
    }    
    
    public String[] getCourseListWithCode(){
        String [] list = new String[courseList.size()];
        for (int i=0; i<courseList.size();i++)
            list[i]=courseList.get(i).getCourseId() +" - "+courseList.get(i).getCourseName();
        return list;
        
    }
    
    public Course getCourseDetail(String name){
        Course c;
        for (int i = 0; i < courseList.size(); i++) {
            if (courseList.get(i).getCourseName().equals(name)) {
                return courseList.get(i);
                
            }
        }
        return null;
    }   
    
    public boolean checkCourseIdisFree(int newCourseId){
       for (int i=0; i<courseList.size();i++)
           if(courseList.get(i).getCourseId()==newCourseId)
               return false;
       return true;
    }
    
    public void updateCourse(Course c){
        for (int i=0; i<courseList.size();i++)
            if(courseList.get(i).getCourseId()==c.getCourseId()){             
                courseList.set(i, c);
            }
    }
    
    public void deleteCourse(int id){
         for (int i=0; i<courseList.size();i++)
             if(courseList.get(i).getCourseId()==id)
                 courseList.remove(i);
    }
}
