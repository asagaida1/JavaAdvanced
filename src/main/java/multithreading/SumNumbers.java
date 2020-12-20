package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {
    private static long value = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResult = new ArrayList<>();
        long valueDivideBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDivideBy10 * i + 1;
            long to = valueDivideBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            futureResult.add(futurePartSum);
        }

        for (Future<Long> result : futureResult) {
            sum += result.get();
        }
        executorService.shutdown();
        System.out.println("Total sum" + sum);
    }
}

class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {

        for (long i = from; i <= to; i++) {
            localSum += i;
        }

        System.out.println("Sum from " + from + " to " + to + " = " + localSum);
        return localSum;
    }
}
