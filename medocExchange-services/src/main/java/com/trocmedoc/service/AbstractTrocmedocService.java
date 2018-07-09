package com.trocmedoc.service;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.trocmedoc.common.documents.TrocmedocDocument;
import com.trocmedoc.common.dto.AbstractDto;

public abstract class AbstractTrocmedocService<Document extends TrocmedocDocument, Dto extends AbstractDto>
		implements TrocmedocService<Document, Dto> {

	@Autowired
	protected Mapper trocmedocMapper;

	/**
	 * 
	 * @param document
	 * @param targetClass
	 * @return
	 */
	@Override
	public Dto convertToDto(Document document, Class<Dto> targetClass) {

		return trocmedocMapper.map(document, targetClass);
	}

	/**
	 * 
	 * @param dto
	 * @param targetClass
	 * @return
	 */
	@Override
	public Document convertToDocument(Dto dto, Class<Document> targetClass) {

		return trocmedocMapper.map(dto, targetClass);
	}

}
