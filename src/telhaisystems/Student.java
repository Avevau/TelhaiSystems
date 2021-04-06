/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telhaisystems;

/**
 *
 * @author Nitzan
 */
public class Student extends Abstract {
    private String whichCollege;
    private String Subject;
    private int studyYears;
    
    
    public Student(String _which,String _name,String _id,String _sub,int _years)    
    {
        super(_name,_id);
        this.whichCollege=_which;
        this.Subject=_sub;
        this.studyYears=_years;
        
    }
    public Student(Student stu)
    {
        this.Id=stu.Id;
        this.Name=stu.Name;
        this.Subject=stu.Subject;
        this.whichCollege=stu.whichCollege;
        this.studyYears=stu.studyYears;
    }
    
    public String getName()
    {
      return this.Name;
    }
    public String getCollege()
    {
        return this.whichCollege;
    }
    public String getId()
    {
        return this.Id;
    }
    public String getSub()
    {
        return this.Subject;
    }
    public int getYears()
    {
        return this.studyYears;
    }
    public void setName(String _name)
    {
        this.Name=_name;
    }
    public void setId(String _id)
    {
        this.Id=_id;
    }
    public void setYears(int _years)
    {
        this.studyYears=_years;
    }
    public void setCollege(String _col)
    {
        this.whichCollege=_col;
    }
    public void setSub(String _sub)
    {
        this.Subject=_sub;
    }
}
