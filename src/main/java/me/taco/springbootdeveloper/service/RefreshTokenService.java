package me.taco.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.taco.springbootdeveloper.domain.RefreshToken;
import me.taco.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refeshToken){
        return refreshTokenRepository.findByRefreshToken(refeshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}
