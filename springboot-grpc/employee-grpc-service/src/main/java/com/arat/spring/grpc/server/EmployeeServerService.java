package com.arat.spring.grpc.server;

import com.arat.spring.grpc.spring.grpc.Employee;
import com.arat.spring.grpc.spring.grpc.EmployeeServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import com.arat.db.TempEmpDb;

@GrpcService
public class EmployeeServerService extends EmployeeServiceGrpc.EmployeeServiceImplBase {
    @Override
    public void getEmployee(Employee emp, StreamObserver<Employee> responseObserver) {
        TempEmpDb.getEmployeeFromDatabase()
                .stream()
                .filter(employee -> emp.getEmployeeId() == employee.getEmployeeId())
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();

    }
}
