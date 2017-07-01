package com.trocmedoc.service;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * @author andriantomanga
 */
public interface MutableTrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto>
		extends ImmutableTrocmedocService<Document, Dto> {

	/**
	 * Save the document
	 * 
	 * @param document
	 *            the document to be saved
	 * @return the saved document
	 */
	Dto save(Dto document);

	/**
	 * Update the document
	 * 
	 * @param document
	 *            the document to be updated
	 * @return the updated document
	 */
	Dto update(Dto document);

	/**
	 * Delete the document
	 * 
	 * @param document
	 *            the document to be deleted
	 * @return the deleted document
	 */
	Dto delete(Dto document);

	/**
	 * Delete the document related to the given id
	 * 
	 * @param id
	 *            the id of the document
	 * @return the deleted document
	 */
	Dto deleteById(String id);

}
