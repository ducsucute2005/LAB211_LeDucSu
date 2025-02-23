/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5_ex1_model;

/**
 *
 * @author selu3
 */
public class OnlineCourse extends Course {

    private String platform;
    private String instructors;
    private String note;

    

    public OnlineCourse(String courseID, String courseName, int credits,String platform, String instructors, String note) {
        super(courseID, courseName, credits);
        this.platform = platform;
        this.instructors = instructors;
        this.note = note;
    }
    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }
    

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + "platform=" + platform + ", instructors=" + instructors + ", note=" + note + '}';
    }
}
