package cn.yichao.security.rbac;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;

public interface RbacService {
	/**
	 * 验证用户是否有权登录
	 * @param request
	 * @param authentication
	 * @return
	 */
	boolean hasPermission(HttpServletRequest request ,Authentication authentication);
}
