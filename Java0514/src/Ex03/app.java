package Ex03;

import java.util.*;

public class app {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        strList.add("apple");
        strList.add("google");
        strList.add("oracle");

        for(int i = 0; i<strList.size(); i++){
            System.out.println(strList.get(i));
        }

        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            String strItem = it.next();
            System.out.println(strItem);
        }

    }
}
