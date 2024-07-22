package rewardProgram.com.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class RewardPoints
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rewardId;

    @ManyToOne
    @JoinColumn(name = "+", nullable = false)
    private Customer customer;

    private int month;
    private int year;
    private int points;
    private Timestamp createdAt;

}
