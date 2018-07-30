import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) Anton on 30.07.2018.
 */
@XmlRootElement
public class Personnel {
    private List<Employee> workers = new ArrayList <>();

    private List<Employee> managers = new ArrayList <>();

    private List<Employee> others = new ArrayList <>();

    public List<Employee> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Employee> workers) {
        this.workers = workers;
    }

    public List<Employee> getManagers() {
        return managers;
    }

    public void setManagers(List<Employee> managers) {
        this.managers = managers;
    }

    public List<Employee> getOthers() {
        return others;
    }

    public void setOthers(List<Employee> others) {
        this.others = others;
    }
}


