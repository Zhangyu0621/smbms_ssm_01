import cn.smbms.dao.BaseDao;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;

public class BaseDaoTest {

    @Test
    public void Conntest(){
        Connection connection= BaseDao.getConnection();
        if(connection!=null){
            System.out.println("连接成功！");
        }
    }


}
