package PrototypeAndRegistry;

public class IntelligentStudent extends Student{
    int iq;

    @Override
    public Student copy() {
        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.iq=iq;
        intelligentStudent.id=id;
        intelligentStudent.batch=batch;
        intelligentStudent.name=name;
        return intelligentStudent;
    }
}
