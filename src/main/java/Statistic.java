public class Statistic {

    private int rejectedCount;
    private double rejectedPercentage;
    private double avgTimePerClient;
    private int avgQueueSize;
    private int clientsSize;

    public Statistic() {
    }

    public int getRejectedCount() {
        return rejectedCount;
    }

    public void setRejectedCount(int rejectedCount) {
        this.rejectedCount = rejectedCount;
    }

    public double getRejectedPercentage() {
        return rejectedPercentage;
    }

    public void setRejectedPercentage(double rejectedPercentage) {
        this.rejectedPercentage = rejectedPercentage;
    }

    public double getAvgTimePerClient() {
        return avgTimePerClient;
    }

    public void setAvgTimePerClient(double avgTimePerClient) {
        this.avgTimePerClient = avgTimePerClient;
    }

    public int getAvgQueueSize() {
        return avgQueueSize;
    }

    public void setAvgQueueSize(int avgQueueSize) {
        this.avgQueueSize = avgQueueSize;
    }

    public int getClientsSize() {
        return clientsSize;
    }

    public void setClientsSize(int clientsSize) {
        this.clientsSize = clientsSize;
    }

    @Override
    public String toString() {
        return "\n• Clients served: " + clientsSize
                + "\n• Rejected: " + rejectedCount + ", Percentage: " + rejectedPercentage
                + "\n• Avg time per client: " + avgTimePerClient
                + "\n• Avg queue size: " + avgQueueSize
                + "\n";
    }
}
