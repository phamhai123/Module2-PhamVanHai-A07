package mvc.validate;

public interface RegexLibrary {
    String NAME_VN_REGEX = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ]+$";
    String NAME_REGEX ="(?:[A-Z][a-z]{1,5} )+[A-Z][a-z]+";
    String STRING_REGEX ="[A-Z][a-z]";
    String PHONE_REGEX = "^(\\d{2})+[-]+(0)+(\\d{9})$";
    String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    String ID = "^[0-9]{0,4}$";
    String IDCARD = "^[0-9]{12}$";
    String PHONE_NUMBER = "^(\\d{3}[- ]?){2}\\d{4}$";
}
