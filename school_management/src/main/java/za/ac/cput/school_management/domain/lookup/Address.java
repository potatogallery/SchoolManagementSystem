/*
* Keallan Saunders 219169357
* ADP ASSIGNMENT JUNE 2022
* Address.java
* Due Date 18 June 2022 23:59
*
*/
package za.ac.cput.school_management.domain.lookup;

import java.util.Objects;

public class Address {
    private final String unitNumber, complexName, streetNumber,streetName,city;
    private final int postalCode;
/*NOTE POSTAL CODE MUST BE AS INTEGER*/
    private Address(Builder builder){
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;
    }

    public String getUnitNumber() {return unitNumber;}

    public String getComplexName() {return complexName;}

    public String getStreetNumber() {return streetNumber;}

    public String getStreetName() {return streetName;}

    public String getCity() {return city;}

    public int getPostalCode() {return postalCode;}

    public static class Builder {
        private String unitNumber, complexName, streetNumber,streetName,city;
        private int postalCode;
        public Builder unitNumber(String unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Builder complexName(String complexName) {
            this.complexName = complexName;
            return this;
        }

        public Builder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }
        public Builder postalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(Address address) {
            this.unitNumber = address.unitNumber;
            this.complexName = address.complexName;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.city = address.city;
            this.postalCode = address.postalCode;
            return this;
        }
        public Address build() {return new Address(this);}


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return postalCode == builder.postalCode && unitNumber.equals(builder.unitNumber) && complexName.equals(builder.complexName) && streetNumber.equals(builder.streetNumber) && streetName.equals(builder.streetName) && city.equals(builder.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(unitNumber, complexName, streetNumber, streetName, city, postalCode);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "unitNumber='" + unitNumber + '\'' +
                    ", complexName='" + complexName + '\'' +
                    ", streetNumber='" + streetNumber + '\'' +
                    ", streetName='" + streetName + '\'' +
                    ", city='" + city + '\'' +
                    ", postalCode=" + postalCode +
                    '}';
        }
    }






















}
