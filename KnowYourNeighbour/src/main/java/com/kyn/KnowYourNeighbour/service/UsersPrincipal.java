package com.kyn.KnowYourNeighbour.service;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import com.kyn.KnowYourNeighbour.dao.Users;




//UserDetails is the default built-in interface in Spring Boot
//Create Role User
//UsersPricipal - our custom userDetils 
//It returns usersPrincipal Object 
//Spring Security use information stored in UsersPrinciplal to perform 
//authentication and authorization

	

	//UserDetails is the default built-in interface entity in Spring Boot
	//We need to implement UserDetails as use email, password and authorities <<autho,authen>>
	//Create Role User
	//UsersPricipal - our custom userDetils 
	//It returns usersPrincipal Object 
	//Spring Security use information stored in UsersPrinciplal to perform 
	//authentication and authorization
	public class UsersPrincipal implements UserDetails, OAuth2User{
		
		private static final long serialVersionUID = 1L;
		
		private long userId;
		private String email;
		private String password;
		private Collection<? extends GrantedAuthority> authorities;
		private Map<String, Object> attributes;

		public UsersPrincipal(long userId, String email, String password,
				Collection<? extends GrantedAuthority> authorities) {
			super();
			this.userId = userId;
			this.email = email;
			this.password = password;
			this.authorities = authorities;
		}

		//createUser Method for Role User
		//It returns usersPrincipal object which is included userId, email, password, ROLE_USER
		public static UsersPrincipal createUser(Users users) {
			List<GrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
			UsersPrincipal usersPrincipal = new UsersPrincipal(users.getUserId(), users.getEmail(), users.getPassword(), authorities);
			return usersPrincipal;
		}
		
		//It returns usersPrincipal for Google or Facebook Login
		public static UsersPrincipal createUser(Users user, Map<String, Object> attributes) {
	        UsersPrincipal userPrincipal = UsersPrincipal.createUser(user);
	        userPrincipal.setAttributes(attributes);
	        return userPrincipal;
	    }
			
		
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public void setAttributes(Map<String, Object> attributes) {
			this.attributes = attributes;
		}

		public long getUserId() {
			return userId;
		}

		public void setUserId(long userId) {
			this.userId = userId;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
			this.authorities = authorities;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return authorities;
		}

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return password;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return email;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public Map<String, Object> getAttributes() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return String.valueOf(userId);
		}
		
		
	}