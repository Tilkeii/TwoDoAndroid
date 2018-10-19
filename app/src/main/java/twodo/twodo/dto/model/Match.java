package twodo.twodo.dto.model;

public class Match {

    public static final String ID_FIELD = "id";
    public static final String STATUS_USER_1_FIELD = "status_user_1";
    public static final String STATUS_USER_2_FIELD = "status_user_2";
    public static final String DATE_FIELD = "date";
    public static final String USER_ID_1_FIELD = "user_id_1";
    public static final String USER_ID_2_FIELD = "user_id_2";
    public static final String CATEGORY_ID_FIELD = "category_id";
    public static final String FIRSTNAME_FIELD = "firstname";
    public static final String LASTNAME_FIELD = "lastname";
    public static final String PHONE_FIELD = "phone";
    public static final String EMAIL_FIELD = "email";
    public static final String ADDRESS_FIELD = "address";

    private int id;
    private int statusUser1;
    private int statusUser2;
    private String date;
    private int userId1;
    private int userId2;
    private int categoryId;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String address;

    public Match(int id, int statusUser1, int statusUser2, String date, int userId1, int userId2, int categoryId, String firstname, String lastname, String phone, String email, String address) {
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

    public Match() {

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
