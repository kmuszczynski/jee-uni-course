package compute;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Compute {
    private DescriptiveStatistics stats = new DescriptiveStatistics();

    public Compute(double[] inputArray) {
        for( int i = 0; i < inputArray.length; i++) {
            stats.addValue(inputArray[i]);
        }
    }

    public String calculateStaticalValues() {
        double mean = stats.getMean();
        double std = stats.getStandardDeviation();
        double var = stats.getVariance();

        return "Mean: " + mean + " Standard Deviation: " + std + " Variance: " + var;
    }

    public static void main(String[] args) {
        double[] data = {1, 2, 3, 4, 5};
        Compute compute = new Compute(data);
        System.out.println(compute.calculateStaticalValues());
    }

}
