package sk.itsovy.kutka;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "{notNullError}")
    @Size(min = 1, message = "{notNullError}")
    private String lastName;

    @NotNull(message = "{notNullError}")
    @Min(value = 0, message = "{freePassesMin}")
    @Max(value = 10, message = "{freePassesMax}")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "{regexError}")
    @NotNull(message = "{notNullError}")
    private String postalCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
