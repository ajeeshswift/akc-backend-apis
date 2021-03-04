package com.swift.akc.service;


import com.swift.akc.entity.CommunityFlora;

import java.util.List;

public interface FloraService {

    List<CommunityFlora> getSortFlora(String query);

}
