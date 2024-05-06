package Tests;

import House.Bathroom;
import House.Bedroom;
import House.House;
import House.Kitchen;
import House.LivingRoom;
import House.Room;
import House.Toilet;

public class TestHouse {

    public static void main(String[] args) {
        House myHouse = new House();

        Room[] rooms = {
                new Toilet(1, 9),
                new Toilet(0, 9),
                new Bathroom(1, 15),
                new Bathroom(0, 10),
                new Kitchen(0, 25),
                new Bedroom(0, 40),
                new LivingRoom(0, 60)
        };

        for (Room room : rooms) {
            myHouse.addRoom(room);
        }

        System.out.println(myHouse.totalArea());

        System.out.println(myHouse.getTotalRoomTypeArea(Toilet.class.getSimpleName()));
        System.out.println(myHouse.getNumberOfRooms(Bathroom.class.getSimpleName()));

    }
}
