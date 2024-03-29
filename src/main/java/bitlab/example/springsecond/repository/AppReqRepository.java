package bitlab.example.springsecond.repository;

import bitlab.example.springsecond.model.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppReqRepository extends JpaRepository<ApplicationRequest, Long> {

}
