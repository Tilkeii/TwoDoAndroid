package twodo.twodo.dto.model;

import java.util.ArrayList;

public class User {

    public static final String ID_FIELD = "id";
    public static final String FIRSTNAME_FIELD = "firstname";
    public static final String LASTNAME_FIELD = "lastname";
    public static final String PHONE_FIELD = "phone";
    public static final String EMAIL_FIELD = "email";
    public static final String ADDRESS_FIELD = "address";
    public static final String PASSWORD_FIELD = "password";
    public static final String OFFER_CATEGORY_FIELD = "offerCategories";
    public static final String OFFER_CATEGORIES_FIELD = "offerCategories";
    public static final String OFFER_DESCRIPTION_FIELD = "offerDescriptions";
    public static final String OFFER_DESCRIPTIONS_FIELD = "offerDescriptions";
    public static final String SEARCH_CATEGORY_FIELD = "searchCategory";
    public static final String MATCHES_FIELD = "matches";
    public static final String PICTURE_FIELD = "picture";
    public static final String DATE_FIELD = "date";
    public static final String AGE_FIELD = "age";

    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String address;
    private String password;
    private String offerCategory;
    private ArrayList<String> offerCategories;
    private String offerDescription;
    private ArrayList<String> offerDescriptions;
    private String searchCategory;
    private ArrayList matches;
    private String picture;
    private String date;
    private int age;

    public User(int id, String firstname, String lastname, String phone, String email, String address, String password, String offerCategory, ArrayList<String> offerCategories, String offerDescription, ArrayList<String> offerDescriptions, String searchCategory, ArrayList matches, String picture, String date, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.offerCategory = offerCategory;
        this.offerCategories = offerCategories;
        this.offerDescription = offerDescription;
        this.offerDescriptions = offerDescriptions;
        this.searchCategory = searchCategory;
        this.matches = matches;
        this.picture = picture;
        this.date = date;
        this.age = age;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOfferCategory() {
        return offerCategory;
    }

    public void setOfferCategory(String offerCategory) {
        this.offerCategory = offerCategory;
    }

    public ArrayList<String> getOfferCategories() {
        return offerCategories;
    }

    public void setOfferCategories(ArrayList<String> offerCategories) {
        this.offerCategories = offerCategories;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public ArrayList<String> getOfferDescriptions() {
        return offerDescriptions;
    }

    public void setOfferDescriptions(ArrayList<String> offerDescriptions) {
        this.offerDescriptions = offerDescriptions;
    }

    public String getSearchCategory() {
        return searchCategory;
    }

    public void setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
    }

    public ArrayList getMatches() {
        return matches;
    }

    public void setMatches(ArrayList matches) {
        this.matches = matches;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
