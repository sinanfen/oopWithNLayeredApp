package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    //Örneğin Eğer loglama işleminin hepsi (bu projede 3) çalıştırılmak istenirse List<Logger> gibi Dizi kullanılır.

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("ürün fiyatı 10dan az olamaz.");
        }

        productDao.add(product);


        for (Logger logger : loggers) {//[db,mail]
            logger.log(product.getName());
        }


    }
}
