package Controllers;

import Objects.Pet;
import Objects.User;

import java.util.ArrayList;

public class Match {
    private JDBCWriter jdbcWriter = new JDBCWriter();

    private ArrayList<User> getMatches (User user, Pet pet){
        ArrayList<User> users = jdbcWriter.getUsers();
        ArrayList<Pet> pets = jdbcWriter.getPets();
        ArrayList<Pet> petMatches = new ArrayList<>();
        ArrayList<User> matches = new ArrayList<>();


        if (pet.getGender().equals("Male") && pet.getSexualOrientation().equals("Hetero")){
            for (Pet p : pets) {
                if (p.getGender().equals("Female") && p.getSexualOrientation().equals("Hetero")){

                }
            }
        }

        return matches;

    }
}
