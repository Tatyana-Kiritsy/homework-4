public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    " , то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //task 2
        int outsideTemperature = 4;
        if (outsideTemperature >= 5) {
            System.out.println("На улице " + outsideTemperature +
                    " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + outsideTemperature +
                    " градусов, нужно надеть шапку.");
        }
        //task 3
        int speed = 61;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed +
                    " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed +
                    " км/ч, придётся заплатить штраф.");
        }
        //task 4
        int humanAge = 6;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge +
                    ", то ему нужно ходить в детский сад.");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge +
                    ", то ему нужно ходить в школу.");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge +
                    ", то ему нужно ходить в университет.");
        } else if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge +
                    ", то ему нужно ходить на работу.");
        } else {
            System.out.println("Поздравляем, вы свободны!");
        }
        //task 5
        int personAge = 11;
        boolean inAdultCompany = false;
        if (personAge < 5) {
            System.out.println("Если возраст ребенка равен " + personAge +
                    ", то ему нельзя кататься на аттракционе.");
        } else if (personAge >= 5 && personAge < 14) {
            if (inAdultCompany) {
                System.out.println("Если возраст ребенка равен " + personAge +
                        ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + personAge +
                        ", то ему нельзя кататься на аттракционе без сопровождения взрослого.");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + personAge +
                    ", то ему можно кататься на аттракционе.");
        }
        //task 6
        int totalPlaceNumber = 101;
        int placeToSeat = 59;
        boolean ifWeHaveVacantPlaces = totalPlaceNumber < 102;
        if (ifWeHaveVacantPlaces) {
            if (placeToSeat < 60) {
                System.out.println("В вагоне есть и сидячие и стоячие места.");
            } else {
                System.out.println("В вагоне есть только стоячие места.");
            }
        } else {
            System.out.println("В вагоне нет мест.");
        }
        //task 7
        int one = 3;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое.");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое.");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " самое большое.");
        } else {
            System.out.println("Нельзя назвать самое большое число.");
        }
    }
    }
