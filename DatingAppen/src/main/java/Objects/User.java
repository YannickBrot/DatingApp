package Objects;

import java.time.LocalDate;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String mail;
    private int phoneNumber;
    private String description;
    private String photo;
    private String username;
    private String gender;
    private String sexualOrientation;

    public User(int id, String firstName, String lastName, LocalDate dateOfBirth, String mail, int phoneNumber, String description, String photo, String username, String gender, String sexualOrientation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.photo = photo;
        this.username = username;
        this.gender = gender;
        this.sexualOrientation = sexualOrientation;
    }
}
