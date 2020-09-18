package unit;

import dependencyChange.Finder;
import dependencyChange.SpecificFinder;
import dependencyChange.UserRepository;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FinderShould {

    @Test
    public void find_users_by_querying_profile() throws Exception {
        UserRepository repository = new UserRepository();
        Finder finder = new Finder(repository);

        assertThat(finder.find("programmer").size())
                .isEqualTo(1);
    }

    @Test
    public void get_users_with_empty_profile() throws Exception {
        UserRepository repository = new UserRepository();
        Finder finder = new Finder(repository);

        assertThat(
                finder.find("").size())
                .isEqualTo(1);
    }

    @Test
    public void avoid_duplicates() throws Exception {
        UserRepository repository = new UserRepository();
        SpecificFinder finder = new SpecificFinder(repository);

        assertThat(
                finder.findUnique("").size())
                .isEqualTo(1);
    }
}
