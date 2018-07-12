package com.trocmedoc.service;

import java.util.List;
import java.util.stream.Collectors;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * The Class AbstractImmutableTrocmedocService.
 *
 * @author andriantomanga
 * @param <Document> the generic type
 * @param <Dto> the generic type
 */
public abstract class AbstractImmutableTrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto>
		extends AbstractTrocmedocService<Document, Dto> implements ImmutableTrocmedocService<Document, Dto> {

	/* (non-Javadoc)
	 * @see com.trocmedoc.service.ImmutableTrocmedocService#findById(java.lang.String)
	 */
	@Override
	public Dto findById(String id) {

		return convertToDto(getRepository().findOne(id));
	}

	/* (non-Javadoc)
	 * @see com.trocmedoc.service.ImmutableTrocmedocService#findAll()
	 */
	@Override
	public List<Dto> findAll() {

		return getRepository().findAll().stream().map(x -> convertToDto(x)).collect(Collectors.toList());
	}

}
