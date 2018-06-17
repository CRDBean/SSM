package com.imooc.handlers;

import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginHandler {

	/*
	 * ��¼action
	 */
	@RequestMapping("/login.action")
	public String login(String username, String password, Map<String, Object> map) {

		System.out.println("LoginHandler   login...");

		// ��õ�ǰSubject
		Subject currentUser = SecurityUtils.getSubject();
		// ��֤�û��Ƿ���֤�����Ƿ��¼
		if (!currentUser.isAuthenticated()) {
			String msg = "";
			// ���û����������װΪ UsernamePasswordToken ����
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);

			// remembermMe��ס����
			token.setRememberMe(true);
			try {
				// ִ�е�¼.
				currentUser.login(token);

				// ��¼�ɹ�...
				return "redirect:/list.jsp";
			} catch (IncorrectCredentialsException e) {
				msg = "��¼�������";
				System.out.println("��¼�������!!!" + e);
			} catch (ExcessiveAttemptsException e) {
				msg = "��¼ʧ�ܴ�������";
				System.out.println("��¼ʧ�ܴ�������!!!" + e);
			} catch (LockedAccountException e) {
				msg = "�ʺ��ѱ�����";
				System.out.println("�ʺ��ѱ�����!!!" + e);
			} catch (DisabledAccountException e) {
				msg = "�ʺ��ѱ�����";
				System.out.println("�ʺ��ѱ�����!!!" + e);
			} catch (ExpiredCredentialsException e) {
				msg = "�ʺ��ѹ���";
				System.out.println("�ʺ��ѹ���!!!" + e);
			} catch (UnknownAccountException e) {
				msg = "�ʺŲ�����";
				System.out.println("�ʺŲ�����!!!" + e);
			} catch (UnauthorizedException e) {
				msg = "��û�еõ���Ӧ����Ȩ��";
				System.out.println("��û�еõ���Ӧ����Ȩ��" + e);
			} catch (Exception e) {
				System.out.println("��������" + e);
			}
			map.put("msg", msg);
			return "/login";
		}

		// ��¼�ɹ����ض���list.jsp
		return "redirect:/list.jsp";

	}

}
