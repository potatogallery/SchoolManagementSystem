package za.ac.cput.school_management.domain.city;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
Country.java
*/
public class Country {

    private String countryId;
    private String name;

    public Country() {

    }

    private Country(Builder builder) {

        this.countryId = builder.countryId;
        this.name = builder.name;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId='" + countryId + '\'' +
                ", name=" + name +
                '}';
    }

    public static class Builder {

        private String countryId;
        private String name;

        public Builder setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Country country) {
            this.countryId = country.countryId;
            this.name = country.name;
            return this;
        }

        public Country build() {
            return new Country(this);
        }
    }
}
