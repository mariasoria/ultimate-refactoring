package dependencyChange;

import java.util.List;
import java.util.stream.Collectors;

public class Finder {
    UserRepository repository;

    public Finder(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> find(String query){
        return repository.findAll()
                .stream()
                .filter(u -> u.profile.isEmpty() ||
                             u.profile.contains(query))
                .collect(Collectors.toList());
    }
}
