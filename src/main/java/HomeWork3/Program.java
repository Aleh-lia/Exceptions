package HomeWork3;

import HomeWork3.base.*;
import HomeWork3.base.CDataParseProcessor;
import HomeWork3.base.CGetData;
import HomeWork3.base.CFileCreator;
import HomeWork3.base.CFileWriter;
import HomeWork3.base.CFindTheSameFileName;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        String infoPathFolder = "src/HomeWork3/data/";
        Presenter presenter = new Presenter(new CGetData(), new CDataParseProcessor(), new CCheckDataProcessor
                (new CCheckQuantity(), new CCheckFullName(), new CCheckBirthday(),new CCheckSex()),
                new CFileWriter(new CFileCreator(), new CFindTheSameFileName(), infoPathFolder));
        presenter.run();
    }
}
