package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user1;

    @Before
    public void setUp() {
        user1 = new User("user1_666", "user1", "user1@user.com", "18829290101", "user1_password");
    }

    @Test
    public void shouldReturnUserDetail() {
        assertEquals("name:user1 email:user1@user.com phoneNumber:18829290101", user1.getUserDetail());
    }

    @Test
    public void shouldReturnTrueWhenHaveCorrectPassInformation() {
        assertTrue(user1.checkAccount("user1_666", "user1_password"));
    }

    @Test
    public void shouldReturnFalseWhenHaveIncorrectPassInformation() {
        assertFalse(user1.checkAccount("00000", "123456"));
    }

}
