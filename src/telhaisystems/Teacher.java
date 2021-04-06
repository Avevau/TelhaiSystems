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
public class Teacher extends Abstract {
    private String whichCollege;
    private String Subject;
    
    public Teacher(String _which,String _name,String _id,String _sub)    
    {
        super(_name,_id);
        this.whichCollege=_which;
        this.Subject=_sub;
    }
    public Teacher(Teacher teach)
    {
        this.Id=teach.Id;
        this.Name=teach.Name;
        this.Subject=teach.Subject;
        this.whichCollege=teach.whichCollege;
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
    public void setName(String _name)
    {
        this.Name=_name;
    }
    public void setId(String _id)
    {
        this.Id=_id;
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
