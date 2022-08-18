package com.arat.spring.grpc.grpc.client.controller;

import com.arat.spring.grpc.grpc.client.EmployeeClientService;
import com.google.protobuf.Descriptors;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class EmployeeController {

    final EmployeeClientService employeeClientService;

    @GetMapping("/employees/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getEmployee(@PathVariable("id") String id) {
        return employeeClientService.getEmployee(Integer.parseInt(id));
    }

}
