package Ex04;
import java.util.*;
public class app {
    public static void main(String[] args) {
        HashMap<String, student> mapDB = new HashMap<>();
        mapDB.put("leeyang", new student(1, "010-1234-5678"));
        mapDB.put("leekoon", new student(2, "010-2345-6789"));
        mapDB.put("kimkoon", new student(3, "010-3456-7890"));

        student stu = mapDB.get("leekoon");
        System.out.println("ID : " + stu.id + ", PhoneNumber : " + stu.phoneNumber);
    }
}
