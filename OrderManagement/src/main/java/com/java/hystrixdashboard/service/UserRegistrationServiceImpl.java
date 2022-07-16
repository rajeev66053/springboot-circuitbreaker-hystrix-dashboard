package com.java.hystrixdashboard.service;


import com.java.hystrixdashboard.dto.Seller;
import com.java.hystrixdashboard.service.hystrix.UserRegistrationHystrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    Logger logger = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);
    private UserRegistrationHystrix userRegistrationHystrix;

    public UserRegistrationServiceImpl(UserRegistrationHystrix userRegistrationHystrix) {
        this.userRegistrationHystrix = userRegistrationHystrix;
    }

    @Override
    public String registerSeller(Seller seller) {
        long start = System.currentTimeMillis();
        String registerSeller = userRegistrationHystrix.registerSeller(seller);
        logger.info("add seller call returned in - {}", System.currentTimeMillis() - start);
        return registerSeller;
    }

    @Override
    public List<Seller> getSellersList() {
        return userRegistrationHystrix.getSellersList();
    }
}