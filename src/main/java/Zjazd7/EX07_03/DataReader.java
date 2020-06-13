package Zjazd7.EX07_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.List;

/**
 * summary: Implement exercise 07_03: DataReader
 * author: Michal Wadas
 **/
public class DataReader {

    public List<Data> readData(String path) throws OverlappingFileLockException, IOException {
        ArrayList<Data> result = new ArrayList<>();
        try (BufferedReader lineReader = new BufferedReader(new FileReader(path))) {
            String lineText = lineReader.readLine(); //read first line which is useless in csv file
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(";");
                Data obj = new Data();
                obj.setId(Integer.parseInt(data[0].trim()));
                obj.setIntKey(Integer.parseInt(data[1].trim()));
                obj.setStringKey(data[2].trim());
                obj.setValue(data[3].trim());
                obj.setEnumName(data[4].trim());
                result.add(obj);
            }
        }
        return result;
    }
}