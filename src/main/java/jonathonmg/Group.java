package jonathonmg;

public class Group {

	public Group() {
	}

	public Group(String name, String user, String role) {
		super();
		this.name = name;
		this.user = user;
		this.role = role;
	}

	private String name;
	private String user;
	private String role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Group [name=" + name + ", user=" + user + ", role=" + role + ", getName()=" + getName() + ", getUser()="
				+ getUser() + ", getRole()=" + getRole() + "]";
	}

}