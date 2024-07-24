package rewardProgram.com.Services.CustomerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rewardProgram.com.Model.Customer;
import rewardProgram.com.Repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
    private  CustomerRepo customerRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }



    @Override
    public void addCustomerData(Customer customer) {
        if(customer.getEmail()==null){
            customerRepo.save(customer);
        }
        else {
            logger.info("Customer already present in database");
        }
    }
}
