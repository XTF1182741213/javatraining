package com.training.maikun.products;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductControllerTest {

    @MockBean
    private ProductService productService;

    @Test
    public void getList() throws Exception {
    }

}