package pragma.com.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pragma.com.client.entity.Customer;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {

     List<Customer> findByDocumentType(String DocumentType);
     Customer findByNumberOfDocument(int documentNumber);

}
