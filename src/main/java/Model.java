import java.util.concurrent.*;

public class Model extends Thread {

    private int modelId;
    private StatisticCollector statistic;

    public Model(int modelId, StatisticCollector statistic) {
        this.modelId = modelId;
        this.statistic = statistic;
    }

    @Override
    public void run() {
        ExecutorService executor = Executors.newFixedThreadPool(Constants.CASH_REGISTER_COUNT);
        Queue queue = new Queue();

        ClientProducer clientProducer = new ClientProducer(queue, executor, statistic, modelId);
        clientProducer.start();

        CashRegister cashRegister = new CashRegister(executor, queue, statistic);
        cashRegister.start();

        DynamicStatistics dynamicStatistics = new DynamicStatistics(statistic, executor, modelId);
        dynamicStatistics.start();

        try {
            clientProducer.join();
            cashRegister.join();
            dynamicStatistics.join();
        } catch (Exception e){

        }
    }
}
