package gr.athtech.daem.service;

import gr.athtech.daem.domain.BaseModel;

import java.util.List;

public interface BaseService<T extends BaseModel> {
	T create(final T entity);

	List<T> createAll(final T[] entities);

	List<T> createAll(final List<T> entities);

	void update(T entity);

	void delete(T entity);

	void deleteById(Long id);

	boolean exists(T entity);

	T get(Long id);

	List<T> findAll();
}
