package ex3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> arrayList = new ArrayList<>();
        String jsonCarStr = "[{ \"color\" : \"White\", \"type\" : \"Vinfast\" }," +
                "{ \"color\" : \"Blue\", \"type\" : \"Toyota\" }]";
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Car>>(){}.getType();
        arrayList = gson.fromJson(jsonCarStr,type);
        for (Car temp: arrayList) {
            System.out.println(temp.toString());
        }
    }
}
