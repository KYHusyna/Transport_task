package Com.Output_data;

import Com.InputData.CreateStorages;

public class OutputData {
    private CreateStorages storages = new CreateStorages();
    private int[] order,
            storageBalances;

    private String[] supermarket,
            storage;

    public void matrixOutput(int[][] matrix, String kindOfMatrix) {
        order = storages.getOrder();
        storageBalances = storages.getStorageBalance();
        supermarket = storages.getSupermarket();
        storage = storages.getStorage();

        System.out.println("\n------Matrix " + kindOfMatrix + "------");
        for (int i = 0; i < matrix[0].length; i++)
            System.out.print(supermarket[i] + " ");

        System.out.println();
        for (int i = 0; i < matrix[0].length; i++)
            System.out.print(order[i] + " ");

        System.out.println("\n----");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(storage[i] + " " + storageBalances[i] + " |");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
