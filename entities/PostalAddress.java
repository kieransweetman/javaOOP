package entities;

public class PostalAddress {
    int houseNum;
    String roadName;
    int postalCode;
    String city;

    public PostalAddress(int houseNum, String roadName, int postalCode, String city) {
        this.houseNum = houseNum;
        this.roadName = roadName;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "PostalAddress{" +
                "houseNum=" + houseNum +
                ", roadName='" + roadName + '\'' +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }

}
