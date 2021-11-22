public class Main {

    public static void main(String[] args) throws Exception {
//        OneModel();
        FiveModels();
    }

    public static void OneModel() {
        StatisticCollector statistic1 = new StatisticCollector();

        Model model1 = new Model(1, statistic1);
        model1.start();

        try {
            model1.join();
            System.out.println("Model 1: \n" + statistic1.collect());
        } catch (Exception e) {}
    }

    public static void FiveModels() {
        StatisticCollector statistic1 = new StatisticCollector();
        StatisticCollector statistic2 = new StatisticCollector();
        StatisticCollector statistic3 = new StatisticCollector();
        StatisticCollector statistic4 = new StatisticCollector();
        StatisticCollector statistic5 = new StatisticCollector();


        Model model1 = new Model(1, statistic1);
        Model model2 = new Model(2, statistic2);
        Model model3 = new Model(3, statistic3);
        Model model4 = new Model(1, statistic4);
        Model model5 = new Model(2, statistic5);

        model1.start();
        model2.start();
        model3.start();
        model4.start();
        model5.start();

        try {
            model1.join();
            System.out.println("\nFinal Model 1:" + statistic1.collect());

            model2.join();
            System.out.println("\nFinal Model 2:" + statistic2.collect());

            model3.join();
            System.out.println("\nFinal Model 3:" + statistic3.collect());

            model4.join();
            System.out.println("\nFinal Model 4:" + statistic4.collect());

            model5.join();
            System.out.println("\nFinal Model 5:" + statistic5.collect());

        } catch (Exception e) {}
    }
}
