package com.demo;

import com.domain.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;

class MainTestTest {

  //  @Mock
    //Employee employee;

    @Test
    void makelist() {
        Employee emp1 =new Employee("TRE543", 28);
        Assertions.assertEquals(emp1.getAge(), 28 );
    }
}