package PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    int id;
    String name;
    String batch;

    @Override
    public Student copy(){
        Student s=new Student();
        s.id=this.id;
        s.batch=this.batch;
        s.name=this.name;
        return s;
    }
}
