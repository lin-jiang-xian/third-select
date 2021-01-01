import com.tianshu.web.thirdselect.beans.Province;
import com.tianshu.web.thirdselect.dao.ProvinceDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestProvince {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        ProvinceDao provinceDao = (ProvinceDao) ac.getBean("provinceDao");
        List<Province> provinces = provinceDao.selectProvinceByPid(1);
        for (Province province : provinces) {
            System.out.println(province);

        }
    }

}
