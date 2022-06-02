package su22.sof3021.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import su22.sof3021.entities.Account;

public interface AccountRepository
	extends JpaRepository<Account, Integer> {
	
	@Query(name="Account.findByEmail")
	public Account findByEmail(String email);
}
