package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 应用配置
 * @author RanJi
 *
 */
@Configuration
@ComponentScan({"dao","service","controller"})

public class AppConfig {
	
}
