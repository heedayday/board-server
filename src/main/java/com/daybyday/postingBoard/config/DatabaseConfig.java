package com.daybyday.postingBoard.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/*@Configuration @Bean 세트로 사용해서 빈 등록 https://blogshine.tistory.com/551
* 스코프를 지정할 수도 있음 https://innovation123.tistory.com/214 */

@Configuration
public class DatabaseConfig {
    @ConfigurationProperties(prefix = "spring.datasource")  // application properties 파일 prefix 부분을 가져올 수 있음 https://blog.yevgnenll.me/posts/spring-configuration-properties-fetch-application-properties
    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    } // 직접 등록하기와 @ConfigurationProperties를 사용하여 build 하는 방법이 있음 https://escapefromcoding.tistory.com/711
}


