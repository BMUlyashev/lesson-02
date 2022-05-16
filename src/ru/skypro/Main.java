package ru.skypro;

public class Main {
    public static void main(String[] args) {
        byte byteVariable = 1;
        short shortVariable = 200;
        int intVariable = 1000;
        long longVariable = 456L;

        float floatVariable = 1.5f;
        double doubleVariable = 45.6;

        char charVariable = '!';
        boolean boolVariable = true;

        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + totalBoxerWeight + " кг.");

        float differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров " + differenceBoxersWeight + " кг.");
        System.out.println();

        int bananasAmount = 5;
        int bananaOnePieceWeight = 80;

        int milkAmountInMilliliters = 200;
        int milkOneHundredMillilitersWeight = 105;

        int iceCreamBriquetteAmount = 2;
        int iceCreamOneBriquetteWeight = 100;

        int eggAmount = 4;
        int eggOnePieceWeight = 70;

        int bananasWeight = bananasAmount * bananaOnePieceWeight;
        float milkWeightInGrams = (milkOneHundredMillilitersWeight / 100f) * milkAmountInMilliliters;
        int iceCreamWeight = iceCreamBriquetteAmount * iceCreamOneBriquetteWeight;
        int eggWeight = eggAmount * eggOnePieceWeight;

        float breakfastWeightInGrams = bananasWeight + milkWeightInGrams + iceCreamWeight + eggWeight;
        float breakfastWeightInKilograms = breakfastWeightInGrams / 1000f;
        System.out.println("Вес завтрака " + breakfastWeightInKilograms + " кг");
        System.out.println();

        int weightToLoseInKilograms = 7;
        int firstDietPerDay = 250;
        int secondDietPerDay = 500;
        int daysAmountFirstDiet = (weightToLoseInKilograms * 1000) / firstDietPerDay;
        int daysAmountSecondDiet = (weightToLoseInKilograms * 1000) / secondDietPerDay;
        int daysAmountAverageDiet = (daysAmountFirstDiet + daysAmountSecondDiet) / 2;
        System.out.println("При потере веса " + firstDietPerDay + " гр в день уйдет " +
                daysAmountFirstDiet + " дней.");
        System.out.println("При потере веса " + secondDietPerDay + " гр в день уйдет " +
                daysAmountSecondDiet + " дней.");
        System.out.println("В среднем может потребоваться " + daysAmountAverageDiet);
        System.out.println();

        float mashaSalary = 67_760f;
        float denisSalary = 83_690f;
        float kristinaSalary = 76_230f;

        float mashaNewSalary = mashaSalary * 1.1f;
        float denisNewSalary = denisSalary * 1.1f;
        float kristinaNewSalary = kristinaSalary * 1.1f;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " +
                (mashaNewSalary - mashaSalary) + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " +
                (denisNewSalary - denisSalary) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " +
                (kristinaNewSalary - kristinaSalary) + " рублей.");

        mashaSalary = mashaNewSalary;
        denisSalary = denisNewSalary;
        kristinaSalary = kristinaNewSalary;
    }
}