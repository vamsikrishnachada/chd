package com.clitesol.chd.config;

import com.clitesol.chd.model.Customer;
import com.mongodb.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collection;
import java.util.Collections;

@Configuration
@ComponentScan(basePackages = "com.clitesol.chd.service")
@EnableMongoRepositories(basePackages = "com.clitesol.chd.repository")
@EnableMongoAuditing
public class ChdAppConfig extends AbstractMongoConfiguration {

    @Value("${mongodb.name}")
    private String  dbName;

    @Value("${mongodb.host}")
    private String  host;

    @Value("${mongodb.port}")
    private Integer port;

    @Value("${mongodb.username}")
    private String  userName;

    @Value("${mongodb.password}")
    private String  password;


    @Override
    protected String getDatabaseName()
    {
        return this.dbName;
    }

    @Override
    public MongoClient mongoClient()
    {

        return new MongoClient(new ServerAddress(this.host, this.port),
                MongoCredential.createCredential(userName,getDatabaseName(),password.toCharArray()),
                MongoClientOptions.builder().build());
    }

    @Override
    @Bean
    public SimpleMongoDbFactory mongoDbFactory()
    {
        return new SimpleMongoDbFactory(mongoClient(), getDatabaseName());
    }


    @Override
    @Bean
    public MongoTemplate mongoTemplate() throws Exception
    {
        final UserCredentials userCredentials = new UserCredentials(this.userName, this.password);
        final MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory(),super.mappingMongoConverter());
        mongoTemplate.setWriteConcern(WriteConcern.SAFE);

        return mongoTemplate;
    }
    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("com.clitesol.chd.model");
    }


}
