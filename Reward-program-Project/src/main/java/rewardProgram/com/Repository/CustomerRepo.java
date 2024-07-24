package rewardProgram.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rewardProgram.com.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
