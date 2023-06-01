package za.co.ssh.app.Services;

import org.springframework.beans.factory.annotation.Autowired;
import za.co.ssh.app.Repositories.ProductsRepository;

public class ProductsService
{
    @Autowired
    private ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository)
    {
        this.productsRepository = productsRepository;
    }
}
