package jonathonmg;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "nectar.plugins.rbac.strategy.RoleMatrixAuthorizationPlugin")
public class RBACSettings {

	public RBACSettings() {
		super();

	}

	public RBACSettings(Date lastModified, List<Role> roles, List<Group> groups) {
		super();
		this.lastModified = lastModified;
	}

	@JacksonXmlProperty(isAttribute = true)
	private String plugin;

	@JacksonXmlProperty(localName = "lastModified")
	private Date lastModified;

	@JacksonXmlProperty(localName = "configuration")
	private Configuration configuration;

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(long lastModified) {
		Date date = new Date();
		date.setTime(lastModified);

		this.lastModified = date;
	}

	public String getPlugin() {
		return plugin;
	}

	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "RBACSettings [plugin=" + plugin + ", lastModified=" + lastModified + ", configuration=" + configuration
				+ ", getLastModified()=" + getLastModified() + ", getPlugin()=" + getPlugin() + ", getConfiguration()="
				+ getConfiguration() + "]";
	}

}