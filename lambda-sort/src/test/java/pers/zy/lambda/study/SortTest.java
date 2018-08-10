package pers.zy.lambda.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import pers.zy.lambda.study.domain.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SortTest {

    @Test
    public void should_sort_users_by_age() {
        List<User> users = Arrays.asList(new User("zz", 12), new User("zzz", 1), new User("z", 5));
        Collections.sort(users, Comparator.comparing(User::getAge));
        assertEquals(1, users.get(0).getAge());
        assertEquals(5, users.get(1).getAge());
        assertEquals(12, users.get(2).getAge());
    }
}
