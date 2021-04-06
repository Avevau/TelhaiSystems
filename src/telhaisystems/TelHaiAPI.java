/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telhaisystems;

import java.util.List;

/**
 *
 * @author Nitzan and Daniel
 */
public interface TelHaiAPI {
void RemoveTeacher(List <Teacher> TeacherList);

void AddStudent();
void RemoveStudent(List <Student> StudentList);
}
