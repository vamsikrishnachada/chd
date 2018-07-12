package com.clitesol.chd.controller;

import com.clitesol.chd.model.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface BaseRestController {

    public ResponseEntity<BaseResponse> monitor();
}
