package com.okta.developer.demo.Entity;
import lombok.*;
import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Product {
    @Id
    @SequenceGenerator(name="product_seq",sequenceName="product_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_seq")
    @Column(name="Product_ID",unique = true, nullable = false)

    private  Long prodId;
    private @NonNull String productName;
    private @NonNull Integer productQuantity;
    private @NonNull Integer productPrice;
    private @NonNull String productID;
    private @NonNull String statusProduct;





}
