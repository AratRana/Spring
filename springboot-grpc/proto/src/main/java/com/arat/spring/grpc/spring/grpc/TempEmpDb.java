package com.arat.spring.grpc;

import java.util.ArrayList;
import java.util.List;

public class TempEmpDb {
    public static List<Employee> getEmployeeFromDatabase() {
        return new ArrayList<Employee>() {
            {
                add(Employee.newBuilder().setEmployeeId(1).setEmployeeName("peter").setAge(38).build());
                add(Employee.newBuilder().setEmployeeId(2).setEmployeeName("john").setAge(38).build());
                add(Employee.newBuilder().setEmployeeId(3).setEmployeeName("mike").setAge(38).build());
            }
        };
    }
}
