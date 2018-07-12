package com.trocmedoc.persistence.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * The Class TrocmedocConfiguration.
 *
 * @author andriantomanga
 */
@Configuration
@ComponentScan(basePackages = "com.trocmedoc")
@EnableMongoRepositories(basePackages = "com.trocmedoc.persistence.repository")
@PropertySources({ @PropertySource("classpath:/com/trocmedoc/persistence/config/mongo.properties"),

		/* override propertie on production env */
		@PropertySource(value = "file:${trocmedoc_home}/config/mongo.properties", ignoreResourceNotFound = true) })
public class TrocmedocConfiguration extends AbstractMongoConfiguration {

	/** The env. */
	@Autowired
	Environment env;

	/* (non-Javadoc)
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#getDatabaseName()
	 */
	@Override
	protected String getDatabaseName() {

		return env.getProperty("db.name");
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#mongo()
	 */
	@Override
	public Mongo mongo() throws Exception {

		return new MongoClient(env.getProperty("db.host"), Integer.parseInt(env.getProperty("db.port")));
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#getMappingBasePackage()
	 */
	@Override
	protected String getMappingBasePackage() {

		return "com.trocmedoc";
	}

	/**
	 * Gets the mapper.
	 *
	 * @return the mapper
	 */
	@Bean
	protected Mapper getMapper() {

		return new DozerBeanMapper();
	}

}
