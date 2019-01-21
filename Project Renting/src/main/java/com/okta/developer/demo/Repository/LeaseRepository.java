package com.okta.developer.demo.Repository;
import com.okta.developer.demo.Entity.Lease;
import com.okta.developer.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collection;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface LeaseRepository extends JpaRepository<Lease, Long>{
}
