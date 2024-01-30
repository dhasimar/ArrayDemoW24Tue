/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemow24tue;

/**
 *
 * @author simar
 */
public class PartTimeStudent extends Student {
    private int numOfCourses;
    
    public PartTimeStudent(int numOfCourses, int sid, String sname) {
        super(sid, sname);
        this.numOfCourses = numOfCourses;
    }

    /**
     * @return the numOfCourses
     */
    public int getNumOfCourses() {
        return numOfCourses;
    }

    /**
     * @param numOfCourses the numOfCourses to set
     */
    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
    
}
