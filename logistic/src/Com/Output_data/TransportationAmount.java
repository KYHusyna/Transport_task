package Com.Output_data;

public class TransportationAmount {

    public int getTransportationAmount(int[][] matrixDelivery, int[][] matrixCost) {
        int transportationAmount = 0;

        for (int i = 0; i < matrixDelivery.length; i++) {
            for (int j = 0; j < matrixDelivery[0].length; j++) {
                if (matrixDelivery[i][j] != 0)
                    transportationAmount += matrixDelivery[i][j] * matrixCost[i][j];
            }
        }
        System.out.println("transportation amount:" + transportationAmount);
        return transportationAmount;
    }
}
