import Car.Car;
import Gender.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<>();
    private Car car;


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