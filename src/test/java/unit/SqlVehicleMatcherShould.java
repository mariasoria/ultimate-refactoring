package unit;

import org.junit.Test;
import replaceType.OldVehicleQuery;
import replaceType.SqlVehicleMatcher;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SqlVehicleMatcherShould {
    @Test
    public void find_vehicles() throws Exception {
        SqlVehicleMatcher matcher = new SqlVehicleMatcher();
        OldVehicleQuery query = new OldVehicleQuery();
        query.brandDescription = "VW Polo";

        assertThat(matcher.countVehicles(query)).isEqualTo(1);
    }
}
