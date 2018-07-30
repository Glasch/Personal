import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Copyright (c) Anton on 25.07.2018.
 */
public class TxtParser {

    Personal parse(String path) throws Exception {
        Personal personal = new Personal();
        File input = new File(path);
        try (BufferedReader in = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] subline = line.split(" ");
                Worker worker = checkwho(subline[1]);
                worker.id = Integer.parseInt(subline[0]);
                worker.surname = subline[2];
                worker.name = subline[3];
                worker.patronomic = subline[4];
                worker.birthday = subline[5];
                worker.dayOfStart = subline[6];
                if (worker.getClass().getCanonicalName() == "Manager") {
                    personal.managers.add((Manager) worker);
                } else {
                    if (worker.getClass().getCanonicalName() == "Other") {
                        personal.others.add((Other) worker);
                    } else {
                        if (worker.getClass().getCanonicalName() == "Worker") {
                            personal.workers.add(worker);
                        }
                    }
                }
            }
            return personal;
        }
    }

    private Worker checkwho(String s) {
        if (s.equals("Manager")) return new Manager();
        if (s.equals("Worker")) return new Worker();
        if (s.equals("Other")) return new Other();
        return null;
    }


}


