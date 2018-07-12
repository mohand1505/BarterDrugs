/**
 * 
 */
package com.trocmedoc.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * The Interface TrocmedocService.
 *
 * @author andriantomanga
 * @param <Document> the generic type
 * @param <Dto> the generic type
 */
public interface TrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto> {

	/**
	 * Gets the repository.
	 *
	 * @return the repository
	 */
	MongoRepository<Document, String> getRepository();

	/**
	 * Convert to dto.
	 *
	 * @param document the document
	 * @param targetClass the target class
	 * @return the dto
	 */
	Dto convertToDto(Document document, Class<Dto> targetClass);

	/**
	 * Convert to document.
	 *
	 * @param dto the dto
	 * @param targetClass the target class
	 * @return the document
	 */
	Document convertToDocument(Dto dto, Class<Document> targetClass);

	/**
	 * Convert to dto.
	 *
	 * @param document the document
	 * @return the dto
	 */
	Dto convertToDto(Document document);

	/**
	 * Convert to document.
	 *
	 * @param dto the dto
	 * @return the document
	 */
	Document convertToDocument(Dto dto);
}
