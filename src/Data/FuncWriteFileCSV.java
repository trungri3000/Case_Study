package Data;

import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;
import com.sun.org.apache.xpath.internal.objects.XNull;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class FuncWriteFileCSV{

    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for quoted elements
    private static final char DEFAULT_QUOTE = '"';
    //path file Villa.csv
    private static final String pathVilla = "src/Data/Villa.csv";
    //path file House.csv
    private static final String pathHouse = "src/Data/House.csv";
    //path file Room.csv
    private static final String pathRoom = "D:\\Case_Study\\src\\Data\\Room.csv";

    private static String[] headerRecordingVilla = new String[]{"servicesName", "rentType", "rentPay", "rentPeople", "rentArea", "floor", "poolArea"};

    private static String[] headerRecordingHouse = new String[]{"servicesName", "rentType", "rentPay", "rentPeople", "rentArea", "floor"};

    private static String[] headerRecordingRoom = new String[]{"servicesName", "rentType", "rentPay", "rentPeople", "rentArea"};

    public static void writeDataVillaToCsv(ArrayList<Villa> villas) {
        File file = new File(pathVilla);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(pathVilla);
            CSVWriter writer = new CSVWriter(fileWriter, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            writer.writeNext(headerRecordingVilla);
            for (Villa villa : villas) {
                writer.writeNext(new String[]{
                                villa.getServicesName(),
                                villa.getRentType(),
                                String.valueOf(villa.getRentPay()),
                                String.valueOf(villa.getRentPeople()),
                                String.valueOf(villa.getRentArae()),
                                String.valueOf(villa.getFloor()),
                                String.valueOf(villa.getPoolArea())
                        }
                );
            }


        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }

    public static void writeDataHouseToCsv(ArrayList<House> houses) {
        try {
            FileWriter fileWriter = new FileWriter(pathHouse);

            CSVWriter writer = new CSVWriter(fileWriter, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            writer.writeNext(headerRecordingHouse);
            for (House house : houses) {
                writer.writeNext(new String[]{
                                house.getServicesName(),
                                house.getRentType(),
                                String.valueOf(house.getRentPay()),
                                String.valueOf(house.getRentPeople()),
                                String.valueOf(house.getRentArae()),
                                String.valueOf(house.getFloor())
                        }
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDataRoomToCsv(ArrayList<Room> rooms) {
        File file = new File(pathRoom);
        try {
            FileWriter fileWriter = new FileWriter(file);

            CSVWriter writer = new CSVWriter(fileWriter, ';',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            writer.writeNext(headerRecordingRoom);
            for (Room room : rooms) {
                writer.writeNext(new String[]{

                                room.getServicesName(),
                                room.getRentType(),
                                String.valueOf(room.getRentPay()),
                                String.valueOf(room.getRentPeople()),
                                String.valueOf(room.getRentArae())
                        }
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Villa> readInforVilla() {
        BufferedReader bufferedReader = null;
        ArrayList<Villa> villas = new ArrayList<Villa>();
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(pathVilla));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(";");
                if (split[0].equals("servicesName")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setServicesName(split[0]);
                villa.setRentType(split[1]);
                villa.setRentPay(Double.parseDouble(split[2]));
                villa.setRentPeople(Double.parseDouble(split[3]));
                villa.setRentArae(Double.parseDouble(split[4]));
                villa.setFloor(Double.parseDouble(split[5]));
                villa.setPoolArea(Double.parseDouble(split[6]));
                villas.add(villa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return villas;
    }
}
