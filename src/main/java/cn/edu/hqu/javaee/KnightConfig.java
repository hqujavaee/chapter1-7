package cn.edu.hqu.javaee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
	@Bean
	public Knight Knight() {
		return new BraveKnight(quest());
		}
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}

}
