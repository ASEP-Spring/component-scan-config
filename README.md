# Component Scanning

1. Add `@Component` annotations to JdbcNumberStorer and NumberReaderImpl classes.

   Add `@Autowired` to the constructors of NumberReaderImpl and JdbcNumberStorer.
   
   The ReadNumberReporter field in NumberReaderImpl is optional. We can still put an
   `@Autowired` annotation on the setter, but maybe there's an attribute of `@Autowired`
   that allows us to express that the dependency is optional.

   The Main class may also need an annotation to tell Spring to conduct classpath scanning. Additionally
   the ApplicationConfiguration class may need to define some beans for accessing the database...
   
2. Add `@Component` to FileNumberStorer. `@Profile` can be used here just like with the Java configuration
exercise.