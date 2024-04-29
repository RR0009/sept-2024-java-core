import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//
      Instrument[] instruments = {new Baraban(46),new Trube(23.56),new Guitar(56)};

       for (Instrument instrument : instruments) {

        instrument.play();

      }

    }


    }
//Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
//Інтерфейс Instrument  містить метод play().
//Клас "Гітара" містить змінну класу "кількістьСтрун",
//клас "Барабан" - розмір, а клас "Труба" - діаметр.
//Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
//У циклі викликати метод play() для кожного інструменту,
//який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".

