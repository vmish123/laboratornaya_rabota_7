import java.util.*;

public class PrimesGenerator implements Iterable<Integer>{
    private int count;

    public PrimesGenerator(int count) {
        this.count = count;
    }

    private boolean checkPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private class PrimesIterator implements Iterator<Integer>{

        private int found = 0;
        private int primeCandidate = 1;

        @Override
        public boolean hasNext() {
            return found < count;
        }

        @Override
        public Integer next() {
            while (true){
                primeCandidate++;
                if (checkPrime(primeCandidate)) {
                    found++;
                    return primeCandidate;
                }
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimesIterator();
    }
}