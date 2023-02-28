package mvc.validate;

import java.util.Scanner;

public interface RegexLibrary {
    String DATE_FORMAT = "dd/MM/yyyy";
    Scanner scanner = new Scanner(System.in);
    String NAME_VN_REGEX = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ]+$";
    String NAME_REGEX ="(?:[A-Z][a-z]{1,5} )+[A-Z][a-z]+";
    String STRING_REGEX ="[A-Z][a-z]";
    String PHONE_REGEX = "^(\\d{2})+[-]+(0)+(\\d{9})$";
    String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    String ID = "^[0-9]{0,4}$";
    String IDCARD = "^[0-9]{12}$";
    String PHONE_NUMBER = "^(\\d{3}[- ]?){2}\\d{4}$";
    String FILE_CUSTOMER = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\customer.csv";
    String FILE_EMPLOYEE = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\employee.csv";
    String FILE_HOUSE = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\house.csv";
    String FILE_ROOM = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\room.csv";
    String FILE_VILLA = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\villa.csv";
    String FILE_BOOKING = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\booking.csv";
    String FILE_CONTRACT = "D:\\Module_02\\PhamVanHai-A0722i1\\CaseStudy\\src\\mvc\\data\\contract.csv";
}
