package jonathonmg;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Permission {

	public Permission() {
		super();
	}

	public Permission(String id) {
		super();
		this.id = id;
	}

	@JacksonXmlProperty(isAttribute = true)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", getId()=" + getId() + "]";
	}

}
