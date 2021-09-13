package pragma.com.client.service;

import pragma.com.client.entity.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> findCustomerAll();
    public List<Customer> findCustomersByDocumentType(String DocumentType);
    public Customer findBynumberOfDocument(int number);

    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public  Customer getCustomer(int numberOfDocument);

}
