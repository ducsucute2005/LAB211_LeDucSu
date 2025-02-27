/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6_ex2_model;

/**
 *
 * @author selu3
 */
public class Contact {

    private int id;
    private String fullName;
    private String firstName;
    private String LastName;
    private String group;
    private String address;
    private String phoneNum;

    public Contact() {
    }

    public Contact(int id, String fullName, String group, String address, String phoneNum) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", fullName=" + fullName + ", firstName=" + firstName + ", LastName=" + LastName + ", group=" + group + ", address=" + address + ", phone=" + phoneNum + '}';
    }
    
    

}
