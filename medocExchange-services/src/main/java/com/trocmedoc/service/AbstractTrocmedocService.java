package com.trocmedoc.service;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

/**
 * The Class AbstractTrocmedocService.
 *
 * @param <Document> the generic type
 * @param <Dto> the generic type
 */
public abstract class AbstractTrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto>
		implements TrocmedocService<Document, Dto> {

	/** The trocmedoc mapper. */
	@Autowired
	protected Mapper trocmedocMapper;

	/**
	 * Convert to dto.
	 *
	 * @param document the document
	 * @param targetClass the target class
	 * @return the dto
	 */
	@Override
	public Dto convertToDto(Document document, Class<Dto> targetClass) {

		return trocmedocMapper.map(document, targetClass);
	}

	/**
	 * Convert to document.
	 *
	 * @param dto the dto
	 * @param targetClass the target class
	 * @return the document
	 */
	@Override
	public Document convertToDocument(Dto dto, Class<Document> targetClass) {

		return trocmedocMapper.map(dto, targetClass);
	}

}
