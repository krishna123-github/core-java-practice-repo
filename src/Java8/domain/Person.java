/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8.domain;

/**
 *
 * @author krishna
 */
public class Person {

    private String name, emailAddress;
    private Boolean newsletterOptedIn;
    private Integer age;

    public Person(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public Person(String name, String emailAddress, Boolean newsletterOptedIn) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.newsletterOptedIn = newsletterOptedIn;
    }

    public Person(String name, String emailAddress, Boolean newsletterOptedIn, Integer age) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.newsletterOptedIn = newsletterOptedIn;
        this.age = age;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean isNewsletterOptedIn() {
        return newsletterOptedIn;
    }

    public void setNewsletterOptedIn(Boolean newsletterOptedIn) {
        this.newsletterOptedIn = newsletterOptedIn;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
}
