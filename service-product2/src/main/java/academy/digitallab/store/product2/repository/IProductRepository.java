package academy.digitallab.store.product2.repository;

import academy.digitallab.store.product2.entity.Category;
import academy.digitallab.store.product2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Long> {

    public List<Product> findByCategory(Category category);
}
