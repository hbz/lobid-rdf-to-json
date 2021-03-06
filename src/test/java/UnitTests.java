
/* Copyright 2016 Pascal Christoph. Licensed under the Eclipse Public License 1.0 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Main test suite for all unit tests. The order of execution of the test
 * classes is important for the output of one ist the input of the other.
 * 
 * @author Pascal Christoph (dr0i)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestRdfToJsonConversion.class,
		TestJsonToRdfConversion.class, TestGenerateContext.class })
public final class UnitTests {
	/* Suite class, groups tests via annotation above */
}
