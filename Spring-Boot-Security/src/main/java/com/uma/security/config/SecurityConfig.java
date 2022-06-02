package com.uma.security.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	@Autowired private UserDetailsService vUserDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider vProvider= new DaoAuthenticationProvider();
		vProvider.setUserDetailsService(vUserDetailsService);
		//vProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); //(umayadav : pass@12)
		vProvider.setPasswordEncoder(new BCryptPasswordEncoder());  //(umas : pass1234
		return vProvider;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeHttpRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.and()
		.logout().invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/logout-success").permitAll();
	}*/
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeHttpRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated()
		.and()
		.httpBasic();
	}
	
	
	/*get credentials from predefined user object
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		List<UserDetails> vUsers= new ArrayList<>();
		vUsers.add(User.withDefaultPasswordEncoder().username("uma").password("pass").roles("USER").build());
		return new InMemoryUserDetailsManager(vUsers);
	}
	*/

	
}
