/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.config;

/**
 *
 * @author SUMAN V
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "BD";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
//		return new MongoClient("mongodb3144-donor.jelastic.cloudhosted.es");
            return new MongoClient("127.0.0.1");
	}
}
