package su22.sof3021.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import su22.sof3021.entities.Account;

public interface AccountRepository
	extends JpaRepository<Account, Integer> {

}
