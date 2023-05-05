package view;

import model.Plant;
import model.dao.PlantDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PlantStatsChart extends JFrame {

    public PlantStatsChart() {
        PlantDAO plantDAO = new PlantDAO();
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();
        DefaultCategoryDataset lineDataset = new DefaultCategoryDataset();
        ArrayList<Plant> plantArrayList = (ArrayList<Plant>) plantDAO.findAll();

        int carnivorousCount = 0;
        int nonCarnivorousCount = 0;

        for (Plant plant : plantArrayList) {
            if (plant.isIs_carnivorous()) {
                carnivorousCount++;
            } else {
                nonCarnivorousCount++;
            }
            String name = plant.getName();
            int age = plant.getId();
            lineDataset.addValue(age, "Age", name);
        }

        pieDataset.setValue("Carnivorous Plants", carnivorousCount);
        pieDataset.setValue("Non-Carnivorous Plants", nonCarnivorousCount);

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Plant Stats",
                pieDataset,
                true,
                true,
                false
        );

        barDataset.addValue(carnivorousCount, "Plants", "Carnivorous Plants");
        barDataset.addValue(nonCarnivorousCount, "Plants", "Non-Carnivorous Plants");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Plant Stats",
                "Plant Type",
                "Number of Plants",
                barDataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        pieChart.setBackgroundPaint(Color.WHITE);
        PiePlot plot = (PiePlot) pieChart.getPlot();
        plot.setSectionPaint(0, Color.PINK);
        plot.setSectionPaint(1, Color.GREEN);

        barChart.getPlot().setBackgroundPaint(Color.YELLOW);

        ChartPanel pieChartPanel = new ChartPanel(pieChart);
        ChartPanel barChartPanel = new ChartPanel(barChart);

        this.setLayout(new GridLayout(1, 3)); // set layout to 1x3 grid
        this.add(pieChartPanel);
        this.add(barChartPanel);

        this.setTitle("Plant Stats Chart");
        this.setSize(1500, 500);
        this.setVisible(true);
    }
}