package java_dz.lesson2;

import java.util.LinkedHashMap;
import java.util.Map;

public class prog1 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiev");
        map.put("age",null);
        System.out.println("SELECT * from students where " + getSQL(map));
    }

    public static String getSQL(Map<String, String> map) {
        StringBuilder result = new StringBuilder();
        if (map == null || map.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;

            result.append("\"" +pair.getKey()).append("\" = \"").append(pair.getValue()).append("\" and ");
        }

        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());

        return result.toString();
    }
}
