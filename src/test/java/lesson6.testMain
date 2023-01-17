package Tests;

import db.dao.CategoriesMapper;
import db.dao.ProductsMapper;
import db.model.Categories;
import db.model.CategoriesExample;
import db.model.Products;
import db.model.ProductsExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class testMain {

    @Test
    void CategoriesTests()  throws IOException { //    SqlSessionFactory sqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        //      sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        sqlSessionFactory.
        //   assertThat(countNumberOfAllCategories(), equalTo(2));
        CategoriesMapper categoriesMapper = getCategoriesMapper(resource);
        CategoriesExample cat_example = new CategoriesExample();
        assertThat(categoriesMapper.countByExample(cat_example), equalTo(2L));

        //Создание новой категории
        Categories new_cat = new Categories();
        long cat_id = 3;

        new_cat.setId(cat_id);
        new_cat.setTitle("Clothes");
        categoriesMapper.insert(new_cat);

        assertThat(categoriesMapper.countByExample(cat_example), equalTo(3L));

        cat_id = 1;
        assertThat(categoriesMapper.selectByPrimaryKey(cat_id).getTitle(), equalTo("Food"));
    }


    @Test
    void ProductsTests()   throws IOException {
        String resource = "mybatis-config.xml";
        ProductsExample pr_examp = new ProductsExample();
        ProductsMapper productMap = getProductsMapper(resource);

        long id = 3;
        assertThat(productMap.selectByPrimaryKey(id).getTitle(), equalTo("Cheese"));

        id = 10;
        productMap.deleteByPrimaryKey(id);
        assertThat(productMap.selectByPrimaryKey(id), equalTo(null));
    }


    @Test
    void AddNewProduct() throws IOException {
        String resource = "mybatis-config.xml";
        ProductsMapper productsMapper = getProductsMapper(resource);
        ProductsExample productsExample = new ProductsExample();

        //Создание нового продукта
        Products new_product = new Products();
        long product_id = 7;

        assertThat(productsMapper.countByExample(productsExample), equalTo(5L));

        new_product.setId(product_id);
        new_product.setTitle("Watermelon");
        new_product.setPrice(150);
        productsMapper.insert(new_product);

      assertThat(productsMapper.countByExample(productsExample), equalTo(6L));
    }


    private static CategoriesMapper getCategoriesMapper(String resource)  throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        sqlSessionFactory.openSession();
        SqlSession session = sqlSessionFactory.openSession();
        return session.getMapper(CategoriesMapper.class);
    }

    private static ProductsMapper getProductsMapper(String resource)  throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        sqlSessionFactory.openSession();
        SqlSession session = sqlSessionFactory.openSession();
        return session.getMapper(ProductsMapper.class);
    }


}

