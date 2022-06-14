package za.ac.cput.school_management.domain.city;
/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
City.java
*/
public class City {

    private String cityId;
    private String name;
    private Country country;

    public City() {

    }

    private City(Builder builder) {

        this.cityId = builder.cityId;
        this.name = builder.name;
        this.country = builder.country;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", name=" + name + '\'' +
                ", country=" + country +
                '}';
    }

    public static class Builder {

        private String cityId;
        private String name;
        private Country country;

        public Builder setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCountry(Country country) {
            this.country = country;
            return this;
        }

        public Builder copy(City city) {
            this.cityId = city.cityId;
            this.name = city.name;
            this.country = city.country;
            return this;
        }

        public City build() {
            return new City(this);
        }
    }
}
