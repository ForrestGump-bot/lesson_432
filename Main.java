package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[] {"Timur", "Eldar", "Stas"};
        names.add("Maks")

            int a = 1;
            switch (a) {
                case 1:
                    System.out.println(names[0] + ", Good morning");
                case 2:
                    System.out.println(names[1] + ", Good afternoon");
                case 3:
                    System.out.println(names[2] + ", Good evening");
                case 4:
                    System.out.println(names[3] + ", Good night");

                    String[] array;
                    array = Arrays.copyof(names, names.length + 1)
                    System.out.println(array);

            }


    }
}
