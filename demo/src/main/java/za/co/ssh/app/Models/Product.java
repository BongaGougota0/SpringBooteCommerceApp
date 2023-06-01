package za.co.ssh.app.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Product
{
    @GeneratedValue
    @Id
    private Integer productID;
    private String productName;
    private String productCategory;
    private Double productPrice;
    private Double productDiscountPrice;
    private String productStore;
    private String productDescription;
    private String productSize;
    private String productImage;

    //for products with multiple images.
    private List<String> productImages;
}
