package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String phone = "+926-925 82-28";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("slishkom korotkii");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("alien number");
        }
        System.out.println("phone = " + phone);
        String expPhone = "79269258228";
        if (phone.equals(expPhone)) {
            System.out.println("sucsses");
        } else {
            System.out.println("Unsucsess");
        }

//        example N1 and 2
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = (lastName+ " ")  + (firstName+ " ") + (middleName + " ");
        System.out.println("ФИО сотрудника — " + fullName);
        fullName = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета: " + fullName);

//        example N3
        String s1 = "Семён";
        String s2 = "Семёнович";
        String s3 = "Иванов";
        String s4 = (s3 + " ") + (s1 + " ") + (s2 + " ");
        s4 = s4.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + s4);
    }
}
