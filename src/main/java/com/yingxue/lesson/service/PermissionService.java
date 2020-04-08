package com.yingxue.lesson.service;

import com.yingxue.lesson.entity.SysPermission;
import com.yingxue.lesson.vo.req.PermissionAddReqVO;
import com.yingxue.lesson.vo.req.PermissionUpdateReqVO;
import com.yingxue.lesson.vo.resp.PermissionRespNodeVO;

import java.util.List;
import java.util.Set;


public interface PermissionService {
    List<SysPermission> selectAll();
    List<PermissionRespNodeVO> selectAllMenuByTree();
    SysPermission addPermission(PermissionAddReqVO vo);
    List<PermissionRespNodeVO> permissionTreeList(String userId);
    List<PermissionRespNodeVO> selectAllTree();
    void updatePermission(PermissionUpdateReqVO vo);
    void deletedPermission(String permissionId);
    Set<String> getPermissionsByUserId(String userId);
    List<SysPermission> getPermission(String userId);
}
