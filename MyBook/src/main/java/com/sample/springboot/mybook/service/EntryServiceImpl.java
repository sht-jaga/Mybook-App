package com.sample.springboot.mybook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.springboot.mybook.entity.Entry;
import com.sample.springboot.mybook.repository.EntryRepository;

@Service
public class EntryServiceImpl implements EntryService {
	
	@Autowired
	private EntryRepository entryRepository;

	@Override
	public Entry saveEntry(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public Entry updateEntry(Entry entry) {
		return entryRepository.save(entry);
	}

	@Override
	public void deleteEntry(Entry entry) {
		entryRepository.delete(entry);
	}

	@Override
	public Entry findById(long id) {
		return entryRepository.findById(id).get();
	}

	@Override
	public List<Entry> findAll() {
		return entryRepository.findAll();
	}

	@Override
	public List<Entry> findByUserid(long id) {
	
		return entryRepository.findByUserid(id);
	}

}

