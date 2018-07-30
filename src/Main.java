import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

/**
 * Copyright (c) Anton on 25.07.2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        TxtParser txtParser = new TxtParser();
        JAXBContext context = JAXBContext.newInstance(Personnel.class, Employee.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(txtParser.parse("src\\input.csv"), new File("personnel.xml"));
    }
}
