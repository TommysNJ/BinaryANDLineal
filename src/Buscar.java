public class Buscar {
    public int linearSearch(int[] arr, int target){
        long t1 = System.nanoTime();
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public int binarySearch(int[] arr, int target){
        int inicio = 0;
        int tope = arr.length - 1;
        while (inicio <= tope){
            int medio = inicio + (tope - inicio) / 2;

            if (target < arr[medio]){
                tope = medio - 1;
            } else if (target > arr[medio]){
                inicio = medio + 1;
            } else {
                return medio;
            }
        }
        return -1;
    }

    public int[] arrays (int size, int minValue, int maxValue){
        int[] arreglo = new int[size];

        for (int i = 0; i < size; i++) {

            arreglo[i] = minValue + i % (maxValue - minValue + 1);
        }
        return arreglo;
    }

    public long tiempoInical (long t1){
        t1 = System.nanoTime();
        return t1;
    }
    public long tiempoFinal (long t2){
        t2 = System.nanoTime();
        return t2;
    }

    public long tiempoTotal (long t1, long t2, long t3){
        t3 = tiempoFinal(t1) - tiempoInical(t2);
        return t3;
    }

}
