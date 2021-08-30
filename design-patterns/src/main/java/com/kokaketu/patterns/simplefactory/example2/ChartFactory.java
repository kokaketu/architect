package com.kokaketu.patterns.simplefactory.example2;

/**
 * @Description 统计图工厂
 * @Author ghj
 * @Date 2021/8/30 3:05 下午
 */
public class ChartFactory {
    public static final int FLAG_LINE_CHART = 0;
    public static final int FLAG_PIE_CHART = 1;
    public static final int FLAG_HISTOGRAM_CHART = 2;

    public static Chart getChart(int flag) {
        switch (flag) {
            case FLAG_LINE_CHART:
                return new LineChart();
            case FLAG_PIE_CHART:
                return new PieChart();
            case FLAG_HISTOGRAM_CHART:
                return new Histogram();
            default:
                return null;
        }
    }
}
