package Hotel.Reservation.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CustomCacheServiceSimpleInMemory <T> implements CustomCacheService<T> {
	
	private Set<T> cache = new HashSet<T>();
	
	public CustomCacheServiceSimpleInMemory(Set<T> cache) {
		super();
		this.cache = cache;
	}
	public CustomCacheServiceSimpleInMemory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCache(Set<T> cache) {
		this.cache = cache;
	}
	
	@Override
	public void addToCache(T obj) {
		cache.add(obj);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromCache(T obj) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public T retrieveItem(T obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emptyCache() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateFromCache(T org, T upd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> retrieveAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> retrieveMatching(Predicate <T> p) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	/*
	T myField;
	public T myMethod (T myParam, U myParam2) {
		U stuff=myParam2;
		return myParam;
	}*/
}
