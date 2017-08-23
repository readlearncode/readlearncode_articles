## jax-rs-context
This module contains the code that acompanies the series of articles about what the javax.ws.rs.core.context class is and the many different ways the @Context annotation os used to injects instances of the following objects:

* HttpHeaders -> HTTP header parameters and values
* UriInfo -> Captures path variables and query parameters
* SecurityContext -> Provides access to security related information for a request
* ResourceContext -> Provides access to instances of resource classes
* Request -> Precondition request processing
* Application, Configuration, and Providers -> Provide information about the JAX-RS application environment
* HttpServletRequest -> Provides access to the HttpServletRequest instance
* HttpServletResponse -> Provides access to the HttpServletResponse instance
* ServletConfig -> Provides access to the ServletConfig
* ServletContext -> Provides access to the ServletContext 
