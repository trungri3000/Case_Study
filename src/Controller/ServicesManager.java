package Controller;

import Data.FuncWriteFileCSV;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicesManager{
    static ArrayList<Villa> villas = new ArrayList<Villa>();
    static ArrayList<House> houses = new ArrayList<House>();
    static ArrayList<Room> rooms = new ArrayList<Room>();
    public static List<Villa> getVillas() {
        return villas;
    }

    public static void setVillas(ArrayList<Villa> villas) {
        ServicesManager.villas = villas;
    }

    public static ArrayList<House> getHouses() {
        return houses;
    }

    public static void setHouses(ArrayList<House> houses) {
        ServicesManager.houses = houses;
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    public static void setRooms(ArrayList<Room> rooms) {
        ServicesManager.rooms = rooms;
    }

    public static void addNewVilla() {
        Villa villa = new Villa();
        System.out.println("Hãy nhập thông tin thuê Villa : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dịch vụ bạn muốn chọn : " + "\n" + "massage, karaoke, thức ăn, nước uống, thuê xe di chuyển tham quan resort");
        villa.setServicesName(scanner.nextLine());
        System.out.println("Nhập kiểu thuê : " + "\n" + "năm, tháng, ngày, giờ");
        villa.setRentType(scanner.nextLine());
        System.out.println("Nhập chi phí thuê : ");
        villa.setRentPay(scanner.nextDouble());
        System.out.println("Nhập số lượng người thuê : ");
        villa.setRentPeople(scanner.nextDouble());
        System.out.println("Nhập số tầng của villa cần thuê : ");
        villa.setFloor(scanner.nextDouble());
        System.out.println("Nhập diện tích sử dụng : ");
        villa.setRentArae(scanner.nextDouble());
        System.out.println("Nhập diện tích hồ bơi cần có : ");
        villa.setPoolArea(scanner.nextDouble());
        villas.add(villa);
        FuncWriteFileCSV.writeDataVillaToCsv(villas);
        System.out.println("chúc mừng bạn đã nhập thành công !");
        scanner.nextLine();

    }

    public static void addNewHouse() {
        House house = new House();
        System.out.println("Hãy nhập thông tin thuê nhà : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dịch vụ bạn muốn chọn : " + "\n" + "massage, karaoke, thức ăn, nước uống, thuê xe di chuyển tham quan resort");
        house.setServicesName(scanner.nextLine());
        System.out.println("Nhập kiểu thuê : " + "\n" + "năm, tháng, ngày, giờ");
        house.setRentType(scanner.nextLine());
        System.out.println("Nhập chi phí thuê : ");
        house.setRentPay(scanner.nextDouble());
        System.out.println("Nhập số lượng người thuê : ");
        house.setRentPeople(scanner.nextDouble());
        System.out.println("Nhập số tầng của nhà cần thuê : ");
        house.setFloor(scanner.nextDouble());
        System.out.println("Nhập diện tích cần thuê : ");
        house.setRentArae(scanner.nextDouble());
        houses.add(house);
        FuncWriteFileCSV.writeDataHouseToCsv(houses);
        System.out.println("chúc mừng đã nhập thành công ! ");
        scanner.nextLine();
    }

    public static void addNewRoom(){
        Room room = new Room();
        System.out.println("Hãy nhập thông tin thuê phòng : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dịch vụ bạn muốn chọn : " + "\n" + "massage, karaoke, thức ăn, nước uống, thuê xe di chuyển tham quan resort");
        room.setServicesName(scanner.nextLine());
        System.out.println("Nhập kiểu thuê : " + "\n" + "năm, tháng, ngày, giờ");
        room.setRentType(scanner.nextLine());
        System.out.println("Nhập chi phí thuê : ");
        room.setRentPay(scanner.nextDouble());
        System.out.println("Nhập số lượng người thuê : ");
        room.setRentPeople(scanner.nextDouble());
        System.out.println("Nhập diện tích cần sử dụng : ");
        room.setRentArae(scanner.nextDouble());
        rooms.add(room);
        FuncWriteFileCSV.writeDataRoomToCsv(rooms);
        System.out.println("chúc mừng bạn đã nhập thành công ! ");
        scanner.nextLine();
    }
    public static void showInforVilla(){
        villas = FuncWriteFileCSV.readInforVilla();
        for(Villa villa : villas){
            System.out.println("***************************");
            System.out.println("Tên dịch vụ : " + villa.getServicesName());
            System.out.println("kiểu thuê : " + villa.getRentType());
            System.out.println("số tiền thuê : " + villa.getRentPay());
            System.out.println("số người thuê : " + villa.getRentPeople());
            System.out.println("diện tích thuê : " + villa.getRentArae());
            System.out.println("số tầng thuê  : " + villa.getFloor());
            System.out.println("diện tích hồ bơi : "+ villa.getPoolArea());
        }
    }
}
