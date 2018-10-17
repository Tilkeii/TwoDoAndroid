package twodo.twodo.dto.model;

import com.google.gson.annotations.SerializedName;

public class EUser {
    @SerializedName("id") private int id;
    @SerializedName("firstname") private String firstname;
    @SerializedName("lastname") private String lastname;
    @SerializedName("email") private String email;
    @SerializedName("phone") private String phone;
    @SerializedName("picture") private String picture;
    @SerializedName("address") private String address;

    public EUser(int id, String firstname, String lastname, String email, String phone, String picture, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.picture = picture;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
