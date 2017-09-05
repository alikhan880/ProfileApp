package kz.kbtu.profileapp;

/**
 * Created by abakh on 05-Sep-17.
 */

public class Profile {
    private String name;
    private String surname;
    private String identifier;
    private String number;
    private String email;
    private String email2;
    private String address;
    private String url;


    public Profile(String name, String surname, String identifier, String number, String email, String email2, String address, String url) {
        this.name = name;
        this.surname = surname;
        this.identifier = identifier;
        this.number = number;
        this.email = email;
        this.email2 = email2;
        this.address = address;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getAddress() {
        return address;
    }

    public String getUrl() {
        return url;
    }
}
