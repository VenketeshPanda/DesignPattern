package Builder;

public class StudentBuilder {
    int age;
    String batch;
    String name;
    int gradYear;

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public StudentBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    Student build(){
        return new Student(this);
    }
}
