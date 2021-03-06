package com.domain;

import com.demo.Show;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.junit.Test;
//import com.demo.MainTest;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    Employee employee = new Employee("Jeff Smith", 29);
    private Employee emp;
    //@Mock
    //Address address;
    @BeforeEach
    public void initEach() {
        emp = new Employee("Jeff Steven", 28);

    }
    @Test
    void getAge() {

        assertSame(29, employee.getAge());
    }

    @Test
    void setAge() {
        try {
            Show show = new Show(10, 8);
            assertSame(18, show.add(10, 8));
        }catch(Exception en) {

        }
    }
    @Test
    void testAddress() {
        Address address = new Address("30 ES St", "CM");
        assertNotNull(address.getState());
    }
    @Test
    public void testmore(){
        assertSame(28, emp.getAge());
    }


}