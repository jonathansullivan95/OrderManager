package com.sullivanj.ordermanager.repository;

import com.sullivanj.ordermanager.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<CustomerOrder, Long> {
}
