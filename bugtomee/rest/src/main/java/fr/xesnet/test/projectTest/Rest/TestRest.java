package fr.xesnet.test.projectTest.Rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.xesnet.test.projectTest.EjbTest;


@Path("/test")
@Stateless
public class TestRest {

	@EJB
	private EjbTest ejbTest;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/version")
	public String version() {
		return ejbTest.getTest();
	}
}
