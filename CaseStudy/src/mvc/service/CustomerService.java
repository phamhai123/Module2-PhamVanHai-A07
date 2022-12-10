package mvc.service;

import java.io.IOException;
import java.text.ParseException;

public interface CustomerService extends Service {
    void create() throws ParseException, IOException;
    void edit() throws ParseException;
    void delete();
}
