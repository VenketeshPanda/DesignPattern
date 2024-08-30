package PrototypeAndRegistry;

public class ClientPR {
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student st1=studentRegistry.getStudent("April2023");
        System.out.println(st1.id);
    }

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student st= new Student();
        st.batch="April2023";
        st.id=1;
        studentRegistry.register("April2023", st);
    }
}
