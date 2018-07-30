import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

/**
 * Copyright (c) Anton on 25.07.2018.
 */
public class TxtParser {

    Personnel parse(String path) throws Exception {
        Personnel personnel = new Personnel();
        File input = new File(path);
        try (BufferedReader in = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] subline = line.split(" ");
                Employee employee = new Employee();
                employee.setEmployeeType(EmployeeType.fromName(subline[1]));
                employee.setId(Integer.parseInt(subline[0]));
                employee.setSurname(subline[2]);
                employee.setName(subline[3]);
                employee.setPatronomic(subline[4]);
                employee.setBirthday(subline[5]);
                employee.setDayOfStart(subline[6]);
                switch (employee.getEmployeeType()){
                    case WORKER:
                        personnel.getWorkers().add(employee);
                        break;
                    case MANAGER:
                        personnel.getManagers().add(employee);
                        break;
                    case OTHER:
                        personnel.getOthers().add(employee);
                        break;
                }
            }
            return personnel;
        }
    }
}


