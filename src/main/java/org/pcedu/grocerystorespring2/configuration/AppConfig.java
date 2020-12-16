package org.pcedu.grocerystorespring2.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration                   //dinei odhgies sto jvm, gia to pws trexei to project, h class me @configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.pcedu.grocerystorespring2")      //entolh na kanei scan sto path auto mhpws vrei kai alla configuration files
public class AppConfig {
	
	@Bean
	public ViewResolver viewResolver() {                // se stelnei sta jsp arxeia 
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
	
//	@Bean
//	public MessageSource messageSource() {
//	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//	    messageSource.setBasename("messages");
//	    return messageSource;
//	}
}

