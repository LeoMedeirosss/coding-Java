package util;

import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GeradorGraficos {
    private SistemaGestaoOngs sistema;

    public GeradorGraficos(SistemaGestaoOngs sistema) {
        this.sistema = sistema;
    }

    public void gerarGraficoOngsPopulares(int quantidade) {
        Map<String, Integer> dadosOngsPopulares = sistema.dadosOngsPopulares(quantidade);

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String ong : dadosOngsPopulares.keySet()) {
            int popularidade = dadosOngsPopulares.get(ong);
            dataset.addValue(popularidade, "Popularidade", ong);
        }
        
        JFreeChart chart = ChartFactory.createBarChart(
                "ONGs Mais Populares",
                "ONGs",
                "Popularidade",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                true,
                false
        );

        ChartFrame frame = new ChartFrame("Gráfico", chart);
        frame.pack();
        frame.setVisible(true);
    }
}