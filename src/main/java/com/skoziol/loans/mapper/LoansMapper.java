package com.skoziol.loans.mapper;

import com.skoziol.loans.dto.LoansDto;
import com.skoziol.loans.entity.Loans;

public class LoansMapper {

    public static LoansDto mapToLoansDto(Loans loans) {
        return new LoansDto(
                loans.getMobileNumber(),
                loans.getLoanNumber(),
                loans.getLoanType(),
                loans.getTotalLoan(),
                loans.getAmountPaid(),
                loans.getOutstandingAmount()
        );
    }

    public static Loans mapToLoans(LoansDto loansDto, Loans loans) {
        loans.setLoanNumber(loansDto.loanNumber());
        loans.setLoanType(loansDto.loanType());
        loans.setMobileNumber(loansDto.mobileNumber());
        loans.setTotalLoan(loansDto.totalLoan());
        loans.setAmountPaid(loansDto.amountPaid());
        loans.setOutstandingAmount(loansDto.outstandingAmount());
        return loans;
    }
}
