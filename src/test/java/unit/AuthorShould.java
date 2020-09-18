package unit;

import org.junit.Test;
import pipelines.Author;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthorShould {
    @Test
    public void collect_twitter_handles() throws Exception {
        Author author1 = new Author();
        author1.company = "Target";
        author1.twitterHandle = "@bob";
        Author author2 = new Author();
        author2.company = "Other";
        author2.twitterHandle = "@other";
        List<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);

        assertThat(
                Author.twitterHandles(authors, "Target")                .size())
                .isEqualTo(1);
    }
}
