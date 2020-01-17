package mapper;


import entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2019/12/11 10:30
 **/
@Repository
public interface UserMapper {
    User selectUserById(Integer id);

    Integer selectIdMax();

    int addOneUser();
}
