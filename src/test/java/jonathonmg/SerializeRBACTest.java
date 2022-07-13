package jonathonmg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

class SerializeRBACTest {

	@Test
	void testRBACSettingsRead() throws XMLStreamException, IOException {
		URL resource = getClass().getClassLoader().getResource("nectar-rbac.xml");
		XmlMapper mapper = new XmlMapper();
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		FileInputStream inputStream = new FileInputStream(resource.getPath());
		XMLStreamReader streamReader = inputFactory.createXMLStreamReader(inputStream);

		RBACSettings rbacSettings = mapper.readValue(streamReader, RBACSettings.class);
		assertNotNull(rbacSettings);
		assertEquals(63, rbacSettings.getConfiguration().getRoles().get(0).getPermissions().size());
	}

}
