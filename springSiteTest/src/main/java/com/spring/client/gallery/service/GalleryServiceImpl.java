package com.spring.client.gallery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.client.gallery.dao.GalleryDao;
import com.spring.client.gallery.vo.GalleryVO;

@Service
@Transactional
public class GalleryServiceImpl implements GalleryService {
	private Logger log = LoggerFactory.getLogger(GalleryServiceImpl.class);

	@Autowired
	private GalleryDao galleryDao;

	// 글 목록 구현
	@Override
	public List<GalleryVO> galleryList() {
		List<GalleryVO> myList = null;
		myList = galleryDao.galleryList();
		return myList;
	}

	// 글 입력 구현
	@Override
	public int galleryInsert(GalleryVO gvo) {
		int result = 0;
		try {
			result = galleryDao.galleryInsert(gvo);
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
}
