package xyz.linkq.gulimall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.linkq.gulimall.product.entity.BrandEntity;
import xyz.linkq.gulimall.product.service.BrandService;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("苹果");
//        brandEntity.setDescript("我是一个小啊小苹果");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功！");
//
//        brandService.updateById(brandEntity);
//        List<BrandEntity> list = brandService.list();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getName());
//        }
    }

}
