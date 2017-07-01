package com.trocmedoc.service;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * @author andriantomanga
 */
public abstract class AbstractMutableTrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto>
		extends AbstractImmutableTrocmedocService<Document, Dto> implements MutableTrocmedocService<Document, Dto> {

	@Override
	public Dto save(Dto dto) {

		final Document document = convertToDocument(dto);
		if (null != document) {

			return convertToDto(getRepository().save(document));
		}
		return null;
	}

	@Override
	public Dto update(Dto dto) {
		// will update if exists ...
		return save(dto);
	}

	@Override
	public Dto delete(Dto document) {

		if (null != document) {
			if (document instanceof AbstractDto) {
				return deleteById(((AbstractDto) document).getId());
			}
		}
		return null;
	}

	@Override
	public Dto deleteById(String id) {

		final Document document = getRepository().findOne(id);
		if (document != null) {

			getRepository().delete(document);
			return convertToDto(document);
		}
		return null;
	}

}
