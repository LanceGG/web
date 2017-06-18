package User;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.user.dao.UserDao;
import com.user.domain.User;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Lance on 2017/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:TEST_BASE.xml"
})
@Transactional(transactionManager = "transactionManager")
@Rollback(true)
public class UserDaoTest{

    @Autowired
    private UserDao userDao;

    private User user;

    @Before
    public void before() {
        user = new User();
        user.setEmail("12");
        user.setMobile("12");
        user.setIcon("12");
        user.setName("12");
        userDao.add(user);
    }

    @Test
    public void add() {
        assertThat(user.getId()).isNotNull();
    }

    @Test
    public void findById() {
        userDao.findById(1);
    }
}
