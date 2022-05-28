package su22.sof3021.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import su22.sof3021.beans.AccountModel;
import su22.sof3021.entities.Account;
import su22.sof3021.repositories.AccountRepository;

@Controller
@RequestMapping("/admin/accounts")
public class AccountController {
	@Autowired
	private AccountRepository accountRepo;
	
	@GetMapping("/create")
	public String create(@ModelAttribute("account") AccountModel acc)
	{
		return "admin/accounts/create";
	}
	
	@PostMapping("/store")
	public String store(AccountModel model)
	{
		Account acc = new Account();
		
		acc.setFullname(model.getFullname());
		acc.setUsername(model.getUsername());
		acc.setEmail(model.getEmail());
		acc.setPassword(model.getPassword());
		acc.setPhoto(model.getPhoto());
		acc.setAdmin(model.getAdmin());
		acc.setActivated(0);
		
		this.accountRepo.save(acc);
		
		return "redirect:/admin/accounts/create";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Account account)
	{
		System.out.println(account.getEmail());
		// Account a = this.accountRepo.getById(id);

		return "redirect:/admin/accounts/create";
	}
}
