package net.stevenbyks.euler.utils;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sbyks
 * Date: 9/18/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Prime {
	private PrimeList listOfPrimes;

	public Prime() {
		listOfPrimes = new PrimeList();
	}

	public long findNextPrime() {
		long candidate = listOfPrimes.get(listOfPrimes.size() - 1) + 1;
		Boolean isPrime = true;
		while (true) {
			for (long l : listOfPrimes) {
				if (candidate % l == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				listOfPrimes.add(candidate);
				break;
			}
			isPrime = true;
			++candidate;
		}
		return listOfPrimes.get(listOfPrimes.size() - 1);
	}

	public long findNextPrimeLargerThan(long target) {
		long currentLargestPrime = listOfPrimes.get(listOfPrimes.size() - 1);
		if (target >= currentLargestPrime) {
			long newLargestPrime = findNextPrime();
			while (newLargestPrime < target) {
				newLargestPrime = findNextPrime();
			}
			return newLargestPrime;
		} else {
			long temp = listOfPrimes.get(0);
			for (int n = 1; n < listOfPrimes.size(); ++n) {
				if (temp > target) {
					return temp;
				}
			}
		}
		//this should never happen
		return 0L;
	}

	public long currentLargestPrime() {
		return listOfPrimes.get(listOfPrimes.size() - 1);
	}

	public Map<Long, Long> primeFactors(long target) {
		Map<Long, Long> primeFactors = new HashMap<Long, Long>();
		if (target <= 1) {
			return primeFactors;
		}

		Iterator<Long> iter = listOfPrimes.iterator();
		long currentPrime = iter.next();
		while (target > 1L) {

			if (target % currentPrime == 0) {
				target /= currentPrime;
				if (primeFactors.containsKey(currentPrime)) {
					long currentExponent = primeFactors.get(currentPrime);
					++currentExponent;
					primeFactors.put(currentPrime, currentExponent);
				} else {
					primeFactors.put(currentPrime, 1L);
				}
			} else {
				if (!iter.hasNext()) {
					findNextPrimeLargerThan(currentPrime);
				}
				currentPrime = iter.next();
			}

		}
		return primeFactors;
	}

	public Map<Long, Long> leastCommonMultiple(final Map<Long, Long> one, final Map<Long, Long> two) {
		Set<Long> keySetOne = one.keySet();
		Set<Long> keySetTwo = two.keySet();
		Set<Long> combinedKeySet = new HashSet<Long>();
		combinedKeySet.addAll(keySetOne);
		combinedKeySet.addAll(keySetTwo);

		Map<Long, Long> lcm = new HashMap<Long, Long>();

		for (Long l : combinedKeySet) {
			if (keySetOne.contains(l) && keySetTwo.contains(l)) {
				if (one.get(l) > two.get(l)) {
					lcm.put(l, one.get(l));
				} else {
					lcm.put(l, two.get(l));
				}
			} else if (keySetOne.contains(l)) {
				lcm.put(l, one.get(l));
			} else if (keySetTwo.contains(l)) {
				lcm.put(l, two.get(l));
			} else {
				// should throw an exception here b/c something wierd happened
			}
		}

		return lcm;
	}

}
