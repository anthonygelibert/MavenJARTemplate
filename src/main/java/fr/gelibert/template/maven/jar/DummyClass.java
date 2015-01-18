package fr.gelibert.template.maven.jar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

/**
 * Dummy class to get an entry point.
 *
 * @author Anthony GELIBERT
 * @version 1.0.0
 */
public final class DummyClass {
    /** Resource bundle. */
    private static final ResourceBundle RESOURCE = ResourceBundle.getBundle("labels"); /* NON-NLS */
    /** Logger. */
    private static final Logger         LOGGER   = LogManager.getLogger(DummyClass.class);

    /** Fordidden. */
    private DummyClass() {}

    /** No args. */
    public static void main(final String... args) {
        LOGGER.fatal(RESOURCE.getString("DUMMY_STRING"));
    }
}
