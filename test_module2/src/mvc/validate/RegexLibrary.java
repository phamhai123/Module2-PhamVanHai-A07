package mvc.validate;

public interface RegexLibrary {
    String NAME_REGEX ="(?:[A-Z][a-z]{1,5} )+[A-Z][a-z]+";
    String IDCARD = "^[0-9]{12}$";
    String ID = "{12}$";
}
