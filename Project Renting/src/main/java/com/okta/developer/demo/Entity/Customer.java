package com.okta.developer.demo.Entity;
import javax.persistence.*;
import lombok.*;
@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name="customer")

public class Customer {
    @Id
    @SequenceGenerator(name="customer_seq",sequenceName="customer_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="customer_seq")
    @Column(name="Customer_ID",unique = true, nullable = false)
    private @NonNull Long cusId;
    private @NonNull String customerName;
    private @NonNull String customerID;
    private @NonNull String addressCustomer;


}




