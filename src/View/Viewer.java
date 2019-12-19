package View;

import Controller.ServicesManager;
import Data.FuncWriteFileCSV;
import Models.Room;
import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class Viewer{
    static Viewer viewer = new Viewer();

    public void addMenu() {
        System.out.println("nhập dịch vụ cần thuê ");
        System.out.println("Chọn 1 để nhâp thông tin thuê villa : ");
        System.out.println("Chọn 2 để nhập thông tin thuê nhà : ");
        System.out.println("Chọn 3 để nhập thông tin thuê phòng : ");
        System.out.println("Chọn 4 để quya lai menu ");
        System.out.println("Chọn 5 để thoát ");
        int i;
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                ServicesManager.addNewVilla();
                viewer.addMenu();
            case 2:
                ServicesManager.addNewHouse();
                viewer.addMenu();
            case 3:
                ServicesManager.addNewRoom();
                viewer.addMenu();
            case 4:
                viewer.displayMenu();
            case 5:
                System.exit(5);

        }
    }

    public void displayList() {
        System.out.println("Chọn 1 để hiển thị thông tin thuê villa : ");
        System.out.println("Chọn 2 để hiển thị  thông tin thuê nhà : ");
        System.out.println("Chọn 3 để hiển thị thông tin thuê phòng : ");
        System.out.println("Chọn 4 để quay lai menu ");
        System.out.println("Chọn 5 để thoát ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                ServicesManager.showInforVilla();
                viewer.displayList();
            case 2:
                ServicesManager.getHouses();
                viewer.displayList();
            case 3:
                ServicesManager.getRooms();
                viewer.displayList();
            case 4:
                viewer.displayMenu();
            case 5:
                System.exit(5);
        }
    }

    public void displayMenu() {
        System.out.println("chọn 1 để thêm thông tin thuê ");
        System.out.println("chọn 2 để hiển thị thông tin thuê : ");
        System.out.println("chọn 3 để thoát ");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                viewer.addMenu();
                return;
            case 2:
                viewer.displayList();
                return;
            case 3:
                System.exit(3);
        }
    }

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        viewer.displayMenu();
    }
}
