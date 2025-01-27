package Builder;

public class BuilderClient {
    public static void main(String[] args) {

        Student s3= Student.getBuilder()
                .setAge(22)
                .setBatch("ECE")
                .setGradYear(2021)
                .setName("King")
                    .build();

        System.out.println("Debug Point"+s3.age);
    }
}
