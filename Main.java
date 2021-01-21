import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Main {

    public static void main(String[] args) throws Exception {
        // Specifying the datasource
        DataSource dataSource = new DataSource("data.arff");
        // Loading the dataset
        Instances dataInstances = dataSource.getDataSet();
        // Displaying the number of instances
        log.info("The number of loaded instances is: " + dataInstances.numInstances());

        log.info("data:" + dataInstances.toString());
        
        // Statement 1 is executed (one time) before the execution of the code block.

        // Statement 2 defines the condition for executing the code block.

        // Statement 3 is executed (every time) after the code block has been executed.

        // The example below will print the numbers 0 to 4:
        for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

    }
}
