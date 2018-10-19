package twodo.twodo.dto.model;

import com.google.gson.annotations.SerializedName;

public class EMatch {
    @SerializedName("id") private int id;
    @SerializedName("status_user_1") private int statusUser1;
    @SerializedName("status_user_2") private int statusUser2;
    @SerializedName("date") private String date;
    @SerializedName("user_id_1") private int userId1;
    @SerializedName("user_id_2") private int userId2;
    @SerializedName("category_id") private int categoryId;
    @SerializedName("firstname") private String firstname;
    @SerializedName("lastname") private String lastname;
    @SerializedName("phone") private String phone;
    @SerializedName("email") private String email;
    @SerializedName("address") private String address;

    public EMatch(int id, int statusUser1, int statusUser2, String date, int userId1, int userId2, int categoryId, String firstname, String lastname, String phone, String email, String address) {
        this.id = id;
        this.statusUser1 = statusUser1;
        this.statusUser2 = statusUser2;
        this.date = date;
        this.userId1 = userId1;
        this.userId2 = userId2;
        this.categoryId = categoryId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public EMatch() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatusUser1() {
        return statusUser1;
    }

    public void setStatusUser1(int statusUser1) {
        this.statusUser1 = statusUser1;
    }

    public int getStatusUser2() {
        return statusUser2;
    }

    public void setStatusUser2(int statusUser2) {
        this.statusUser2 = statusUser2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
}

