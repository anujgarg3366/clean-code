package org.example.basic;

import java.time.LocalDate;

interface Edible{
    boolean isEdible();
}

public class FoodItems implements Edible {

    private LocalDate expirationDate;
    private Boolean isApprovedForConsumption;
    private Integer inspectorId;

    public FoodItems(LocalDate expirationDate, Boolean approvedForConsumption, Integer inspectorId) {
        this.expirationDate = expirationDate;
        this.isApprovedForConsumption = approvedForConsumption;
        this.inspectorId = inspectorId;
    }
    @Override
    public boolean isEdible() {
        if (this.expirationDate.isAfter(LocalDate.now()) &&
                this.isApprovedForConsumption == true &&
                this.inspectorId != null) {
            return true;
        } else {
            return false;
        }
    }
}
