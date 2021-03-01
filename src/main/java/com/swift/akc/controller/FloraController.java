package com.swift.akc.controller;

import com.swift.akc.dto.FloraDTO;
import com.swift.akc.dto.ResponseListDTO;
import com.swift.akc.entity.CommunityFlora;
import com.swift.akc.service.FloraService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/floraController")
public class FloraController {

    private final FloraService floraService;
    @GetMapping("/getFlora")
    public ResponseListDTO getFlora(@RequestParam("query") String query) {
        final ResponseListDTO responseListDTO = new ResponseListDTO();
        responseListDTO.setData(CommunityFlora.toDTOList(floraService.getSortFlora()));
        return responseListDTO;
    }



}
