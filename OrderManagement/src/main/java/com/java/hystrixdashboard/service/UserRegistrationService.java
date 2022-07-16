package com.java.hystrixdashboard.service;



import com.java.hystrixdashboard.dto.Seller;

import java.util.List;

public interface UserRegistrationService {
    String registerSeller(Seller seller);

    List<Seller> getSellersList();
}