package com.swift.akc.service;

import com.swift.akc.entity.CommunityFlora;
import com.swift.akc.repository.CommunityFloraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FloraServiceImpl implements FloraService{
    private final CommunityFloraRepository communityFloraRepository;
    @Override
    public List<CommunityFlora> getSortFlora() {
        return communityFloraRepository.findAll();
    }




}
