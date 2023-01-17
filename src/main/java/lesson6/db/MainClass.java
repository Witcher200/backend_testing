import db.dao.CategoriesMapper;
import db.dao.ProductsMapper;
import db.model.Categories;
import db.model.CategoriesExample;
import db.model.ProductsExample;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;


public class lesson6 {

    public static void main(String[] args) throws IOException {
        //    SqlSessionFactory sqlSessionFactory;
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
  //      sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        sqlSessionFactory.
        System.out.println(countNumberOfAllCategories());
        CategoriesMapper categoriesMapper = getCategoriesMapper(resource);
        CategoriesExample cat_example = new CategoriesExample();
        System.out.println(categoriesMapper.countByExample(cat_example));

       //Создание новой категории
        Categories new_cat = new Categories();

        new_cat.setId(3L);
        new_cat.setTitle("Clothes");
        categoriesMapper.insert(new_cat);

        //select по ID
        System.out.println("by ID - " + categoriesMapper.selectByPrimaryKey(1L).getTitle());

        System.out.println("select всех категорий");
        categoriesMapper.selectByExample(cat_example).forEach(category ->
                System.out.println(category.getId() + " " + category.getTitle()));

      /*  cat_id = 12;
        categoriesMapper.deleteByPrimaryKey(cat_id);
        categoriesMapper.selectByExample(cat_example).forEach(category ->
                System.out.println(category.getId() + " " + category.getTitle()));
*/
        ProductsExample pr_examp = new ProductsExample();
        ProductsMapper productMap = getProductsMapper(resource);
        long id = 3;
        System.out.println( productMap.selectByPrimaryKey(id).getTitle() + " " + productMap.selectByPrimaryKey(id).getPrice() );

        System.out.println(productMap.countByExample(pr_examp));


         id = 10;
        productMap.deleteByPrimaryKey(id);
        //        System.out.println(productMap.selectByPrimaryKey(id).toString()) ;

      try {
            productMap.selectByPrimaryKey(id).getId();
        } catch (NullPointerException e) {
            System.out.println("ID " + id + " not found");
        }

    }

    public static Integer countNumberOfAllCategories()  throws IOException {
        String resource = "mybatis-config.xml";
        CategoriesMapper categoriesMapper = getCategoriesMapper(resource);
        CategoriesExample example = new CategoriesExample();
        return Math.toIntExact(categoriesMapper.countByExample(example));
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

