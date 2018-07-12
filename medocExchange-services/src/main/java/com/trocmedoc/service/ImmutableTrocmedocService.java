/**
 * 
 */
package com.trocmedoc.service;

import java.util.List;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * The Interface ImmutableTrocmedocService.
 *
 * @author andriantomanga
 * @param <Document> the generic type
 * @param <Dto> the generic type
 */
public interface ImmutableTrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto>
		extends TrocmedocService<Document, Dto> {

	/**
	 * Find the document related to the given id.
	 *
	 * @param id            the id
	 * @return the document
	 */
	Dto findById(String id);

	/**
	 * Find all saved documents.
	 *
	 * @return the documents
	 */
	List<Dto> findAll();
}
