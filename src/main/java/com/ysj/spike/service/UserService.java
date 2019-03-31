package com.ysj.spike.service;

import com.ysj.spike.domain.User;
import com.ysj.spike.vo.LoginVO;

import javax.servlet.http.HttpServletResponse;

public interface UserService {

    User getById(Long id);

    boolean login(HttpServletResponse response, LoginVO loginVO);
}
