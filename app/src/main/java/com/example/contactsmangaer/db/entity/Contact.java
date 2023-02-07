package com.example.contactsmangaer.db.entity;

public class Contact {
    //1 - Contacts for Database
    public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_ID = "contact_id";
    public static final String COLUMN_EMAIL = "contact_email";

    //2 - Variables
    private String name;
    private String email;
    private int id;

    //3 - Constructor
    private Contact(){

    }

    private Contact(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;
    }

    //4 - Getters and Setters
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
