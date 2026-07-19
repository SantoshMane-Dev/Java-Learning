
public class Student{
        String name;
        String course;
        int age;

        Student( String name, String course, int age) {
            this.name = name;
            this.course = course;
            this.age = age;
        }

        @Override
        public String toString() {

            return "Student Details:{name:" + name
            + ", age: " + age
            + ", course:" + course + "}";
        }

        static void stringManipulation(){
            String naam = "Santosh";
            String sirnaam = "Mane";

            String fullnaam = naam.concat(" ").concat(sirnaam);

            System.out.println(fullnaam);
            System.out.println(fullnaam.toUpperCase());
        }
    
        public static void main(String[] args) {
            Student s1 = new Student("Santosh","Java", 23);
            Student s2 = new Student("Pranav","C++", 24);

            stringManipulation();
        }
    }



