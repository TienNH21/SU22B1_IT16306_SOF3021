package su22.sof3021.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
	@NotBlank(message="Không được để trống")
	private String hoTen;

	@NotBlank
	private String diaChi;

	@NotNull
	// giới tính chỉ được 2 giá trị: 0 và 1
	private int gioiTinh;

	@NotBlank
	@Email
	// Email đúng định dạng @fpt.edu.vn
	private String email;
	
	@NotBlank
	@Length(min = 6)
	private String password;
	
	@NotBlank
	// SDT đúng định dạng: 0[(24)3789]...
	// SDT có độ dài: 10 số hoặc 11 số
	private String sdt;
	
	@NotBlank
	private String avatar;
}
