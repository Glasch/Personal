import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

/**
 * Copyright (c) Anton on 25.07.2018.
 */

public class Manager extends Worker{
   @XmlElement(name = "inSubmission" )
   ArrayList<Worker> inSubmission;

}

