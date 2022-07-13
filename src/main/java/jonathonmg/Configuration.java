package jonathonmg;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Configuration {

	public Configuration() {
		super();
	}

	public Configuration(String className, boolean dangerousPermissionsMigrated, List<Role> roles, List<Group> groups) {
		super();
		this.className = className;
		this.dangerousPermissionsMigrated = dangerousPermissionsMigrated;
		this.roles = roles;
		this.groups = groups;
	}

	@JacksonXmlProperty(isAttribute = true, localName = "class")
	private String className;

	@JacksonXmlProperty(isAttribute = true, localName = "dangerous-permissions-migrated")
	private boolean dangerousPermissionsMigrated;

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "role")
	private List<Role> roles;

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "group")
	private List<Group> groups;

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public boolean isDangerousPermissionsMigrated() {
		return dangerousPermissionsMigrated;
	}

	public void setDangerousPermissionsMigrated(String dangerousPermissionsMigrated) {
		this.dangerousPermissionsMigrated = Boolean.parseBoolean(dangerousPermissionsMigrated);
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Configuration [className=" + className + ", dangerousPermissionsMigrated="
				+ dangerousPermissionsMigrated + ", roles="
				+ (roles != null ? roles.subList(0, Math.min(roles.size(), maxLen)) : null) + ", groups="
				+ (groups != null ? groups.subList(0, Math.min(groups.size(), maxLen)) : null) + ", getRoles()="
				+ (getRoles() != null ? getRoles().subList(0, Math.min(getRoles().size(), maxLen)) : null)
				+ ", getGroups()="
				+ (getGroups() != null ? getGroups().subList(0, Math.min(getGroups().size(), maxLen)) : null)
				+ ", getClassName()=" + getClassName() + ", isDangerousPermissionsMigrated()="
				+ isDangerousPermissionsMigrated() + "]";
	}

}
