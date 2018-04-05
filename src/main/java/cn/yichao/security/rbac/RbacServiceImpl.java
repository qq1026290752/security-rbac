package cn.yichao.security.rbac;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
@Component("rbacService")
public class RbacServiceImpl  implements RbacService{

	private AntPathMatcher antPathMatcher = new AntPathMatcher();
	
	@Override
	public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
		Object principal = authentication.getPrincipal();
		boolean isPermission = false;
		if(principal instanceof UserDetails) {
			String userName = ((UserDetails)principal).getUsername();
			//读取用户所有的Url
 			Set<String> urls = new HashSet<>();
			urls.add("/hello");
			for (String  url : urls) {
				if (antPathMatcher.match(url, request.getRequestURI())) {
					isPermission = true;
					break;
				}
			}
			return isPermission;
		}
		return isPermission;
	}
}
