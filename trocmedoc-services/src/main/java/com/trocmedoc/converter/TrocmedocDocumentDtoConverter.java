package com.trocmedoc.converter;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * @author andriantomanga
 */
public interface TrocmedocDocumentDtoConverter<Document extends TrocmedocDocument, Dto extends AbstractDto> {

	Dto convert(TrocmedocDocument document);
}
