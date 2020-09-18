package signatureChange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvBuilder {
    public String[] buildLine(String... fields){
        return fields;
    }

    private String header(){
        return "Field1, Field2";
    }

    public List<String> aFileWithLine(String ... fields){
        String line = Arrays.asList(fields).stream().collect(Collectors.joining(","));
        return Arrays.asList(header(), line);
    }
}
