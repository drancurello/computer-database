package com.excilys.computerDatabase.dao;

import java.sql.Connection;
import java.util.List;

import com.excilys.computerDatabase.persistence.ConnectionMySQL;

public interface CrudService<T> {

	public Connection connection = ConnectionMySQL.getInstance();

	public abstract T add(T obj);

	public abstract T update(T obj);

	public abstract int delete(int id);

	public abstract T find(int id);

	public abstract List<T> findAll();

	public abstract List<T> findPage(int nPage, int nComputer);

}
