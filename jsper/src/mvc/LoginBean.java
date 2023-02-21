package mvc;

public class LoginBean {

	private String name,mob,pwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}	

public boolean validate()
{
	if (pwd.equals("123456")) 
	{
	 return true;
	}
	else
	{
		return false;
	}	
}
}
