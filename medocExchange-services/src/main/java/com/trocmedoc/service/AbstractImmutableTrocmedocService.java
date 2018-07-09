package com.trocmedoc.service;

import java.util.List;
import java.util.stream.Collectors;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * @author andriantomanga
 */
public abstract class AbstractImmutableTrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto>
		extends AbstractTrocmedocService<Document, Dto> implements ImmutableTrocmedocService<Document, Dto> {

	@Override
	public Dto findById(String id) {

		return convertToDto(getRepository().findOne(id));
	}

	@Override
	public List<Dto> findAll() {

		return getRepository().findAll().stream().map(x -> convertToDto(x)).collect(Collectors.toList());
	}

}
