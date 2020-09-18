package dependencyChange;

import java.util.Arrays;
import java.util.List;

public class Parser {
    public List<String> parse(String query){
        return Arrays.asList(query.split(" "));
    }
}
