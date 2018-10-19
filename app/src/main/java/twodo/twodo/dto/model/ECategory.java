package twodo.twodo.dto.model;

import com.google.gson.annotations.SerializedName;

public class ECategory {

    @SerializedName("id") private int id;
    @SerializedName("name") private String name;

    public ECategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ECategory() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
