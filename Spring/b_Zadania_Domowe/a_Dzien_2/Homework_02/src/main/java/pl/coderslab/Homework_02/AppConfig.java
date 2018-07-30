package pl.coderslab.Homework_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages	=	"pl.coderslab.Homework_02")
public	class	AppConfig	extends	WebMvcConfigurerAdapter	{
		@Bean
		public	ViewResolver	viewResolver()	{
				InternalResourceViewResolver	viewResolver	=
				new	InternalResourceViewResolver();
				viewResolver.setPrefix("/WEB-INF/views/");
				viewResolver.setSuffix(".jsp");
				return	viewResolver;
		}
}