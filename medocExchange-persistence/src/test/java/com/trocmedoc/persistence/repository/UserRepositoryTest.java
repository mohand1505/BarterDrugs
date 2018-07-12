package com.trocmedoc.persistence.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.trocmedoc.common.documents.administration.User;
import com.trocmedoc.persistence.config.TrocmedocConfiguration;
import com.trocmedoc.persistence.repository.administration.UserRepository;

/**
 * The Class UserRepositoryTest.
 *
 * @author andriantomanga
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrocmedocConfiguration.class)
public class UserRepositoryTest {

	/** The user repository. */
	@Autowired
	private UserRepository userRepository;

	/** The Constant FOR_TEST_USER_ID. */
	private static final String FOR_TEST_USER_ID = "for-test-user-id";

	/**
	 * Before.
	 */
	@Before
	public void before() {

		// adding faked user ...

		final User Obama = new User();

		Obama.setId(FOR_TEST_USER_ID);
		Obama.setFirstName("Barack");
		Obama.setLastName("Obama");
		Obama.setEmail("barack.obama@white-house.gov");
		Obama.setPassword("=+$IOLJ90");

		userRepository.save(Obama);
	}

	/**
	 * After.
	 */
	@After
	public void after() {

		// deleting the for test user ...
		userRepository.delete(userRepository.findOne(FOR_TEST_USER_ID));
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {

		// insertion success verification ...
		Assert.assertTrue(userRepository.findOne(FOR_TEST_USER_ID) != null);
	}

}
