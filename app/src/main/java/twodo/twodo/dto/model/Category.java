package twodo.twodo.dto.model;

public class Category {
    public static final String ID_FIELD = "id";
    public static final String NAME_FIELD = "name";

    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(Category cat) {
        this.id = cat.id;
        this.name = cat.name;
    }

    public Category(){
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

    @Override
    public String toString() {
        return this.name;
    }
}
