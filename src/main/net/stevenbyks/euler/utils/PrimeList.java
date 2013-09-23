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
	private Long k = 1L;
	private Boolean minusOne = true;

	public PrimeList() {
		list = new ArrayList<Long>();
		list.add(2L);
		list.add(3L);
	}

	public long currentLargestPrime() {
		return list.get(list.size() - 1);
	}

	@Override
	public Iterator<Long> iterator() {
		return new Itr();
	}

	public long findNextPrime() {
		long candidate = nextCandidate();

		Boolean isPrime = true;
		while (true) {
			for (long l : PrimeList.this.list) {
				if (candidate % l == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				PrimeList.this.list.add(candidate);
				break;
			}
			isPrime = true;
			candidate = nextCandidate();
		}
		return currentLargestPrime();
	}

	private long nextCandidate() {
		long candidate;
		if(this.minusOne) {
			candidate = 6L*this.k - 1L;
			this.minusOne = false;
		} else {
			candidate = 6L*this.k + 1L;
			++this.k;
			this.minusOne = true;
		}
		return candidate;
	}

	public long get(int index) {
		int iterations = index - list.size() + 1;
		while(iterations > 0) {
			findNextPrime();
			--iterations;
		}
		return list.get(index);
	}

	private class Itr implements Iterator<Long> {
		int cursor = 0;       // index of next element to return

		@Override
		public boolean hasNext() {
			return true;
		}

		private boolean actuallyHasNext() {
			return this.cursor < PrimeList.this.list.size();
		}

		@Override
		public Long next() {
			if(actuallyHasNext()) {
				int getPosition = cursor;
				++cursor;
				return PrimeList.this.list.get(getPosition);
			} else {
				PrimeList.this.findNextPrime();
				return next();
			}
		}

		@Override
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException();
		}
	}

}
