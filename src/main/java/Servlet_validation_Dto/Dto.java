package Servlet_validation_Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Dto {
	@Id
private String Email;
private String Ename;
private int password;
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}



}








