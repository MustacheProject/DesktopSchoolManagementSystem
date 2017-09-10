package eschool.managament.system;


import eschool.managament.system.Person;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class PersonList {
    static LinkedList<Person> personList = new LinkedList<Person>();

    static int personLogged; // with this variable I can now the index of the person
                        //who's currently connecter
 
    public void add(Person newPerson){
        personList.add(newPerson);
        
    }
    
    public Person getPersonFromIndex (int index){
        Person p=personList.get(index);
        return p;
    }
    
    public Person getPersonFromUniqueId (String intid){
        for(int i=0;i<personList.size();i++){
            if(personList.get(i).getUniqueId().equals(intid))
                return personList.get(i);
        }
        return null;
    }
    
    public int checkLoginDetail ( String userName, String password){
        int idFound= -5;
        for(int i=0; i<personList.size() && idFound==-5;i++){
            if(personList.get(i).getUniqueId().equals(userName)){
                if(personList.get(i).getPassword().equals(password)){
                    idFound=i;
                    personLogged=i;
                }
            }
        }
        return idFound;
    }
    
    public int getPersonLogged() {
        return personLogged;
    }

    public void setPersonLogged(int personLogged) {
        this.personLogged = personLogged;
    }
    
    public void modifyElements(Person p){
        personList.get(personLogged).setName(p.getName());
        personList.get(personLogged).setSurname(p.getSurname());
        personList.get(personLogged).setDob(p.getDob());
        personList.get(personLogged).setMobile(p.getMobile());
        personList.get(personLogged).setPassword(p.getPassword());
        personList.get(personLogged).setAddress(p.getAddress());
        
    }
    
    
    public String teacherFromCourseCode(int code){
        for(int i=0;i<personList.size();i++)
            if(personList.get(i).getCourseId()==code && personList.get(i).isTeacher()==true)
                return personList.get(i).getUniqueId()+ "- "+personList.get(i).getName()+" "+personList.get(i).getSurname();
        return "Teacher not assigned yet";
        
    }
    
    public int getNewCourseCode(){
        return personList.get(personLogged).getNewCourse();
        
    }
   
    
    public boolean checkPswForChangeCourse(String newPassword){
        if(newPassword.equals(personList.get(personLogged).getPassword())){
            personList.get(personLogged).setCourseId(personList.get(personLogged).getNewCourse());
            return true;
            
        }else
            return false;
    }
    
    public String[] getStudentsList(){
        LinkedList <Person> studentList = new LinkedList<Person>();
        for (int i=0;i<personList.size();i++){
            if(personList.get(i).isStudent())
                studentList.add(personList.get(i));
        }
        String [] student = new String[studentList.size()];
            for (int i=0;i<studentList.size();i++){
               student[i]=studentList.get(i).getUniqueId() + "- "
                       +studentList.get(i).getName()+" "+studentList.get(i).getSurname();
            }
        return student;
    }
    
        public String[] getTeacherList(){
        LinkedList <Person> teacherList = new LinkedList<Person>();
        for (int i=0;i<personList.size();i++){
            if(personList.get(i).isTeacher())
                teacherList.add(personList.get(i));
        }
        String [] teacher = new String[teacherList.size()];
            for (int i=0;i<teacherList.size();i++){
               teacher[i]=teacherList.get(i).getUniqueId() + "- "
                       +teacherList.get(i).getName()+" "+teacherList.get(i).getSurname();
            }
        return teacher;
    }
    public Person getStudentFromId (String id){
        Person p;
        for(int i=0; i<personList.size();i++)
            if(id.equals(personList.get(i).getUniqueId()))
                return p=personList.get(i);
        return null;
    }
    
    public boolean checkNewIdIsFree(String newCode){
        for(int i=0;i<personList.size();i++)
            if(personList.get(i).getUniqueId().equals(newCode))
                return false;
        return true;
    }
    
    
        public void chageTeacher(int courseCode, String teacherId){
            String unicode;
            for(int i=0;i<personList.size();i++){
                unicode=personList.get(i).getUniqueId();
                if(unicode.equals(teacherId)){
                    personList.get(i).setCourseId(courseCode);
                    return;
                }    
            }    
        }
        public void chageTeacher(int courseCode, String teacherId, String oldTeacherId){
            String unicode;
            for(int i=0;i<personList.size();i++){
                unicode=personList.get(i).getUniqueId();
                if(unicode.equals(teacherId)){
                    personList.get(i).setCourseId(courseCode);
                    
                }else{
                    if(unicode.equals(oldTeacherId))
                        personList.get(i).setCourseId(0);
                }    
            }    
        }
        
        public boolean isAdmin(){
            int index = personLogged;
                if(personList.get(index).isStudent()==false && personList.get(index).isTeacher()==false)
                    return true;
                return false;
        }
        
        public void deleteUser(String idCode){
            String uniqueCode = personList.get(personLogged).getUniqueId();
            for(int i=0;i<personList.size();i++)
                if(personList.get(i).getUniqueId().equals(idCode))
                    personList.remove(i);
            
            for(int i=0;i<personList.size();i++)
                if(personList.get(i).getUniqueId().equals(uniqueCode))
                    setPersonLogged(i);
        }
        
        public String[] getFullList(){
            String[] list = new String[personList.size()];
            for(int i=0;i<personList.size();i++)
                list[i]=personList.get(i).getUniqueId() + "- "
                       +personList.get(i).getName()+" "+personList.get(i).getSurname();
            return list;
        }
        
        public Vector getListByName(String name){
            Vector < String> list = new Vector<String>();
            int j;
            for(int i=0;i<personList.size();i++){
                j=personList.get(i).getName().toLowerCase().indexOf(name.toLowerCase());
                if(j!=-1)
                    list.add(personList.get(i).getUniqueId() +" "
                            + ""+personList.get(i).getName()+" "+personList.get(i).getSurname());
            }
            return list;
        }
        
        //DA ELIMINARE SE USO LE LINKEDLIST
        
        public String[] getListForChat(){
            String[] list = new String[personList.size()];
            for(int i=0;i<personList.size();i++){
                String role;
                if(personList.get(i).isStudent()){
                    role="Student";
                }else{
                    if(personList.get(i).isTeacher()){
                        role="Teacher";
                    }else{
                        role="Administation";
                    }
                }
                list[i]=personList.get(i).getUniqueId() + "- "
                       +personList.get(i).getName()+" "+personList.get(i).getSurname() + " - "+role;
            }
            return list;
        }
        
        public LinkedList<Person> getLinkListForChat (){
            LinkedList <Person> l = new LinkedList<Person>();
            l= personList;
            l.remove(personLogged);
            return l;
        }
        
}
