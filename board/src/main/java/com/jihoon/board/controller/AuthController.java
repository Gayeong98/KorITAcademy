package com.jihoon.board.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jihoon.board.common.constant.ApiPattern;
import com.jihoon.board.dto.response.ResponseDto;
import com.jihoon.board.dto.response.auth.SignUpDto;
import com.jihoon.board.dto.response.auth.SignUpResponseDto;
import com.jihoon.board.service.AuthService;

@RestController
@RequestMapping(ApiPattern.AUTH)
public class AuthController {
    
    @Autowired private AuthService authService;

    private final String SIGN_UP = "/sign-up";

    @PostMapping(SIGN_UP)
    public ResponseDto<SignUpResponseDto> signUp(@Valid @RequestBody SignUpDto requestbody) {
        ResponseDto<SignUpResponseDto> response = authService.signUp(requestbody);
        return response;
    }

}
