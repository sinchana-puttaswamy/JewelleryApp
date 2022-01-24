package com.torryharris.JwelleryListingApp.repository;

import com.torryharris.JwelleryListingApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long>{
    List<Product> findAllByCategory_Id(int id);
    @Query(value = "select * from product where name like ?",nativeQuery = true)
    public List<Product> search(String keyword);
}
