package mvc.service;

import mvc.model.Customer;

import java.util.LinkedList;

public class CustomerServiceImpl implements CustomerService{
    private static LinkedList<Customer> list = new LinkedList<>();
    static {
        list.add(new Customer(1,"Pham Văn Hai",01012002,"male",121312312,11312311,"hai@gmail.com","VIP","123 Đà Nẵng"));
    }

    @Override
    public void display() {

    }

    @Override
    public void create() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
