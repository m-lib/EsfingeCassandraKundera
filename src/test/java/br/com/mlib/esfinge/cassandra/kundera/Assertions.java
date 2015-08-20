package br.com.mlib.esfinge.cassandra.kundera;

import static org.junit.Assert.assertEquals;

import org.esfinge.querybuilder.QueryBuilder;
import org.junit.Test;

import br.com.mlib.esfinge.cassandra.kundera.dao.UserDAO;

public class Assertions {
	
	@Test
	public void selectAll() throws Exception {
		UserDAO dao = QueryBuilder.create(UserDAO.class);
		assertEquals(3, dao.getUser().size());
	}

}
