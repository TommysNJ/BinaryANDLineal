import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JPanel panel1;
    private JButton ejecutarButton;
    private JTextArea areaEjecutar;
    private Buscar b = new Buscar();
    private int target = 888;

    public Interfaz(){
        setContentPane(panel1);
        ejecutarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int array1[] = b.arrays(10001,0,10000);
                int array2[] =b.arrays(1001,0,1000);
                int array3[] =b.arrays(101,0,100);

                long tInicio1= System.nanoTime();
                b.linearSearch(array1,target);
                long tFinal1 = System.nanoTime();
                long total1 = tFinal1-tInicio1;
                areaEjecutar.append("Arreglo de 10001 - Búsqueda lineal : "+ total1+"\n");


                long tInicio2 = System.nanoTime();
                b.binarySearch(array1,target);
                long tFinal2 = System.nanoTime();
                long total2 = tFinal2-tInicio2;
                areaEjecutar.append("Arreglo de 1001 - Búsqueda binaria : "+ total2+"\n");

                //SEGUNDO ARREGLO DE 1000000
                long tInicio3 = System.nanoTime();
                b.linearSearch(array2,target);
                long tFinal3 = System.nanoTime();
                long total3 = tFinal3-tInicio3;
                areaEjecutar.append("Arreglo de 100; Búsqueda lineal: "+total3+"\n");

                long tInicio4 = System.nanoTime();
                b.binarySearch(array2,target);
                long tFinal4 = System.nanoTime();
                long total4 = tFinal4-tInicio4;
                areaEjecutar.append("Arreglo de 100 - Búsqueda lineal: "+total4+"\n");

                //TERCER ARREGLO DE 10000000
                long tInicio5 = System.nanoTime();
                b.linearSearch(array3,target);
                long tFinal5 = System.nanoTime();
                long total5 = tFinal5-tInicio5;
                areaEjecutar.append("Arreglo de 1000000; busqueda lineal: "+total5+"\n");

                long tInicio6 = System.nanoTime();
                b.binarySearch(array3,target);
                long tFinal6 = System.nanoTime();
                long total6 = tFinal6-tInicio6;
                areaEjecutar.append("Arreglo de 1000000; busqueda lineal: "+total6+"\n");
            }
        });
    }
}