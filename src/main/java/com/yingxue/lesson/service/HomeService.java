package com.yingxue.lesson.service;

import com.yingxue.lesson.vo.resp.HomeRespVO;


public interface HomeService {
    HomeRespVO getHome(String userId);
}
