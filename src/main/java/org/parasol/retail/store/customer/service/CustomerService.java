package org.parasol.retail.store.customer.service;

import io.smallrye.common.annotation.Blocking;
import org.parasol.retail.store.customer.model.dto.CustomerDto;
import org.parasol.retail.store.customer.model.dto.CustomerMapper;
import org.parasol.retail.store.customer.model.entity.Customer;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class CustomerService {

    @Transactional
    @Blocking
    public CustomerDto getCustomerByCustomerId(String userId) {
        return CustomerMapper.toDto(Customer.findByUserId(userId));
    }

}
