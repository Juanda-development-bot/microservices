package pragma.com.client;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import pragma.com.client.entity.Customer;
import pragma.com.client.repository.ICustomerRepository;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class CustomerRepositoryMockTest {

    @Autowired
    private ICustomerRepository customerRepository;


    @Test
    public void whenFindByCategory_thenReturnListProduct(){

        Customer customer = Customer.builder()
                .name("juan")
                .lastname("osorio")
                .DocumentType("CC")
                .numberOfDocument(12345)
                .age(19)
                .cityOfBirth("Medellin").build();

        customerRepository.save(customer);


        Customer founds = customerRepository.findBynumberOfDocument(12345);

        Assertions.assertThat(founds).isEqualTo(1);



    }

}
