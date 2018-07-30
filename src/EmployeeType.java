/*
 * Author: glaschenko
 * Created: 31.07.2018
 */
public enum EmployeeType {
    WORKER("Worker"),
    MANAGER("Manager"),
    OTHER("Other");

    private String name;

    EmployeeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static EmployeeType fromName(String name) {
        for (EmployeeType employeeType : EmployeeType.values()) {
            if (employeeType.getName().equals(name)) return employeeType;
        }
        return null;
    }
}
