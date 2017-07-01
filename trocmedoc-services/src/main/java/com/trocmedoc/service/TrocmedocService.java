/**
 * 
 */
package com.trocmedoc.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * @author andriantomanga
 */
public interface TrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto> {

	/**
	 * @return the repository
	 */
	MongoRepository<Document, String> getRepository();

	/**
	 * 
	 * @param document
	 * @param targetClass
	 * @return
	 */
	Dto convertToDto(Document document, Class<Dto> targetClass);

	/**
	 * 
	 * @param dto
	 * @param targetClass
	 * @return
	 */
	Document convertToDocument(Dto dto, Class<Document> targetClass);

	/**
	 * 
	 * @param document
	 * @return
	 */
	Dto convertToDto(Document document);

	/**
	 * 
	 * @param dto
	 * @return
	 */
	Document convertToDocument(Dto dto);
}
