package fr.xesnet.test.projectTest.Rest2;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.xesnet.test.projectTest.EjbTest;


@Path("/test2")
@Stateless
public class TestRest2 {

	@EJB
	private EjbTest ejbTest;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/version2")
	public String version() {
		return ejbTest.getTest();
	}
}
