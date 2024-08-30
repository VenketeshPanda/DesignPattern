package Builder;

public class Student {
    int age;
    String batch;
    String name;
    int gradYear;

    Student (StudentBuilder studentBuilder){
        if(studentBuilder.age<20){
            throw new IllegalArgumentException("Age should be greater than 20");
        }

        if(studentBuilder.batch==null){
            throw new IllegalArgumentException("Batch cannot be null");
        }
        age=studentBuilder.age;
        batch=studentBuilder.batch;
        name=studentBuilder.name;
        gradYear=studentBuilder.gradYear;
    }


    //We can add this so that my class can give me the correct Builder class!
    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}
