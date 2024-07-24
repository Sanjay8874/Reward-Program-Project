package rewardProgram.com.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rewardProgram.com.Model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping
    public void addCustomerData(@RequestBody Customer customer){

    }
}
