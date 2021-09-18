package com.prger.bean;

public class Contact extends Bean{
    private String name;
    private String email;
    private String comment;
    private String subject;
    private Integer alreadyRead;

    public Contact() {
    }

    public Contact(String name, String email, String comment, String subject, Integer alreadyRead) {
        this.name = name;
        this.email = email;
        this.comment = comment;
        this.subject = subject;
        this.alreadyRead = alreadyRead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getAlreadyRead() {
        return alreadyRead;
    }

    public void setAlreadyRead(Integer alreadyRead) {
        this.alreadyRead = alreadyRead;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                ", subject='" + subject + '\'' +
                ", alreadyRead=" + alreadyRead +
                '}';
    }
}
