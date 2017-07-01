/**
 * 
 */
package com.trocmedoc.converter;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * @author andriantomanga
 */
public interface TrocmedocDtoDocumentConverter<Dto extends AbstractDto, Document extends TrocmedocDocument> {

	Document convert(Dto dto);
}
