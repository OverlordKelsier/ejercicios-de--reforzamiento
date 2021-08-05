class Person { }
class Student {
    int id;
    Student(int id) {
        this.id = id;
    }
   @Override
    public boolean equals(Object obj) {

        // Write your code here
       if (this == obj) {
           return true;
       }
       if (obj == null || getClass() != obj.getClass()) {
           return false;
       }
       Student student = (Student) obj;
       if (obj instanceof Student){//Es un best practice
           return this.id == student.id;
       }
       return false;

    }
}

public class Test {

    public static void main(String[] args) {

        Person p = new Person();

        Student s1 = new Student(1001);

        Student s2 = new Student(1001);

        System.out.println(s1.equals(p));

        System.out.println(s1.equals(s2));

    }

}
