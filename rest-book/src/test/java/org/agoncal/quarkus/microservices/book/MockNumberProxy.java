package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Random;

@Mock
@RestClient
public class MockNumberProxy implements NumberProxy{
    @Override
    public IsbnThirteen generateIsbnNumbers() {
        IsbnThirteen isbnThirteen = new IsbnThirteen();
        isbnThirteen.setIsbn13("13-" + new Random().nextInt(100_000_000));
        return isbnThirteen;
    }
}
