package org.example.lesson4;

public class SwitchExample {

    public static void main(String[] args) {
        int dayNumber = 3;

//        switch (dayNumber) {
//            case 1:
//                System.out.println("It's Monday");
//                break;
//            case 2:
//                System.out.println("It's Tuesday");
//                break;
//            case 3:
//                System.out.println("It's Wednesday");
//                break;
//            default:
//                System.out.println("Unknown");
//        }

        switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> System.out.println("Working day");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Unknown");
        }
    }
}
