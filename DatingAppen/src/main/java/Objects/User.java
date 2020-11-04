package Objects;

import java.time.LocalDate;
import java.time.Period;

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

    public class AgeCalculator {
        public  int calculateAge() {
            LocalDate currentDate = LocalDate.now();
            if ((dateOfBirth != null) && (currentDate != null)) {
                return Period.between(dateOfBirth, currentDate).getYears();
            } else {
                return 0;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
