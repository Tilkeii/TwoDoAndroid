package twodo.twodo.dto.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class EUser {

    @SerializedName("id") private int id;
    @SerializedName("firstname") private String firstname;
    @SerializedName("lastname") private String lastname;
    @SerializedName("phone") private String phone;
    @SerializedName("email") private String email;
    @SerializedName("address") private String address;
    @SerializedName("password") private String password;
    @SerializedName("offerCategories") private ArrayList<String> offerCategories;
    @SerializedName("offerDescriptions") private ArrayList<String> offerDescriptions;
    @SerializedName("searchCategory") private String searchCategory;
    @SerializedName("matches") private ArrayList matches;
    @SerializedName("picture") private String picture;

    public EUser(int id, String firstname, String lastname, String phone, String email, String address, String password, ArrayList<String> offerCategories, ArrayList<String> offerDescriptions, String searchCategory, ArrayList matches, String picture) {
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

    public EUser() {

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
