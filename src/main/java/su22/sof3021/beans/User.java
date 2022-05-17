package su22.sof3021.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String hoTen;
	private String diaChi;
	private int gioiTinh;
	private String email;
	private String password;
	private String sdt;
	private String avatar;
}
