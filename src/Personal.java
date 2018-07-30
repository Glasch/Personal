import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) Anton on 30.07.2018.
 */
@XmlRootElement
public class Personal {
    @XmlElementWrapper (name = "Workers")
    @XmlElement (name = "Worker")
    List<Worker> workers = new ArrayList <>();
    @XmlElementWrapper (name = "Managers")
    @XmlElement (name = "Manager")
    List<Manager> managers = new ArrayList <>();
    @XmlElementWrapper (name = "Others")
    @XmlElement (name = "Other")
    List<Other> others = new ArrayList <>();
}


