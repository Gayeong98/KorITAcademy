package com.jihoon.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jihoon.board.common.constant.ResponseMessage;
import com.jihoon.board.dto.request.auth.SignInDto;
import com.jihoon.board.dto.response.ResponseDto;
import com.jihoon.board.dto.response.auth.SignInResponseDto;
import com.jihoon.board.dto.response.auth.SignUpDto;
import com.jihoon.board.dto.response.auth.SignUpResponseDto;
import com.jihoon.board.entity.UserEntity;
import com.jihoon.board.provider.TokenProvider;
import com.jihoon.board.repository.UserRepository;

@Service
public class AuthService {
    @Autowired private UserRepository userRepository;
    @Autowired private TokenProvider tokenProvider;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public ResponseDto<SignUpResponseDto> signUp(SignUpDto dto) {

        SignUpResponseDto data = null;
        String email = dto.getEmail();
        String telNumber = dto.getTelNumber();
        String password = dto.getPassword();

        try {

            boolean hasEmail = userRepository.existsByEmail(email);
            if(hasEmail) return ResponseDto.setFailed(ResponseMessage.EXIST_EMAIL);

            boolean hasTelnumber = userRepository.existsByTelNumber(telNumber);
            if(hasTelnumber) return ResponseDto.setFailed(ResponseMessage.EXIST_TEL_NUMBER);

            String encodedPaassword = passwordEncoder.encode(password);
            dto.setPassword(encodedPaassword);

            UserEntity userEntity = new UserEntity(dto);
            userRepository.save(userEntity);

            data = new SignUpResponseDto(true);
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }

        return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);
    }

    public ResponseDto<SignInResponseDto> signIn(SignInDto dto) {
        SignInResponseDto data = null;
        UserEntity userEntity = null;
        String email = dto.getEmail();
        String password = dto.getPassword();

        try {
            userEntity = userRepository.findByEmail(email);
            if(userEntity == null) return ResponseDto.setFailed(ResponseMessage.FAIL_SIGN_IN);

            boolean isEqualPassword = passwordEncoder.matches(password, userEntity.getPassword());
            if(!isEqualPassword) return ResponseDto.setFailed(ResponseMessage.FAIL_SIGN_IN);
            

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }

        try {
            String token = tokenProvider.create(email);
            data = new SignInResponseDto(userEntity, token);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.FAIL_SIGN_IN);
        }

        return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);
    }


}
