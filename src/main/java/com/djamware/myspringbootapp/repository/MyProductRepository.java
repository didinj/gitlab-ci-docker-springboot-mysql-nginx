package com.djamware.myspringbootapp.repository;

import com.djamware.myspringbootapp.entity.MyProduct;
import org.springframework.data.repository.CrudRepository;

public interface MyProductRepository extends CrudRepository<MyProduct, Integer> {
}
