package com.trocmedoc.converter;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * The Interface TrocmedocDocumentDtoConverter.
 *
 * @author andriantomanga
 * @param <Document> the generic type
 * @param <Dto> the generic type
 */
public interface TrocmedocDocumentDtoConverter<Document extends TrocmedocDocument, Dto extends AbstractDto> {

	/**
	 * Convert.
	 *
	 * @param document the document
	 * @return the dto
	 */
	Dto convert(TrocmedocDocument document);
}
