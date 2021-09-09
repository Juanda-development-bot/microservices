package academy.digitallab.store.product2;

import academy.digitallab.store.product2.entity.Category;
import academy.digitallab.store.product2.entity.Product;
import academy.digitallab.store.product2.repository.IProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private IProductRepository productRepository;

    @Test
    public void whenFindByCategory_thenReturnListProduct(){

        Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1240.99"))
                .status("created")
                .createAt(new Date()).build();

        productRepository.save(product01);


        List<Product> founds = productRepository.findByCategory(product01.getCategory());

        Assertions.assertThat(founds.size()).isEqualTo(3);



    }

}
