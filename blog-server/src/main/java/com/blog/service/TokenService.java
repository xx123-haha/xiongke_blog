package com.blog.service;

import com.api.dto.user.UserDetailsDTO;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @Program: my_blog
 * @Description:
 * @Author: xiongke
 * @Create: 2023-12-01
 */
public interface TokenService {
    UserDetailsDTO getUserDetailInfo(HttpServletRequest request);

    void renewToken(UserDetailsDTO userDetailsDTO);

    String createToken(UserDetailsDTO userDetailsDTO);
}
