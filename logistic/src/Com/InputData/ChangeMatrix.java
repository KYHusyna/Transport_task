package Com.InputData;

public class ChangeMatrix {

    private MatrixCost matrixCost = new MatrixCost();
    private CreateStorages storages = new CreateStorages();

    public void change_matrix(int difference, int kind, int[] values, String[] names) {
        int[][] newDeliveryMatrix,
                oldMatrixCost = matrixCost.getMatrixCost();

        String fictive;

        if (kind == 0) {
            newDeliveryMatrix = new int[oldMatrixCost.length][oldMatrixCost[0].length + 1];
            fictive = "supermarket";
        } else {
            newDeliveryMatrix = new int[oldMatrixCost.length + 1][oldMatrixCost[0].length];
            fictive = "storage";
        }

        int[] temp_storage = new int[values.length + 1];
        String[] temp_name = new String[names.length + 1];

        for (int i = 0; i < temp_storage.length; i++) {

            if (i == (temp_storage.length - 1)) {
                temp_storage[i] = difference;
                temp_name[i] = "Fictive_" + fictive;

            } else {
                temp_storage[i] = values[i];
                temp_name[i] = names[i];
            }
        }

        if (kind == 0) {
            storages.setOrder(temp_storage);
            storages.setSupermarket(temp_name);
        } else {
            storages.setStorageBalance(temp_storage);
            storages.setStorage(temp_name);
        }

        for (int i = 0; i < newDeliveryMatrix.length; i++) {
            for (int j = 0; j < newDeliveryMatrix[0].length; j++) {
                switch (kind) {
                    case 0:
                        if (j == newDeliveryMatrix[0].length - 1)
                            newDeliveryMatrix[i][j] = 0;
                        else newDeliveryMatrix[i][j] = oldMatrixCost[i][j];
                        break;

                    case 1:
                        if (i == newDeliveryMatrix.length - 1)
                            newDeliveryMatrix[i][j] = 0;
                        else newDeliveryMatrix[i][j] = oldMatrixCost[i][j];
                }
            }
        }
        matrixCost.setMatrixCost(newDeliveryMatrix);
    }
}
