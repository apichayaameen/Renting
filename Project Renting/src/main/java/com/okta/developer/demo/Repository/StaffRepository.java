package com.okta.developer.demo.Repository;
import com.okta.developer.demo.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface StaffRepository extends JpaRepository <Staff, Long>{
    Staff findByStaffId(Long id);
    Staff findByStaffIDs(String staffIDs);

}