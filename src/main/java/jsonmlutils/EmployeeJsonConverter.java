package jsonmlutils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;

import model.Address;
import model.Employee;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeJsonConverter {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("name", "lastname", 18,
                new Address("city","country","Street",256),
                null));

       try (FileWriter writer = new FileWriter("employee.json")) {
            gson.toJson(employeeList,
                    writer);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader reader = new FileReader("employee.json")) {
            JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);
            for (JsonElement jsonElement : jsonArray) {
                System.out.println(jsonElement.getAsJsonObject().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
