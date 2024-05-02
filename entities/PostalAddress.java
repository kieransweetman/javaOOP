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

    public String getCity() {
        return city;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
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
