package com.imooc.realms;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.imooc.service.UserService;
/*
 * �̳�AuthorizingRealm��ʵ��doGetAuthenticationInfo(��֤)������doGetAuthorizationInfo(��Ȩ����)
 */
public class ShiroRealm  extends  AuthorizingRealm{

	
	/**
	 * �������ڼ���
	 * ������AuthenticationToken�Ǵӱ���������װ�õĶ���
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("doGetAuthenticationInfo:"+token);
        
        //��AuthenticationTokenǿתΪAuthenticationToken����
        UsernamePasswordToken upToken=(UsernamePasswordToken)token;
        
        //��ôӱ����������û���
        String username=upToken.getUsername();
        
        //�����ݿ�鿴�Ƿ�����û�
        UserService userService=new UserService();
        
        //����û������ڣ��״��쳣
        if(!userService.selectUsername(username)){
        	throw new UnknownAccountException("�޴��û�����");
        }
        

        
        //��֤��ʵ����Ϣ��������username��Ҳ�������û���ʵ������������õ��û���
        Object principal=username;    
        //�����ݿ��в�ѯ������   
        Object credentials=userService.selectPassword(username);           
        //��ֵ���ܵ��գ��������û���
        ByteSource credentialsSalt=ByteSource.Util.bytes(username);       
        //��ǰrealm��������ƣ����÷����getName()
        String realmName=this.getName();
        
        
        //����SimpleAuthenticationInfo���󣬲��Ұ�username��password����Ϣ��װ������
        //�û�����ıȶ���Shiro��������ɵ�
        SimpleAuthenticationInfo info=null;
        info=new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
        return info;
	}

	
	//������Ȩ
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		//��PrincipalCollection�л���û���Ϣ
		Object principal=principals.getPrimaryPrincipal();
		System.out.println("ShiroRealm  AuthorizationInfo:"+principal.toString());
		
		
		//�����û�������ѯ���ݿ⸳���û�Ȩ�ޣ������ݿ⣩
		Set roles=new HashSet<>();
		roles.add("user");
		if("admin".equals(principal)){
			roles.add("admin");
		}
		
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo(roles);
 		
		
		
		
		
		
		return info;
		//return null;
	}

	

}
