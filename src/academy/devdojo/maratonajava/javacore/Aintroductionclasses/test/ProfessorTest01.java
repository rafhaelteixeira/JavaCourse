package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Kakashi";
        professor.age = 28;
        professor.gender = 'M';

        System.out.println(professor.name + " " + professor.age + " " + professor.gender);

    }
}
