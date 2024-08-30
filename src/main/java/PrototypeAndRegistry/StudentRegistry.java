package PrototypeAndRegistry;

import java.util.Map;

public class StudentRegistry {
    private Map<String,Student> studentMap;

    public void register(String key,Student s){
        studentMap.put(key, s);
    }

    public Student getStudent(String key){
        return studentMap.get(key).copy();
    }
}
