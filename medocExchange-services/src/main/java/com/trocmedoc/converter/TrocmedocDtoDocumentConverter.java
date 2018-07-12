/**
 * 
 */
package com.trocmedoc.converter;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * The Interface TrocmedocDtoDocumentConverter.
 *
 * @author andriantomanga
 * @param <Dto> the generic type
 * @param <Document> the generic type
 */
public interface TrocmedocDtoDocumentConverter<Dto extends AbstractDto, Document extends TrocmedocDocument> {

	/**
	 * Convert.
	 *
	 * @param dto the dto
	 * @return the document
	 */
	Document convert(Dto dto);
}
