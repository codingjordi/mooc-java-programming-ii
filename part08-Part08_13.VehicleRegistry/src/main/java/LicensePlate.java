
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (this.liNumber == null ? 0 : this.liNumber.hashCode());
        result = 31 * result + (this.country == null ? 0 : this.country.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof LicensePlate)) {
            return false;
        }

        LicensePlate comparedObject = (LicensePlate) object;

        if (this.liNumber.equals(comparedObject.liNumber)
                && this.country.equals(comparedObject.country)) {
            return true;
        }

        return false;
    }
    

}
