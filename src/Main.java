import Car.Car;
import Gender.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java",10));
        skills.add(new Skill("js",10));
        skills.add(new Skill("c++",10));

        Car car = new Car("toyota",2021,250);

        User user = new User(1,"vasya","pupkin","asd@asd.com",31, Gender.MALE,skills,car);

        System.out.println(user);

    }


    }


//Створити клас котрий відповідає наступній моделі
//{
//id: 1,
//name: 'vasya',
//surname: 'pupkin',
//email: 'asd@asd.com',
//age: 31,
//gender: 'MALE',
//skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//car: {model: 'toyota', year: 2021, power: 250}
//        }