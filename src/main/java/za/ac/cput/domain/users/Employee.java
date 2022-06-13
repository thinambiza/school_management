/**
 Employee.java
 Entity for the Employee
 Author: Legiste Ndabashinze (217046207)
 Date: 12 June 2022
 */
package za.ac.cput.domain.users;

import za.ac.cput.domain.userInfo.Name;

public class Employee {
    private final String staffId, email;
    private final Name name;

    private Employee(EmployeeBuilder employeeBuilder) {
        this.staffId = employeeBuilder.staffId;
        this.email = employeeBuilder.email;
        this.name = employeeBuilder.name;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }

    public static class EmployeeBuilder{

        private String staffId, email;
        private Name name;

        public EmployeeBuilder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder setName(Name name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder copy(Employee employee){
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
