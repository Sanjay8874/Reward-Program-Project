package rewardProgram.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rewardProgram.com.Model.Transaction;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCustomerCustomerIdAndTransactionDateBetween(Long customerId, Date startDate, Date endDate);
}
