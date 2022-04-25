package jsonmlutils;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import model.Address;
import model.Employee;


import java.io.*;
import java.util.*;

public class EmployeeXmlConverter {
    public static void main(String[] args) {
        JAXBContext jaxbContext = null;
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee("name", "lastname", 18,
                new Address("city", "country", "Street", 256),
                null);
        employeeList.add(new Employee("name", "lastname", 18,
                new Address("city", "country", "Street", 256),
                null));
        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(employee, new File("employee.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }


        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            employee = (Employee) unmarshaller.unmarshal(new File("employee.xml"));
            System.out.println(employee.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}