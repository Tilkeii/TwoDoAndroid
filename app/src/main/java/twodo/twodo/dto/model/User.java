package twodo.twodo.model;

import java.util.ArrayList;

public class User {

    public static final String ID_FIELD = "id";
    public static final String FIRSTNAME_FIELD = "firstname";
    public static final String LASTNAME_FIELD = "lastname";
    public static final String PHONE_FIELD = "phone";
    public static final String EMAIL_FIELD = "email";
    public static final String ADDRESS_FIELD = "address";
    public static final String PASSWORD_FIELD = "password";
    public static final String OFFER_CATEGORIES_FIELD = "offerCategories";
    public static final String OFFER_DESCRIPTIONS_FIELD = "offerDescriptions";
    public static final String SEARCH_CATEGORY_FIELD = "searchCategory";
    public static final String MATCHES_FIELD = "matches";
    public static final String PICTURE_FIELD = "picture";

    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String address;
    private String password;
    private ArrayList<String> offerCategories;
    private ArrayList<String> offerDescriptions;
    private String searchCategory;
    private ArrayList matches;
    private String picture;

    private User(int id, String firstname, String lastname, String phone, String email, String address, String password, ArrayList<String> offerCategories, ArrayList<String> offerDescriptions, String searchCategory, ArrayList matches, String picture) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.password = password;
        this.offerCategories = offerCategories;
        this.offerDescriptions = offerDescriptions;
        this.searchCategory = searchCategory;
        this.matches = matches;
        this.picture = picture;
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

    public ArrayList<String> getOfferCategories() {
        return offerCategories;
    }

    public void setOfferCategories(ArrayList<String> offerCategories) {
        this.offerCategories = offerCategories;
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
}
