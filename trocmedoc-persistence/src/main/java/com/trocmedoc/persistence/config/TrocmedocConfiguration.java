package com.trocmedoc.persistence.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * @author andriantomanga
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.trocmedoc.persistence.repository")
@PropertySources({ @PropertySource("classpath:/com/trocmedoc/persistence/config/mongo.properties"),

		/* override propertie on production env */
		@PropertySource(value = "file:${trocmedoc_home}/config/mongo.properties", ignoreResourceNotFound = true) })
public class TrocmedocConfiguration extends AbstractMongoConfiguration {

	@Autowired
	Environment env;

	@Override
	protected String getDatabaseName() {

		return env.getProperty("db.name");
	}

	@Override
	public Mongo mongo() throws Exception {

		return new MongoClient(env.getProperty("db.host"), Integer.parseInt(env.getProperty("db.port")));
	}

	@Override
	protected String getMappingBasePackage() {

		return "com.trocmedoc";
	}

}
