import javax.xml.bind.annotation.XmlElement;

/**
 * Copyright (c) Anton on 25.07.2018.
 */
 public class Other extends Worker {
    @XmlElement(name="about")
    String about;

    public Other() {
            this.about = "No Information";
    }
}
