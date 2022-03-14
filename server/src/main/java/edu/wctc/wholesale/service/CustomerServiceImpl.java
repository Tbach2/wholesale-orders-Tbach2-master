package edu.wctc.wholesale.service;
import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(int customerId) {
        List<Customer> list = new ArrayList<>();
        customerRepository.findAll().forEach(list::add);
        return (Customer) list;
    }
}