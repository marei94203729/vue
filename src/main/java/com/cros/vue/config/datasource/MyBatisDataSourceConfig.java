package com.cros.vue.config.datasource;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author MaLei
 * @description: 多数据源之数据源配置代码。配置数据源、sqlsessionfactory及事物管理器
 * @create 2020/6/24
 */
@Configuration
public class MyBatisDataSourceConfig {
    /**
     * 第一个数据源配置
     */
    @Bean(name="firstDataSource")
    @ConfigurationProperties(prefix="app.datasource.first")//application.properties文件中前缀配置引用
    @Primary//多个数据源时首先注入
    public DataSource firstDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "firstSqlSessionFactory")
    @Primary
    public SqlSessionFactory firstSqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //mybatis分页插件拦截器配置
        Interceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "oracle");
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        interceptor.setProperties(properties);
        bean.setPlugins(new Interceptor[]{interceptor});
        //bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        //System.out.println("一级缓存范围: " + bean.getObject().getConfiguration().getLocalCacheScope());
        //System.out.println("二级缓存是否被启用: " +bean.getObject().getConfiguration().isCacheEnabled());
        return bean.getObject();
    }
    @Bean(name = "firstTransactionManager")
    @Primary
    public DataSourceTransactionManager firstTransactionManager(@Qualifier("firstDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean(name="firstSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate firstSqlSessionTemplate(@Qualifier("firstSqlSessionFactory") SqlSessionFactory sqlSessionFactory)  {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}