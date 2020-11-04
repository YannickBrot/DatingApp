package Objects;

import java.time.LocalDate;

public class Pet {
    private int id;
    private String name;
    private String type;
    private String description;
    private String gender;
    private String sexualOrientation;
    private int userId;

    public Pet(int id, String name, String type, String description, String gender, String sexualOrientation, int userId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.gender = gender;
        this.sexualOrientation = sexualOrientation;
        this.userId = userId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
