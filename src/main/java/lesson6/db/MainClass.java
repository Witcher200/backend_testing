package lesson6.db;

import lesson6.db.dao.ProductsMapper;
import lesson6.db.model.CategoriesExample;
import lesson6.db.model.ProductsExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MainClass {

	  public static void main(String[] args) throws IOException {
			String resource = "mybatisConfig.xml";
			InputStream is = Resources.getResourceAsStream(resource);

			System.out.println(countNumberOfAllCategories());
		//	new SqlSessionFactoryBuilder().build(is);
			db.dao.CategoriesMapper categoriesMapper = getCategoriesMapper(resource);
			CategoriesExample cat_example = new CategoriesExample();
			System.out.println(categoriesMapper.countByExample(cat_example));

			long cat_id = 1;
			System.out.println("by ID - " + categoriesMapper.selectByPrimaryKey(cat_id).getTitle());

			System.out.println("select всех категорий");
			categoriesMapper.selectByExample(cat_example).forEach(category ->
				System.out.println(category.getId() + " " + category.getTitle()));

			ProductsExample pr_examp = new ProductsExample();
			db.dao.ProductsMapper productMap = getProductsMapper(resource);
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

			//Создание новой категории
			db.model.Categories new_cat = new db.model.Categories();
			cat_id = 10;

			new_cat.setId(cat_id);
			new_cat.setTitle("Clothes");
			//categoriesMapper.insert(new_cat);

			db.model.Products new_prod = new db.model.Products();
			cat_id = 10;

			new_prod.setId(cat_id);
			new_prod.setTitle("wwwww");
			productMap.insert(new_prod);


			//select по ID

	  }

	  static Integer countNumberOfAllCategories() throws IOException {
			String resource = "mybatisConfig.xml";
			db.dao.CategoriesMapper categoriesMapper = getCategoriesMapper(resource);
			db.model.CategoriesExample example = new db.model.CategoriesExample();
			return Math.toIntExact(categoriesMapper.countByExample(example));
	  }

	  static db.dao.CategoriesMapper getCategoriesMapper(String resource) throws IOException {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSessionFactory.openSession();
			SqlSession session1 = sqlSessionFactory.openSession();
			return session1.getMapper(db.dao.CategoriesMapper.class);
	  }

	  static db.dao.ProductsMapper getProductsMapper(String resource) throws IOException {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSessionFactory.openSession();
			SqlSession session1 = sqlSessionFactory.openSession();
			return session1.getMapper(db.dao.ProductsMapper.class);
	  }
}


