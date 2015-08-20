package br.com.mlib.esfinge.cassandra.kundera.dao;

import java.util.Collection;

import org.esfinge.querybuilder.Repository;

import br.com.mlib.esfinge.cassandra.kundera.entities.User;

public interface UserDAO extends Repository<User> {

	public Collection<User> getUser();
	
}
