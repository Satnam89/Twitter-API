package controllers;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.BAD_REQUEST;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

import org.junit.Test;

import play.mvc.Http.RequestBuilder;
import play.mvc.Result;
import play.test.Helpers;
import play.test.WithApplication;


/**
 *Tests the controller HomeController 
 * @author Kamalpreet Kaur
 *
 */
public class HomeControllerTest extends WithApplication {
	/**
	 * Tests whether index action method redirects correctly.
	 */
	@Test
    public void testIndex() {
        RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(BAD_REQUEST, result.status());
	}
	
	@Test
    public void testGetUser() {
        RequestBuilder request = Helpers.fakeRequest()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(BAD_REQUEST, result.status());
	}


}

