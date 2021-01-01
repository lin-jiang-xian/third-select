import com.tianshu.spring.web.dao.ProvinceDao;
import com.tianshu.spring.web.domain.Province;
import com.tianshu.spring.web.service.ProvinceService;
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
        List<Province> provinces = provinceDao.selectProvinceByIdWithCities(23);
        for (Province province : provinces) {
            System.out.println(province);

        }
    }
}
