package com.dyheart.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class EmailValidatorTest {
	
	private final EmailValidator underTest = new EmailValidator();

	@Test
	public void itShouldValidateCorrectEmail() {
		assertThat(underTest.test("hello@gmail.com")).isTrue();
	}
	
	@Test
	public void itShouldValidateAnInCorrectEmail() {
		assertThat(underTest.test("hellogmail.com")).isFalse();
	}
	
	@Test
	public void itShouldValidateAnInCorrectEmailWithoutDatAtTheEnd() {
		assertThat(underTest.test("hello@gmail")).isFalse();
	}

}
