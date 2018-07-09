package com.trocmedoc.converter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.trocmedoc.common.documents.administration.User;
import com.trocmedoc.common.dto.administration.UserDto;
import com.trocmedoc.persistence.config.TrocmedocConfiguration;
import com.trocmedoc.service.administration.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrocmedocConfiguration.class)
public class ConverterTest {

	@Autowired
	private UserService userService;

	@Test
	public void convertTest() {

		final User mockedUser = createMockedUser();

		final UserDto processedUser = userService.convertToDto(mockedUser, UserDto.class);

		Assert.assertEquals(mockedUser.getId(), processedUser.getId());
		Assert.assertEquals(mockedUser.getFirstName(), processedUser.getFirstName());
		Assert.assertEquals(mockedUser.getLastName(), processedUser.getLastName());
		Assert.assertEquals(mockedUser.getEmail(), processedUser.getEmail());
		Assert.assertEquals(mockedUser.getPassword(), processedUser.getPassword());
	}

	private User createMockedUser() {

		final User mockedUser = new User();

		mockedUser.setId("xxx");
		mockedUser.setFirstName("Barack");
		mockedUser.setLastName("Obama");
		mockedUser.setEmail("barack.obama@white-house.gov");
		mockedUser.setPassword("=+$IOLJ90");
		return mockedUser;
	}
}
