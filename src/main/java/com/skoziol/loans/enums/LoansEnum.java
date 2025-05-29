package com.skoziol.loans.enums;

public enum LoansEnum {

    STATUS_200("200"),
    STATUS_201("201"),
    STATUS_417("417"),
    MESSAGE_200("Request processed successfully"),
    MESSAGE_201("Loan created successfully"),
    MESSAGE_417_UPDATE("Update operation failed. Please try again or contact Dev team"),
    MESSAGE_417_DELETE("Delete operation failed. Please try again or contact Dev team");

    public final String label;

    LoansEnum(String label) {
        this.label = label;
    }

}
