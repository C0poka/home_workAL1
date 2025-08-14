package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    //1
    {
        int age = 17;

            if (age >= 18) System.out.println("Ваш возраст " + age + ", это больше 18 лет, вы совершеннолетний");
            else {
                System.out.println("Ваш возраст " + age + ", не достиг совершеннолетия, нужно немного подождать");
            }
        //2

        int temperature = 2;

            if (temperature >= 5) System.out.println("На улице " + temperature + ",  градусов, можно идти без шапки");
            else {
                System.out.println("На улице " + temperature + ",  градусов, нужно надеть шапку");
            }

        //3

        int speed = 76;
        for (int i = 0; i < 1; i++)
            if (speed >= 61) System.out.println("Ваша скорость " + speed + ",  придется заплатить штраф");
            else {
                System.out.println("Ваша скорость " + speed + ",  можете ездить спокойно");
            }
        //4

        int HumanAge = 13;
        int SwitchV = 0;

        if (HumanAge > 1 && HumanAge < 7)
                SwitchV = 1;
        if (HumanAge > 6 && HumanAge < 18)
            SwitchV = 2;
        if (HumanAge > 17 && HumanAge < 25)
            SwitchV = 3;
        if (HumanAge >= 25)
            SwitchV = 4;


        switch (SwitchV) {
            case 0:
                System.out.println("Возможно где то ошибка");
                break;
            case 1:
                System.out.println("Вам нужно ходить в детский сад");
                break;
            case 2:
                System.out.println("Вам нужно ходить в школу");
                break;
            case 3:
                System.out.println("Вам нужно ходить в университет");
                break;
            case 4:
                System.out.println("Вам нужно ходить на работу");
                break;
        }
        //5
        int SwitchVa = 0;
        int ChildAge = 27;
        Boolean HasParent = Boolean.FALSE;

        if (ChildAge < 5)
                SwitchVa = 1;

        if (ChildAge >= 5 && ChildAge < 14 && HasParent == Boolean.TRUE)
            SwitchVa = 2;

        if (ChildAge >= 5 && ChildAge < 14 && HasParent == Boolean.FALSE)
            SwitchVa = 3;

        if (ChildAge >= 14)
            SwitchVa = 4;


        switch (SwitchVa) {

            case 1:
                System.out.println("До 5 лет нельзя а вам " + ChildAge);
                break;
            case 2:
                System.out.println("Так как вам " + ChildAge + " вы можете пройти но только со взрослыми");
                break;
            case 3:
                System.out.println("Так как вам " + ChildAge + " без взрослых мы вас не можем пропустить");
                break;
            case 4:
                System.out.println("Вам уже " + ChildAge + " потому можете кататься без ограничений");
                break;

        }
        //6
        int passengers = 22;
        if (passengers <= 60) {
            System.out.println("Есть сидячие места");
        } else if (passengers > 60 && passengers < 102) {
            System.out.println("Остались только стоячие места");
        } else {
            System.out.println("Вагон полон");
        }
        //7

        int one = 12;
        int two = 37;
        int three = 18;
        int max = Math.max(Math.max(one, two), three);
        System.out.println("Наибольшее число: " + max);//Ловит даже на парковке
        //8

        int clientOS = 1; // 0 — iOS, 1 — Android
        String appName = null;
        switch (clientOS) {

            case 0:
                appName = "IOS";
                System.out.println("Установите версию приложения для " + appName + " по ссылке");
                break;
            case 1:
                appName = "Android";
                System.out.println("Установите версию приложения для" + appName + " по ссылке");
                break;


        }
        //9
        int clientOS1 = 0; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2014;
        boolean isLightVersionNeeded = clientDeviceYear < 2015;
        String appName1 = null;
        String versionType = isLightVersionNeeded ? " облегчённую " : " ";
        switch (clientOS) {

            case 0:
                appName1 = "IOS";
                System.out.println("Установите" + versionType + "версию приложения для " + appName1 + " по ссылке");
                break;
            case 1:
                appName1 = "Android";
                System.out.println("Установите" + versionType + "версию приложения для" + appName1 + " по ссылке");
                break;
        }
        //10
        int year = 2024;

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int monthNumber = 7;

        String season;

        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            default:
                season = "осень";
        }

        System.out.println(monthNumber + " месяц принадлежит к сезону " + season);




    }
}