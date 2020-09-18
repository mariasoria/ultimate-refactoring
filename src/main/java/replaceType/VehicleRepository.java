package replaceType;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    public List<Vehicle> find(NewVehicleQuery query){
        List<Vehicle> stub = new ArrayList<>();
        stub.add(new Vehicle(query.brand, query.description));
        return stub;
    }
}
