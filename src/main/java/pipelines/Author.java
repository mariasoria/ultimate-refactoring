package pipelines;

/*
Refactoring to pipelines by Martin Fowler:

https://martinfowler.com/articles/refactoring-pipelines.html
 */

import java.util.ArrayList;
import java.util.List;

public class Author {
    public String company;
    public String twitterHandle;

    static public List<String> twitterHandles(List<Author> authors, String company) {
        List<String> result = new ArrayList();
        for (Author a: authors) {
            if (a.company == company) {
                String handle = a.twitterHandle;
                if (handle != null)
                    result.add(handle);
            }
        }
        return result;
    }
}
