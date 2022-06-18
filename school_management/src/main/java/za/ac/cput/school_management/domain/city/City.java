package za.ac.cput.school_management.domain.city;

import java.util.Objects;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
City.java
*/
public class City {

    private final String id;
    private final String name;
    private final Country country;

    private City(Builder builder) {

        this.id = builder.id;
        this.name = builder.name;
        this.country = builder.country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder {

        private String id;
        private String name;
        private Country country;

        public Builder setId(String id) {
            this.id = id;
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
            this.id = city.id;
            this.name = city.name;
            this.country = city.country;
            return this;
        }

        public City build() {
            return new City(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Builder builder = (Builder) o;
            return id == builder.id && name == builder.name && country.equals(builder.country);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, country);
        }
    }
}
