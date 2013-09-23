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

	public List<Long> sieve(int findAllPrimesBelowThisNumber) {
		// plus 1 for index offset, plus another 1 for the stopping condiiton
		byte[] sieve = new byte[findAllPrimesBelowThisNumber+2];
		sieve[0] = 1;
		sieve[1] = 1;
		List<Long> list = new ArrayList<Long>();
		int currentPrime = 2;
		while(currentPrime < findAllPrimesBelowThisNumber) {
			//System.out.println(currentPrime);
			list.add( (long) currentPrime );
			for(int i = currentPrime*2; i < findAllPrimesBelowThisNumber; i+=currentPrime) {
				sieve[i] = 1;
			}
			++currentPrime;
			while(sieve[currentPrime] == 1) {
				++currentPrime;
			}
		}
		return list;
	}

}
