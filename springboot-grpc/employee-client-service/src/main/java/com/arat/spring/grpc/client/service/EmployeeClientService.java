package com.arat.spring.grpc.client;

import com.arat.spring.grpc.spring.grpc.Employee;
import com.arat.spring.grpc.spring.grpc.EmployeeServiceGrpc;
import com.google.protobuf.Descriptors;
import org.springframework.stereotype.Service;
import net.devh.boot.grpc.client.inject.GrpcClient;

import java.util.Map;

@Service
public class EmployeeClientService {

    @GrpcClient("grpc-employee-service")
    EmployeeServiceGrpc.EmployeeServiceBlockingStub synchronizeClient;

    public Map<Descriptors.FieldDescriptor, Object> getEmployee(int employeeId) {
        Employee employee = Employee.newBuilder().setEmployeeId(employeeId).build();
        Employee response = synchronizeClient.getEmployee(employee);
        return response.getAllFields();
    }
}
