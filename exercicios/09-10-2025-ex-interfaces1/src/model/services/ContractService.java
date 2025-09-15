package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.sql.Date;
import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i); //função para adicionar meses

            double interest =

            double fee =

        }
//        Double paymentFee = onlinePaymentService.paymentFee(totalValue);
//        Double interest = onlinePaymentService.interest(totalValue, months);
//
//        Double amount = paymentFee + interest;

    }
}
