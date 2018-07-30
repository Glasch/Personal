import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Copyright (c) Anton on 25.07.2018.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        TxtParser txtParser = new TxtParser();
        JAXBContext context = JAXBContext.newInstance(Personal.class,Worker.class,Manager.class,Other.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        String path = "C:\\Users\\Anton\\IdeaProjects\\Personal\\src\\input";
        String output = "C:\\Users\\Anton\\IdeaProjects\\Personal\\src\\personal.xml";
        marshaller.marshal(txtParser.parse(path), new File(output));
    }
}
