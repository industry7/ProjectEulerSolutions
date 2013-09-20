package net.stevenbyks.euler.utils;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/19/13
 * Time: 3:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrimeList implements Iterable<Long> {
	private List<Long> list;

	public PrimeList() {
		list = new ArrayList<Long>();
		list.add(2L);
	}

	public Long get(int index) {
		return this.list.get(index);
	}

	public int size() {
		return this.list.size();
	}

	public void add(Long l) {
		this.list.add(l);
	}

	@Override
	public Iterator<Long> iterator() {
		return new Itr();
	}

	private class Itr implements Iterator<Long> {
		int cursor = 0;       // index of next element to return

		@Override
		public boolean hasNext() {
			return this.cursor < PrimeList.this.list.size();
		}

		@Override
		public Long next() throws NoSuchElementException {
			if(hasNext()) {
				int getPosition = cursor;
				++cursor;
				return PrimeList.this.list.get(getPosition);
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}

		public void add(Long l) {
			PrimeList.this.list.add(l);
		}
	}

}
