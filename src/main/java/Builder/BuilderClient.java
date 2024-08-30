package Builder;

public class BuilderClient {
    public static void main(String[] args) {

        //Approach 1 of creating the builder
        StudentBuilder builder= new StudentBuilder();


        //Approach 2 of creating the builder: Ask the class for the builder for which we are going to use it
        StudentBuilder b=Student.getBuilder();

        //Approach 1 of setting the values by setters
        b.setAge(20);
        b.setBatch("CSE");
        b.setGradYear(2022);
        b.setName("Venketesh");

        //Approach 2 of setting the values by setters and chaining them
        StudentBuilder b1=Student.getBuilder()
                .setBatch("CSE")
                .setAge(20)
                .setGradYear(2022)
                .setName("Venky");

        //Best approach to create the Student object
        Student s3= Student.getBuilder()
                .setAge(22)
                .setBatch("ECE")
                .setGradYear(2021)
                .setName("King")
                    .build();

        Student s = new Student(b);
        Student s1=new Student(b1);
        Student s2=b1.build();
        System.out.println("Debug Point");
    }
}
