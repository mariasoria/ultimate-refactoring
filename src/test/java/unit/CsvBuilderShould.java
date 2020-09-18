package unit;

import org.junit.Test;
import signatureChange.CsvBuilder;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CsvBuilderShould {
    CsvBuilder builder = new CsvBuilder();

    @Test
    public void builds_csv_lines() throws Exception {
        List<String> lines = builder.aFileWithLine(builder.buildLine("a", "b"));
        assertThat(lines.get(0)).isEqualToIgnoringCase("Field1, Field2");
        assertThat(lines.get(1)).isEqualToIgnoringCase("a,b");
    }

    @Test
    public void builds_csv_lines_with_more_fields_than_headers() throws Exception {
        List<String> lines = builder.aFileWithLine(builder.buildLine("a", "b", "c"));
        assertThat(lines.get(1)).isEqualToIgnoringCase("a,b,c");
    }
}
