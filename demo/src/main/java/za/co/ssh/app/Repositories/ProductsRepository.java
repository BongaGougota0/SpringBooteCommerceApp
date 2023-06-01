package za.co.ssh.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.ssh.app.Models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>
{
}
