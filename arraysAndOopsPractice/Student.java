package arraysAndOopsPractice;

public class Student {

    String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() < 15) {
         this.name = name;
        }
    }
    public int getAge() {
        return age;
    } 
    public void setAge(int age) {
        if (age > 5 && age < 30) {
        this.age = age;
        }
    }

    void display(){
        System.out.println("My Name Is: "+ name);
    }

}