package unit;

import moveResponsibility.God;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GodShould {
    @Test
    public void add_numbers() throws Exception {
        God god = new God();
        assertThat(god.add(2,2)).isEqualTo(4);
    }

    @Test
    public void substract_numbers() throws Exception {
        God god = new God();
        assertThat(god.substract(2,2)).isEqualTo(0);
    }
}
