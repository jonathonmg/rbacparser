package jonathonmg;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Application {
	public static void main(String[] args) throws ParseException, XMLStreamException, IOException {
		boolean allowPartialMatching = true;
		Options options = new Options();
		CommandLineParser commandLineparser = new DefaultParser(allowPartialMatching);
		options.addOption(Option.builder("i").longOpt("input").argName("input").hasArg().required(true)
				.desc("Full path to the RBAC xml file").build());

		CommandLine command = commandLineparser.parse(options, args);

		XmlMapper mapper = new XmlMapper();
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		FileInputStream inputStream = new FileInputStream(command.getOptionValue("input"));
		XMLStreamReader streamReader = inputFactory.createXMLStreamReader(inputStream);

		RBACSettings rbacSettings = mapper.readValue(streamReader, RBACSettings.class);

		System.out.println(rbacSettings.toString());

	}
}
