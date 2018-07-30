import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Copyright (c) Anton on 25.07.2018.
 */


@XmlSeeAlso({Manager.class, Other.class})
public class Worker {
    @XmlAttribute
    int id;
    @XmlElement
    String surname;
    @XmlElement
    String name;
    @XmlElement
    String patronomic;
    @XmlElement
    String birthday;
    @XmlElement
    String dayOfStart; }
