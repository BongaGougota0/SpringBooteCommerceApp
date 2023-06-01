package za.co.ssh.app.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoreController
{

    @RequestMapping(value = {"","/","/home"})
    public String homeView()
    {

        return "index.html";
    }

    @RequestMapping(value = "/shop")
    public String shop()
    {
        return "shop.html";
    }

    @RequestMapping(value = "/checkout")
    public String checkout()
    {
        return "cart.html";
    }

    @RequestMapping(value = "/contact-store")
    public String contact()
    {

        return "contact.html";
    }

    @RequestMapping(value = "/product-details")
    public String productDetails()
    {

        return "detail.html";
    }
}
