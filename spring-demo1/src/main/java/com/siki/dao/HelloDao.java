package com.siki.dao;

import org.springframework.stereotype.Repository;

/**
 * @author robert
 */
@Repository
public class HelloDao {

	public void hello() {
		System.out.println("hello world");
	}

}
