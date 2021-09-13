package pragma.com.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pragma.com.client.service.ICustomerService;
import pragma.com.client.entity.Customer;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerRest {

    @Autowired
    private ICustomerService customerService;

    // -------------------Retrieve All Customers--------------------------------------------

    @GetMapping
    public ResponseEntity<List<Customer>> listAllCustomers(@RequestParam(name = "TipoDocumento" , required = false) String DocumentType) {
        List<Customer> customers =  new ArrayList<>();
        if (null ==  DocumentType) {
            customers = customerService.findCustomerAll();
            if (customers.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
        }else{
            customers = customerService.findCustomersByDocumentType(DocumentType);
            if ( null == customers ) {
                return  ResponseEntity.notFound().build();
            }
        }

        return  ResponseEntity.ok(customers);
    }

}
