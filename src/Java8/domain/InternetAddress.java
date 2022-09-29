/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8.domain;

/**
 * @author krishna
 */
public class InternetAddress {
    private String emailAddress;

    public InternetAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return emailAddress;
    }
    
    
}
