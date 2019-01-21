package com.okta.developer.demo.Entity;
import javax.persistence.*;
import lombok.*;
import java.util.*;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name="Staff")
public class Staff {
    @Id
    @SequenceGenerator(name="staff_seq",sequenceName="staff_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="staff_seq")
    @Column(name="Staff_ID",unique = true, nullable = false)

    private @NonNull Long staffId;
    private @NonNull String staffIDs;
    private @NonNull String staffName;
    private @NonNull String position;




}

