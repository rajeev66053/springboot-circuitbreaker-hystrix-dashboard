package com.java.hystrixdashboard.service;


import com.java.hystrixdashboard.dto.Seller;

import java.util.List;

public interface RegistrationService {

    String addSeller(Seller seller);

    List<Seller> getSellersList();
}