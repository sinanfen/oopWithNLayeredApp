package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        System.out.println("JDBC ile veritabanına eklendi");

        //Java Database Connectivity-> JDBC
        //Java Database Connectivity, Java programlama dilinde yazılmış uygulamaların
        //veritabanı ile etkileşime girmesini sağlayan bir uygulama programlama arayüzüdür.
        //JDBC ile hemen hemen tüm ilişkisel veri tabanı yönetim sistemlerine SQL sorgusu gönderilebilmektedir
    }
}
