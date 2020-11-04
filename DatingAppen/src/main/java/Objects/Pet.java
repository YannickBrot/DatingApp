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
}
