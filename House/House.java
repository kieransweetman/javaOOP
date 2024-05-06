package House;

import java.util.Arrays;

public class House {
    Room[] rooms;

    public House() {
        super();
        this.rooms = new Room[0];
    }

    public House(Room[] rooms) {
        super();
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        if (room == null) {
            System.out.println("error: did you supply a room?");
            return;
        }

        Room[] copy = Arrays.copyOf(this.rooms, this.rooms.length + 1);
        copy[copy.length - 1] = room;
        this.rooms = copy;
    }

    public double totalArea() {
        double sum = 0;

        for (Room room : this.rooms) {
            sum += room.getArea();
        }

        return sum;
    }

    public double getTotalRoomTypeArea(String type) {
        double sum = 0;

        for (Room room : rooms) {

            if (room.getClass().getSimpleName() == type) {
                sum += room.getArea();
            }
        }
        return sum;
    }

    public int getNumberOfRooms(String type) {

        int total = 0;

        for (Room room : rooms) {

            if (room.getClass().getSimpleName() == type) {
                total += 1;
            }
        }
        return total;
    }

    public String showRooms() {
        return Arrays.toString(this.rooms);
    }
}
