package za.ac.cput.school_management.domain.city;

import java.util.Objects;

/*
Mogammad-Redar Behardien _ 216234107
ADP3 JUNE ASSIGNMENT
Country.java
*/
public class Country {

    private final String id;
    private final String name;

    private Country(Builder builder) {

        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }

    public static class Builder {

        private String id;
        private String name;

        public Builder setId(String id) {
            if (id == null) {
                this.id = "";
            } else {
                this.id = id;
            }
            return this;
        }

        public Builder setName(String name) {
            if (name == null) {
                this.name = "";
            } else {
                this.name = name;
            }
            return this;
        }

        public Builder copy(Country country) {
            if (country.id == null) {
                this.id = "";
            } else {
                this.id = country.id;
            }
            if (country.name == null) {
                this.name = "";
            } else {
                this.name = country.name;
            }
            return this;
        }

        public Country build() {
            return new Country(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Builder builder = (Builder) o;
            return id == builder.id && name == builder.name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id='" + id + '\'' +
                    ", name=" + name +
                    '}';
        }
    }
}
