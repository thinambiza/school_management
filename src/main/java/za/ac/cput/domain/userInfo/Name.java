/**
 Name.java
 Entity for the Name
 Author: Legiste Ndabashinze (217046207)
 Date: 15 June 2022
 */
package za.ac.cput.domain.userInfo;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Embeddable
public class Name {

    @NotNull private String firstName, middleName, lastName;

    protected Name() {
    }

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    public static class Builder {

        private String firstName, middleName, lastName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name) {
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Name builder = (Name) o;
            return firstName.equals(builder.firstName) && middleName.equals(builder.middleName) && lastName.equals(builder.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName);
        }

        public Name build() {
            return new Name(this);
        }

    }
}
