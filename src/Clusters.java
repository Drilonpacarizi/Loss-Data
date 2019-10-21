import weka.core.Instances;
import weka.clusterers.*;
import weka.clusterers.SimpleKMeans;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Clusters {


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\DP\\IdeaProjects\\Space Apps\\Filled1.arff"));
        Instances in = new Instances(read);
        SimpleKMeans kmeans = new SimpleKMeans();
        kmeans.setSeed(30);
//        kmeans.setPreserveInstancesOrder(false);
        kmeans.setNumClusters(3);
        kmeans.buildClusterer(in);
        Instances centroids = kmeans.getClusterCentroids();
        System.out.println(centroids);
    }
}
