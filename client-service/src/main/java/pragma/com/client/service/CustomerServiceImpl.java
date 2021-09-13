package pragma.com.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pragma.com.client.entity.Customer;
import pragma.com.client.repository.ICustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;


    @Override
    public List<Customer> findCustomerAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findCustomersByDocumentType(String DocumentType) {
        return customerRepository.findByDocumentType(DocumentType);
    }

    @Override
    public Customer findBynumberOfDocument(int number) {
        return customerRepository.findByNumberOfDocument(number);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Customer customerDB = customerRepository.findByNumberOfDocument (customer.getNumberOfDocument());
        if (customerDB != null){
            return  customerDB;
        }
        customerDB = customerRepository.save ( customer );
        return customerDB;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer customerDB = customerRepository.findByNumberOfDocument (customer.getNumberOfDocument());
        if (customerDB != null){
            return  customerDB;
        }

        customerDB = customer;

        return  customerRepository.save(customerDB);
    }

    @Override
    public Customer deleteCustomer(Customer customer) {

        Customer customerDB = customerRepository.findByNumberOfDocument (customer.getNumberOfDocument());
        if (customerDB != null){
            return  customerDB;
        }

        customerDB = customer;

        return null;
    }

    @Override
    public Customer getCustomer(int numberOfDocument) {
        return customerRepository.findByNumberOfDocument(numberOfDocument);
    }
}
