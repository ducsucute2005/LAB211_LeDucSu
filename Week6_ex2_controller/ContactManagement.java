/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6_ex2_controller;

/**
 *
 * @author selu3
 */
import Week6_ex2_view.Menu;
import Week6_ex2_model.Contact;
import java.util.*;

public class ContactManagement {

    private List<Contact> contactList = new ArrayList<>();
    int id = 1;

    public void splitName(String fullName) {
        String[] parts = fullName.split(" ", 2);
        String firstName = parts[0];
        String lastName = parts.length > 1 ? parts[1] : "";
    }

    public void addContact(String fullName, String group, String address, String phoneNum) {
        phoneFormat(phoneNum);
        contactList.add(new Contact(id++, fullName, group, address, phoneNum));
    }

    public void display() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    public void deleteAContact(int id) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getId() == id) {
                contactList.remove(i);
                System.out.println("Delete completed");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void phoneFormat(String phoneNum) {
        String extension = "";
        if (phoneNum.contains("ext")) {
            String[] parts = phoneNum.split("ext");
            phoneNum = parts[0].trim();
            extension = "ext" + parts[1].trim();
        } else if (phoneNum.contains("x")) {
            String[] parts = phoneNum.split("x");
            phoneNum = parts[0].trim();
            extension = "x" + parts[1].trim();
        }
        phoneNum = phoneNum.replace("-", "").replace(".", "").replace(" ", "");

        if (phoneNum.length() == 10 && phoneNum.matches("\\d+")) {
            System.out.println("true");
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
    }
}
