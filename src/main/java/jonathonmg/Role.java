package jonathonmg;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Role {

	public Role() {
	}

	public Role(String name, boolean filterable, List<Permission> permissions) {
		super();
		this.name = name;
		this.filterable = filterable;
		this.permissions = permissions;
	}

	@JacksonXmlProperty(isAttribute = true)
	private String name;

	@JacksonXmlProperty(isAttribute = true)
	private boolean filterable;

	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "permission")
	private List<Permission> permissions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFilterable() {
		return filterable;
	}

	public void setFilterable(boolean filterable) {
		this.filterable = filterable;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Role [name=" + name + ", filterable=" + filterable + ", permissions="
				+ (permissions != null ? permissions.subList(0, Math.min(permissions.size(), maxLen)) : null)
				+ ", getName()=" + getName() + ", isFilterable()=" + isFilterable() + ", getPermissions()="
				+ (getPermissions() != null ? getPermissions().subList(0, Math.min(getPermissions().size(), maxLen))
						: null)
				+ "]";
	}
}