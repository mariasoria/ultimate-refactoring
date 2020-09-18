package dependencyChange;

import java.util.HashSet;
import java.util.Set;

public class SpecificFinder extends Finder {

    public SpecificFinder(UserRepository repository) {
        super(repository);
    }

    public Set<User> findUnique(String query){
        return new HashSet<>(find(query));
    }
}
