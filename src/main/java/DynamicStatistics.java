import java.util.concurrent.ExecutorService;

public class DynamicStatistics extends Thread{

    private StatisticCollector statisticCollector;
    private ExecutorService executor;
    private int modelId;

    public DynamicStatistics(StatisticCollector statisticCollector, ExecutorService executor, int modelId) {
        this.statisticCollector = statisticCollector;
        this.executor = executor;
        this.modelId = modelId;
    }

    @Override
    public void run() {
        while (!executor.isShutdown()) {
            try {
                Thread.sleep(1000);
                System.out.println("\nDynamic Model: " + modelId +  statisticCollector.collectTemporal());
            } catch (Exception e) {}
        }
    }

}
