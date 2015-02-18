/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.calfonso.aurum.spring.datos.config;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.calfonso.aurum.spring.datos.MarcadorDatosComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 *
 * @author cesar
 */
@Configuration
@ComponentScan(basePackageClasses = MarcadorDatosComponentScan.class)
public class JpaConfig {

    private static final String SCHEMA_NAME = "aurum";
    private static final String PATH_SQL_SCRIPTS = "src/main/resources/META-INF/db/scripts/";

    //DataSource Bean
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .setName(SCHEMA_NAME)
                .build();
    }

    //EntityManagerFactory Bean
    @Bean
    public EntityManagerFactory entityManagerFactoryBean(
            DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setJpaProperties(jpaProperties());
        factoryBean.setPackagesToScan(getPackageNameToScan());
        factoryBean.afterPropertiesSet();

        return factoryBean.getObject();
    }

    //JpaVendorAdapter Bean
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setDatabase(Database.H2);
        jpaVendorAdapter.setShowSql(true);

        return jpaVendorAdapter;
    }

    //Jpa Properties Bean
    @Bean
    public Properties jpaProperties() {
        Properties jpaProperties = new Properties();
        //Indica la acción a ejecutar sobre el esquema de la BD (drop-and-create)
        jpaProperties.put("javax.persistence.schema-generation.database.action", "drop-and-create");
        //Indica qué tipo de scripts van a ser generados por el proveedor de persistencia
        jpaProperties.put("javax.persistence.schema-generation.scripts.action", "drop-and-create");
        //Indica el nombre del archivo que representará el script de creacion del esquema
        jpaProperties.put("javax.persistence.schema-generation.scripts.create-target", PATH_SQL_SCRIPTS + "aurum-create.sql");
        //Indica el nombre del archivo que representa el script de eliminación del esquema
        jpaProperties.put("javax.persistence.schema-generation.scripts.drop-target", PATH_SQL_SCRIPTS + "aurum-drop.sql");
        jpaProperties.put("javax.persistence.sql-load-script-source", PATH_SQL_SCRIPTS + "insert-establecimiento.sql");
        //jpaProperties.put("javax.persistence.database-product-name", "H2");

        return jpaProperties;
    }
    
    //TransactionManager Bean
    @Configuration
    @EnableTransactionManagement
    public static class TransactionConfig implements TransactionManagementConfigurer {
        @Autowired
        private EntityManagerFactory emf;
        
        @Override
        public PlatformTransactionManager annotationDrivenTransactionManager() {
            return new JpaTransactionManager(emf);
        }
    }

    private String getPackageNameToScan() {
        return org.calfonso.aurum.spring.datos.entidades.Asentamiento.class
                .getPackage().getName();
    }
}
