package org.wecancodeit.medicinecabinetapp.service;

import java.util.HashSet;

import org.wecancodeit.medicinecabinetapp.base.classes.Role;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;

import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	    @Transactional(readOnly = true)
	    public UserDetails loadUserByUsername(String username) {
	    User user = userRepository.findByUserName(username);
        if (user == null) throw new UsernameNotFoundException(username);

      Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
       for (Role role : user.getRoles()){
          grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
	
       }
       return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getUserPassword(),grantedAuthorities);

}}
